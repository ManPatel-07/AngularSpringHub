package org.mm.controller;

import org.mm.entities.UserTableEntity;
import org.mm.service.LoginUserService;
import org.mm.service.SignUpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
	@Autowired
	private SignUpUserService signUpService;
	
	private LoginUserService loginService;
	
	@PostMapping(path = "/signup")
	public ResponseEntity<UserTableEntity> signUp(@RequestBody UserTableEntity userTableEntity)
	{
		UserTableEntity signUpUser = signUpService.signUp(userTableEntity);
		return new ResponseEntity<>(signUpUser, HttpStatus.OK);
	}
	
	@GetMapping(path = "/testHello")
	public String testHello()
	{
		return "Hello Test ...";
	}
	
	@PostMapping(path = "/login")
	public String loginUser(@RequestBody UserTableEntity userEntity)
	{
		return loginService.loginUser(userEntity);
	}
}
