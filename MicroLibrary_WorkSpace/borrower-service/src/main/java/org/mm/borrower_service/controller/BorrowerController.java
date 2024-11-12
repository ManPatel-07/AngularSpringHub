package org.mm.borrower_service.controller;

import java.util.List;

import org.mm.borrower_service.entity.BorrowerEntity;
import org.mm.borrower_service.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/borrower")
public class BorrowerController 
{
	@Autowired
	private BorrowerService borrowerService;
	
	@GetMapping(path = "/getAllBorrower")
	public List<BorrowerEntity> getAllBookBorrower()
	{
		return borrowerService.findAllBorrowerData();
	}
}
