package org.mm.controller;

import org.mm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class AdminController 
{
	@Autowired
	private AdminService adminService;
	
	@PostMapping(value = "/addAdminData", consumes = "multipart/form-data")
	public ResponseEntity<?> addOrUpdatepackageMaterial(@RequestParam("data") String json,
			@RequestParam(value = "adminImage", required = false) MultipartFile adminImage) {
		
		return adminService.addAdminDetails(json, adminImage);
		
	}

}
