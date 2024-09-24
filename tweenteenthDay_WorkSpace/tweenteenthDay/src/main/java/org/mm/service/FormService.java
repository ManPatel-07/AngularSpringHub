package org.mm.service;

import java.util.List;
import java.util.Optional;
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
	
	public FormEntity updateById(Long id, FormEntity formEntity)
	{
		formEntity.setId(id);
		return formRepo.save(formEntity);
	}

	public void deleteById(Long id) {
		formRepo.deleteById(id);
	}
	
	public FormEntity getUserfindById(Long id)
	{
		Optional<FormEntity> formEntity = formRepo.findById(id);
		return formEntity.orElse(null);
	}
}
