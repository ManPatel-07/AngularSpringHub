package org.mm.company_service.controller;

import org.mm.company_service.entity.Company;
import org.mm.company_service.service.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequestMapping(path = "/company")
@RequiredArgsConstructor
@RestController
public class CompanyController 
{
	private final CompanyService compnayService;
	
	@PostMapping(path = "/save")
	public ResponseEntity<?> saveComapnyData(@RequestBody Company company)
	{
		return new ResponseEntity<>(compnayService.saveComapnyInfo(company), HttpStatus.OK);
	}
	
	@GetMapping(path = "/getAll")
	public ResponseEntity<?> getAllComapnyData()
	{
		return new ResponseEntity<>(compnayService.getAllCompanyData(), HttpStatus.OK);
	}
	
}
