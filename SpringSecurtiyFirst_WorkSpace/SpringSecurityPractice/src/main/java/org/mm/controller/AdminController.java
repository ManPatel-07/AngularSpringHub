package org.mm.controller;

import org.mm.entities.AdminEntity;
import org.mm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController
{
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping(path = "/signup")
	public ResponseEntity<AdminEntity> signUp(@RequestBody AdminEntity adminEntity)
	{
		AdminEntity signUpEntity = adminService.signUp(adminEntity);
		
		return new ResponseEntity<AdminEntity>(signUpEntity, HttpStatus.OK);
	}
}
