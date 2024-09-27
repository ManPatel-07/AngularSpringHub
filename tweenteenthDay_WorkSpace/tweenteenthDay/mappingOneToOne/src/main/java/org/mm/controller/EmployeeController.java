package org.mm.controller;

import java.util.List;

import org.mm.entity.EmployeeEntity;
import org.mm.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/employee")
public class EmployeeController
{
	private final EmployeeService employeeService;
	
	@PostMapping(path = "/save")
	public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity)
	{
		return employeeService.saveEmployee(employeeEntity);
	}
	
	@GetMapping(path = "/findAll")
	public List<EmployeeEntity> findAllDepart()
	{
		return employeeService.findAllEmployee();
	}
}
