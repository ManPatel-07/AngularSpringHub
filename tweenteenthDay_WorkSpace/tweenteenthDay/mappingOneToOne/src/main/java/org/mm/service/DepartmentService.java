package org.mm.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.mm.entity.DepartmentEntity;
import org.mm.entity.EmployeeEntity;
import org.mm.repository.DepartmentRepo;
import org.mm.repository.EmployeeRepo;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartmentService 
{
	private final DepartmentRepo departmentRepo;
	
	private final EmployeeRepo employeeRepo;
	
	public DepartmentEntity saveDepartment(DepartmentEntity department)
	{
		return departmentRepo.save(department);
	}
	
	public List<DepartmentEntity> findAllDepartment()
	{
		return departmentRepo.findAll()
				.stream()
				.collect(Collectors.toList());
	}

	public DepartmentEntity assignManagerToDepartment(Long departmentId, Long employeeId) 
	{
		Optional<DepartmentEntity> departmentEntity = departmentRepo.findById(departmentId);
		
		Optional<EmployeeEntity> employeeEntity = employeeRepo.findById(employeeId);

		
		return departmentEntity.flatMap(department ->
				employeeEntity.map(employee -> {
					department.setManager(employee);
					return departmentRepo.save(department);
				})).orElse(null);
	}
}
