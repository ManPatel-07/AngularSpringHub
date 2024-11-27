package org.mm.customer_service.controller;

import org.mm.customer_service.entity.Customer;
import org.mm.customer_service.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequestMapping(path = "/customers")
@RequiredArgsConstructor
@RestController
public class CustomerController 
{
	private final CustomerService customerService;
	
	@PostMapping()
	public ResponseEntity<?> addCustomer(@RequestBody Customer customer) 
	{
		return ResponseEntity.ok(customerService.addNewCustomer(customer));
	}

	@GetMapping()
	public ResponseEntity<?> getAllCustomers()
	{
		return ResponseEntity.ok(customerService.getAllCustomer());
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getCustomerById(@PathVariable("id") Long id)
	{
		return ResponseEntity.ok(customerService.getCustomerById(id));
	}
}
