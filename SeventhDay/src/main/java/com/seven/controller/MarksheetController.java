package com.seven.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seven.dto.MarksheetDto;
import com.seven.service.MarksheetService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/")
public class MarksheetController 
{
	private final MarksheetService marksheetService;
	
//	@PostMapping(value = "/marksheet/save")
//	public MarksheetDto save(@RequestBody MarksheetDto marksheetDto)
//	{
//		return marksheetService.save(marksheetDto);
//	}
	
	@PostMapping(value = "/marksheet/save")
	public ResponseEntity<MarksheetDto> save(@RequestBody MarksheetDto marksheetDto)
	{
		
		return new ResponseEntity<MarksheetDto>(marksheetService.save(marksheetDto), HttpStatus.OK);
	}
	
	@GetMapping(value = "/marksheet/{rolln}")
	public MarksheetDto findByRoll(@PathVariable(value = "rolln") String rollno)
	{
		System.out.println(rollno);
		return marksheetService.findByRoll(rollno);
	}
	
	@GetMapping(value = "/marksheetById/{id}")
	public MarksheetDto marksheetFindById(@PathVariable("id") Long id)
	{
		return marksheetService.marksheetFindById(id);
	}
	
//	@GetMapping(value = "/marksheet/all")
//	public List<MarksheetDto> findAll()
//	{
//		return marksheetService.findAll();
//	}
	
	@GetMapping(value = "/marksheet/all")
	public ResponseEntity<List<MarksheetDto>> findAll()
	{
		return new ResponseEntity<List<MarksheetDto>>(marksheetService.findAll(), HttpStatus.OK);
	}
	
	@PutMapping(value = "/marksheet/{id}")
	public MarksheetDto updateById(@PathVariable("id") Long id, @RequestBody MarksheetDto marksheetDto)
	{
		return marksheetService.updateById(id, marksheetDto);
	}
	
	@DeleteMapping(value = "/marksheet/{id}")
	public void deleteByMarksheetId(@PathVariable("id") Long id)
	{
		marksheetService.deleteByMarksheetId(id);
	}
	
	@PatchMapping(value = "/marksheet/{id}")
	public MarksheetDto updatePartialInfoById(@RequestBody Map<String, Object> updates,@PathVariable("id") Long id)
	{
		return marksheetService.updatePartialInfoById(updates, id);
	}
}
