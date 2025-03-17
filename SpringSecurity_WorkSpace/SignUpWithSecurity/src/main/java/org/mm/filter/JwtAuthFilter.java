package org.mm.filter;

import java.io.IOException;

import org.mm.entities.UserTableEntity;
import org.mm.service.JwtService;
import org.mm.service.SignUpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthFilter extends OncePerRequestFilter 
{
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private SignUpUserService userService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException 
	{
		final String requestTokenHeader = request.getHeader("Authorization");
		
		if(requestTokenHeader == null || !requestTokenHeader.startsWith("Bearer "))
		{
			filterChain.doFilter(request, response);
		}
		
		String token = requestTokenHeader.split("Bearer ")[1];
		
		Long userId = jwtService.getUserIdFromToken(token);
		
		if(userId != null && SecurityContextHolder.getContext().getAuthentication() == null)
		{
			UserTableEntity userEntity = userService.getUserById(userId);
			
			UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = 
							new UsernamePasswordAuthenticationToken(userEntity, null, null);
			
			usernamePasswordAuthenticationToken.setDetails(
					new WebAuthenticationDetailsSource().buildDetails(request));
			
			SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
		}
		
		filterChain.doFilter(request, response);
	}

}
