package org.mm.controller;

import org.mm.entity.SecondUserEntity;
import org.mm.service.AuthService;
import org.mm.service.SecondUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	public ResponseEntity<?> login(@RequestBody SecondUserEntity secondUserEntity)
	{
		return new ResponseEntity<>(authService.login(secondUserEntity), HttpStatus.OK);
	}
}
