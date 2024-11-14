package org.mm.borrower_service.controller;

import java.util.List;

import org.mm.borrower_service.entity.BorrowerEntity;
import org.mm.borrower_service.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/borrower")
public class BorrowerController 
{
	@Autowired
	private BorrowerService borrowerService;
	
	@GetMapping(path = "/helloBorrower")
	public String helloFromBorrower()
	{
		return "Hello from Borrower Service  ...";
	}
	
	@GetMapping(path = "/getAllBorrower")
	public List<BorrowerEntity> getAllBookBorrower()
	{
		return borrowerService.findAllBorrowerData();
	}
	
	@GetMapping(path = "/getBorrowerById/{id}")
	public BorrowerEntity getBorrowerByIdData(@PathVariable("id") Long id)
	{
		return borrowerService.getBorrowerById(id);
	}
}
