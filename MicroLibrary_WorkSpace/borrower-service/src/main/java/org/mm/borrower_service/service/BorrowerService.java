package org.mm.borrower_service.service;

import java.util.List;

import org.mm.borrower_service.entity.BorrowerEntity;
import org.mm.borrower_service.repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowerService 
{
	@Autowired
	private BorrowerRepository borrowerRepository;
	
	public List<BorrowerEntity> findAllBorrowerData()
	{
		return borrowerRepository.findAll();
	}
}
