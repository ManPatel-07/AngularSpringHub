package org.mm.controller;

import java.util.List;

import org.mm.entity.DepartmentEntity;
import org.mm.service.DepartmentService;
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
@RequestMapping(path = "/depart")
public class DepartmentController 
{
	private final DepartmentService departmentService;
	
	@PostMapping(path = "/save")
	public DepartmentEntity saveDepartment(@RequestBody DepartmentEntity department)
	{
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping(path = "/AllData")
	public List<DepartmentEntity> findAllDepartment()
	{
		return departmentService.findAllDepartment();
	}
	
	@PutMapping(path = "/{departmentId}/manager/{employeeId}")
	public DepartmentEntity assignMangerToDepartment(
			@PathVariable("departmentId") Long departmentId,
			@PathVariable("employeeId") Long employeeId)
	{
		return departmentService.assignManagerToDepartment(departmentId, employeeId);
	}
	
	@GetMapping(path = "/assignDepartToManager/{employeeId}")
	public DepartmentEntity getassignDepartToManager(@PathVariable("employeeId") Long id)
	{
		return departmentService.assignDepartToManager(id);
	}
	
	@PutMapping(path = "/{departmentId}/worker/{employeeId}")
	public DepartmentEntity assignWorkerToDepartment(
			@PathVariable("departmentId") Long departmentId,
			@PathVariable("employeeId") Long employeeId)
	{
		return departmentService.assignManagerToDepartment(departmentId, employeeId);
	}
	
	
}
