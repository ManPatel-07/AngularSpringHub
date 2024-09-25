package org.mm.service;

import java.util.List;
import java.util.stream.Collectors;

import org.mm.entity.EmployeeEntity;
import org.mm.repository.EmployeeRepo;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {
	
	private final EmployeeRepo employeeRepo;

	public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity)
	{
		return employeeRepo.save(employeeEntity);
	}
	
	public List<EmployeeEntity> findAllEmployee()
	{
		return employeeRepo.findAll()
				.stream()
				.collect(Collectors.toList());
	}
}
