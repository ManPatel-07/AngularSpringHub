package org.mm.service;

import org.mm.entities.UserTableEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class LoginUserService 
{
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private AuthenticationManager authManager;
	
	public String loginUser(UserTableEntity userEntity)
	{
		Authentication authentication = authManager.authenticate(
					new UsernamePasswordAuthenticationToken(userEntity.getUsername(), userEntity.getPassword())
				);
		
		UserTableEntity userEntity2 = (UserTableEntity) authentication.getPrincipal();
		 
		return jwtService.generateToken(userEntity2);	
	}
}
