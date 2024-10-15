package org.mm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
		return "public Test Admin Role ...";
	}
}
