package com.seven.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PatchExchange;

import com.seven.dto.MarksheetDto;
import com.seven.service.MarksheetService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/")
public class MarksheetController 
{
	private final MarksheetService marksheetService;
	
	@PostMapping(value = "/marksheet/save")
	public MarksheetDto save(@RequestBody MarksheetDto marksheetDto)
	{
		return marksheetService.save(marksheetDto);
	}
	
	@GetMapping(value = "/marksheet/{rolln}")
	public MarksheetDto findByRoll(@PathVariable(value = "rolln") String rollno)
	{
		System.out.println(rollno);
		return marksheetService.findByRoll(rollno);
	}
	
	@GetMapping(value = "/marksheet/all")
	public List<MarksheetDto> findAll()
	{
		return marksheetService.findAll();
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
