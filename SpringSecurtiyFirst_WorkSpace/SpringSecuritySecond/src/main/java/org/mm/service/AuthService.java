package org.mm.service;

import org.mm.dto.LoginResponseDto;
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
	
	@Autowired
	private SecondUserService secondUserService;
	
	public LoginResponseDto login(SecondUserEntity secondUserEntity)
	{
//		Authentication authentication = authenticationManager.authenticate(
//				new UsernamePasswordAuthenticationToken(secondUserEntity.getEmail(), secondUserEntity.getPassword()));
		
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(secondUserEntity.getEmail(), secondUserEntity.getPassword())
				);
		
		SecondUserEntity user = (SecondUserEntity) authentication.getPrincipal();
		
		String accessToken = jwtService.generateAccessToken(user);
		String refreshToken = jwtService.generateRefreshToken(user);
		
		return new LoginResponseDto(user.getId(), accessToken, refreshToken);
	}

	public LoginResponseDto refreshToken(String refreshToken)
	{
		Long userId = jwtService.getUserIdFromToken(refreshToken);
		SecondUserEntity user = secondUserService.getUserByUserId(userId);
		
		String accessToken = jwtService.generateAccessToken(user);
		
		return new LoginResponseDto(user.getId(), accessToken, refreshToken);
	}
}
