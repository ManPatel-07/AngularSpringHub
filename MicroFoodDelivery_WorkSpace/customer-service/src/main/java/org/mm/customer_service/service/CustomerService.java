package org.mm.customer_service.service;

import java.util.List;

import org.mm.customer_service.entity.Customer;
import org.mm.customer_service.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CustomerService 
{
	private final CustomerRepository customerRepo;

	public Customer addNewCustomer(Customer customer) 
	{
		return customerRepo.save(customer);
	}
	
	public List<Customer> getAllCustomer() 
	{
		return customerRepo.findAll();
	}

	public Customer getCustomerById(Long id)
	{
		return customerRepo.findById(id).orElseThrow();
	}

	public Customer updateCustomerDetails(Long id, Customer customer)
	{
		customer.setId(id);
		
		return customerRepo.save(customer);
	}

	public String deleteById(Long id)
	{
		if(customerRepo.findById(id) != null)
		{
			customerRepo.deleteById(id);
			
			return "Customer Deleted ...";
		}
		
		return "Customer not available !!";
	}
	
}
