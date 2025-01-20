package org.mm.service;

import org.mm.entity.SecondUserEntity;
import org.mm.repository.SecondUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthService 
{	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtService jwtService;
	
	public String login(SecondUserEntity secondUserEntity)
	{
//		Authentication authentication = authenticationManager.authenticate(
//				new UsernamePasswordAuthenticationToken(secondUserEntity.getEmail(), secondUserEntity.getPassword()));
		
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(secondUserEntity.getEmail(), secondUserEntity.getPassword())
				);
		
		SecondUserEntity user = (SecondUserEntity) authentication.getPrincipal();
		
		String token = jwtService.generateToken(user);
		
		return token;
	}

}
