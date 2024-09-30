package com.seven.service;

import java.awt.image.ColorConvertOp;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.el.util.ReflectionUtil;
import org.modelmapper.ModelMapper;
import org.springframework.data.util.ReflectionUtils;
import org.springframework.stereotype.Service;

import com.seven.dto.MarksheetDto;
import com.seven.entities.MarksheetEntity;
import com.seven.repository.MarksheetRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MarksheetService 
{
	private final MarksheetRepo marksheetRepo;
	
	private final ModelMapper modelMapper;
	
	public MarksheetDto save(MarksheetDto marksheetDto)
	{
		MarksheetEntity marksheetEntity = marksheetRepo.save(convertToEntity(marksheetDto));
		return convertToDto(marksheetEntity);
	}
	
	public MarksheetDto findByRoll(String rollno) 
	{
		MarksheetEntity marksheetEntity = marksheetRepo.findByRollno(rollno);
		return convertToDto(marksheetEntity);
	}
	
	public List<MarksheetDto> findAll()
	{
		List<MarksheetEntity> marksheetEntity = marksheetRepo.findAll();
		return marksheetEntity
				.stream()
				.map(marksheet -> convertToDto(marksheet))
				.collect(Collectors.toList());
	}
	
	public MarksheetDto updateById(Long id, MarksheetDto marksheetDto) {
		MarksheetEntity marksheetEntity = convertToEntity(marksheetDto);
		marksheetEntity.setId(id);
		return convertToDto(marksheetRepo.save(marksheetEntity));
	}

	public void deleteByMarksheetId(Long id) {
		marksheetRepo.deleteById(id);
	}
	

	public MarksheetDto updatePartialInfoById(Map<String, Object> updates, Long id) {
		boolean exists = marksheetRepo.existsById(id);
		if(!exists) return null;
		MarksheetEntity marksheetEntity = marksheetRepo.findById(id).get();
		updates.forEach((field, value) -> {
			Field fieldToBeUpdated = ReflectionUtils.findRequiredField(MarksheetEntity.class, field);
			fieldToBeUpdated.setAccessible(true);
			ReflectionUtils.setField(fieldToBeUpdated, marksheetEntity, value);
		});
		return convertToDto(marksheetRepo.save(marksheetEntity));
	}

	public MarksheetDto marksheetFindById(Long id)
	{
		MarksheetEntity marksheetEntity = marksheetRepo.findById(id).orElse(null);
		MarksheetDto marksheetDto = convertToDto(marksheetEntity);
		return marksheetDto;
	}
	
	public MarksheetDto convertToDto(MarksheetEntity marksheetEntity)
	{
		return modelMapper.map(marksheetEntity, MarksheetDto.class);
	}
	
	public MarksheetEntity convertToEntity(MarksheetDto marksheetDto)
	{
		return modelMapper.map(marksheetDto, MarksheetEntity.class);
	}

}
