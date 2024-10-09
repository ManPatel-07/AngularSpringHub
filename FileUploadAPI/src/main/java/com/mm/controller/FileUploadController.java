package com.mm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mm.util.FileUploadUtil;

@RestController
public class FileUploadController 
{
	@Autowired
	private FileUploadUtil fileUploadUtil;
	
	@PostMapping(path = "/upload")
	public ResponseEntity<String> upload(@RequestParam("file") MultipartFile file)
	{
		try {
			fileUploadUtil.uploadFile(file);
			return ResponseEntity.ok("Uploaded");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed ...");
	}
}
