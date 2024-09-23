package org.mm.controller;

import java.util.List;

import org.mm.entities.FormEntity;
import org.mm.service.FormService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/form")
public class FormController
{
	private final FormService formService;
	
	@PostMapping(path = "/save")
	public ResponseEntity<FormEntity> saveData(@RequestBody FormEntity formEntity)
	{
		FormEntity saveFormData = formService.saveData(formEntity);
		
		return new ResponseEntity<FormEntity>(saveFormData, HttpStatus.OK);
	}
	
	@GetMapping(path = "/findAll")
	public ResponseEntity<List<FormEntity>> findAllData()
	{
		List<FormEntity> allData = formService.findAllData();
		
		return new ResponseEntity<List<FormEntity>>(allData, HttpStatus.OK);
	}
	
	@PutMapping(path = "/update/{id}")
	public ResponseEntity<FormEntity> updateById(@PathVariable("id") Long id, @RequestBody FormEntity formEntity)
	{
		FormEntity updateForm = formService.updateById(id, formEntity);
		
		return new ResponseEntity<FormEntity>(updateForm, HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public void deleteById(@PathVariable("id") Long id)
	{
		formService.deleteById(id);
	}
	
}
