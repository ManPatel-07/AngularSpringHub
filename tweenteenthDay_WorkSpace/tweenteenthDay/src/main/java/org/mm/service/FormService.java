package org.mm.service;

import java.util.List;
import java.util.stream.Collectors;

import org.mm.entities.FormEntity;
import org.mm.repository.FormRepo;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FormService 
{
	private final FormRepo formRepo;
	
	public FormEntity saveData(FormEntity formEntity)
	{
		return formRepo.save(formEntity);
	}

	public List<FormEntity> findAllData() 
	{
		List<FormEntity> formAllData = formRepo.findAll();
		return formAllData.stream()
//		.map(data -> data)
		.collect(Collectors.toList());
	}
}
