package com.mm.controller;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mm.dto.MarksheetDTO;
import com.mm.service.MarksheetService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MarksheetController 
{
	private final MarksheetService marksheetService;
	
	@PostMapping(path = "/save")
	public ResponseEntity<MarksheetDTO> save(@RequestBody MarksheetDTO marksheetDto)
	{
		MarksheetDTO marksheetDTO2 = marksheetService.save(marksheetDto);
		return ResponseEntity.ok(marksheetDTO2);
	}
	
	@GetMapping(path = "/findall")
	public ResponseEntity<List<MarksheetDTO>> findAll()
	{
		List<MarksheetDTO> allData = marksheetService.getAllData();
		return new ResponseEntity<List<MarksheetDTO>>(allData, HttpStatus.FOUND);
	}
	
	@PutMapping(path = "/update/{id}")
	public MarksheetDTO updateMarksheet(@PathVariable("id") Long id, 
										@RequestBody MarksheetDTO marksheetDTO)
	{
		return marksheetService.updateMarksheet(id, marksheetDTO);
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public String deleteMarksheet(@PathVariable("id") Long id)
	{
		marksheetService.deleteMarksheet(id);
		return "Data Deleted...";
	}
	
	@PatchMapping(path = "/partialchange/{id}")
	public MarksheetDTO partialChangeInMarksheet(@RequestBody Map<String, Object> marksheetDto,
												@PathVariable Long id)
	{
		return marksheetService.updatePartialMarksheetById(id, marksheetDto);
	}
	
	@GetMapping(path = "/findbyid/{id}")
	public ResponseEntity<MarksheetDTO> getMarksheetById(@PathVariable("id") Long id)
	{
		Optional<MarksheetDTO> marksheetById = marksheetService.getMarksheetById(id);
		return marksheetById
				.map(markDto -> ResponseEntity.ok(markDto))
				.orElseThrow(() -> new NoSuchElementException("Marksheet not found id:-" + id));

	}
	
}
