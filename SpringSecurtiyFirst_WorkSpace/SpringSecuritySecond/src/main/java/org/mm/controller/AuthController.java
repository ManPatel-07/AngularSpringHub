package org.mm.controller;

import java.util.Arrays;
import java.util.Optional;

import org.mm.dto.LoginResponseDto;
import org.mm.entity.SecondUserEntity;
import org.mm.service.AuthService;
import org.mm.service.SecondUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(path = "/auth")
public class AuthController 
{
	@Autowired
	private SecondUserService secondUserService;
	
	@Autowired
	private AuthService authService;
	
	@PostMapping(path = "/signup")
	public ResponseEntity<?> signUp(@RequestBody SecondUserEntity secondUserEntity)
	{
		return new ResponseEntity<>(secondUserService.signUp(secondUserEntity), HttpStatus.OK);
	}
	
	@PostMapping(path = "/login")
	public ResponseEntity<?> login(@RequestBody SecondUserEntity secondUserEntity, HttpServletResponse response)
	{
		LoginResponseDto loginResponseDto = authService.login(secondUserEntity);
		
		Cookie cookie = new Cookie("refreshToken", loginResponseDto.getRefreshToken());
		cookie.setHttpOnly(true);
		response.addCookie(cookie);
		
		
		return new ResponseEntity<>(loginResponseDto, HttpStatus.OK);
	}
	
	@PostMapping(path = "/refresh")
	public ResponseEntity<?> refresh(HttpServletRequest request)
	{
		String refreshToken = Arrays.stream(request.getCookies())
				.filter(cookie -> "refreshToken".equals(cookie.getName()))
				.findFirst()
				.map(Cookie::getValue)
				.orElseThrow(() -> new AuthenticationServiceException("Refresh token not found inside the cookies"));
		
		LoginResponseDto loginResponseDto = authService.refreshToken(refreshToken);
		return new ResponseEntity<>(loginResponseDto, HttpStatus.OK);
	}
	
	@DeleteMapping("/logout")
	public ResponseEntity<String> logout(HttpServletRequest request) {
	    String refreshToken = Arrays.stream(Optional.ofNullable(request.getCookies())
	                    .orElseThrow(() -> new IllegalArgumentException("No cookies found")))
	            .filter(cookie -> "refreshToken".equals(cookie.getName()))
	            .findFirst()
	            .map(Cookie::getValue)
	            .orElseThrow(() -> new IllegalArgumentException("Refresh token not found in cookies"));

	    authService.logout(refreshToken);
	    return ResponseEntity.ok("Logout successful");
	}

}
