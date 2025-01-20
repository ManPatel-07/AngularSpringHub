package org.mm.controller;

import org.mm.entities.UserEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UserController
{
	
	@GetMapping(path = "/testUser")
	private String testUser()
	{
		return "Inside Test User ...";
	}
	
	@GetMapping(path = "/all")
	private String allAccess()
	{
		return "public Test User ...";
	}
	
	@GetMapping(path = "/all/test")
	private String allAccessTest()
	{
		UserEntity user = (UserEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		log.info("user {}", user);
		
		return "public Test Admin Role ...";
	}
}
