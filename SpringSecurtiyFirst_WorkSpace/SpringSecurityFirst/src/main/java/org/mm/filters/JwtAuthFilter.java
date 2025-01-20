package org.mm.filters;

import java.io.IOException;

import org.mm.entities.UserEntity;
import org.mm.service.JwtService;
import org.mm.service.UserService;
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
public class JwtAuthFilter extends OncePerRequestFilter{
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private UserService userService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException 
	{
		final String requestTokenHeader = request.getHeader("Authorization");
		
		if(requestTokenHeader == null || !requestTokenHeader.startsWith("Bearer"))
		{
			filterChain.doFilter(request, response);
			return;
		}
		
		String token = requestTokenHeader.split("Bearer ")[1];
		
		Long userId = jwtService.getUserIdFromToken(token);
		
		if(userId != null && SecurityContextHolder.getContext().getAuthentication() == null)
		{
			UserEntity user = userService.getByUserById(userId);
			
			UsernamePasswordAuthenticationToken userAuthenticationToken = 
					new UsernamePasswordAuthenticationToken(user, null, null);
			
			userAuthenticationToken.setDetails(
					new WebAuthenticationDetailsSource().buildDetails(request)
			);
			
			SecurityContextHolder.getContext().setAuthentication(userAuthenticationToken);
			
		}
		filterChain.doFilter(request, response);
		
		
		
	}

}
