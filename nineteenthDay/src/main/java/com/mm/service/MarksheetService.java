package com.mm.service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.data.util.ReflectionUtils;

import org.springframework.stereotype.Service;

import com.mm.dto.MarksheetDTO;
import com.mm.enitites.MarksheetEntity;
import com.mm.repository.MarksheetRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MarksheetService 
{
	private final MarksheetRepository marksheetRepository;
	
	private final ModelMapper modelMapper;
	
	public MarksheetDTO save(MarksheetDTO marksheetDto)
	{
		MarksheetEntity marksheetEntity = marksheetRepository.save(convertToEntity(marksheetDto));
		
		return convertToDto(marksheetEntity);
	}
	
	public List<MarksheetDTO> getAllData()
	{
		List<MarksheetEntity> marksheetEntity = marksheetRepository.findAll();
		return marksheetEntity
				.stream()
				.map(marksheet -> convertToDto(marksheet))
				.collect(Collectors.toList());
	}
	
	public MarksheetDTO updateMarksheet(Long marksheetId, MarksheetDTO marksheetDto)
	{
		MarksheetEntity marksheetEntity = convertToEntity(marksheetDto);
		
		marksheetEntity.setId(marksheetId);
		
		return convertToDto(marksheetRepository.save(marksheetEntity));
	}
	
	public MarksheetDTO updatePartialMarksheetById(Long id, Map<String, Object> updates)
	{
		boolean exist = marksheetRepository.existsById(id);
		if(!exist) return null;
		
		MarksheetEntity marksheetEntity = marksheetRepository.findById(id).get();
		
		updates.forEach((field, value) -> {
			Field fieldToBeUpdated = ReflectionUtils.findRequiredField(MarksheetEntity.class, field);
			
			fieldToBeUpdated.setAccessible(true);
			
			ReflectionUtils.setField(fieldToBeUpdated, marksheetEntity, value);
		});
		
		return convertToDto(marksheetRepository.save(marksheetEntity));
	}
	
	
	public Optional<MarksheetDTO> getMarksheetById(Long Id)
	{
		return marksheetRepository.findById(Id).map(employeeEntity -> 
									convertToDto(employeeEntity));
	}
	
	public void deleteMarksheet(Long id)
	{
		marksheetRepository.deleteById(id);
	}
	
	private MarksheetEntity convertToEntity(MarksheetDTO marksheetDto)
	{
		return modelMapper.map(marksheetDto, MarksheetEntity.class);
	}
	
	private MarksheetDTO convertToDto(MarksheetEntity marksheetEntity)
	{
		return modelMapper.map(marksheetEntity, MarksheetDTO.class);
	}
}
