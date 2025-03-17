package org.mm.borrower_service.service;

import java.time.LocalDate;
import java.util.List;

import org.mm.borrower_service.entity.BorrowerEntity;
import org.mm.borrower_service.entity.BorrowingHistory;
import org.mm.borrower_service.repository.BorrowerHistoryRepository;
import org.mm.borrower_service.repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowerService 
{
	@Autowired
	private BorrowerRepository borrowerRepository;
	
	@Autowired
	private BorrowerHistoryRepository historyRepository;
	
	public List<BorrowerEntity> findAllBorrowerData()
	{
		return borrowerRepository.findAll();
	}

	public BorrowerEntity getBorrowerById(Long id) 
	{
		return borrowerRepository.findById(id).orElseThrow(() -> new RuntimeException());
	}
	
	public List<BorrowerEntity> getBorrowerByBookId(Long id)
	{
		return borrowerRepository.findByBorrowedBookId(id);
	}

	public BorrowerEntity createUser(BorrowerEntity borrowerEntity) 
	{
		return borrowerRepository.save(borrowerEntity);
	}

	public BorrowerEntity userBorrowBook(Long borrowerId, Long bookId)
	{
		BorrowingHistory h1 = new BorrowingHistory();
		h1.setBorrowerId(borrowerId);
		h1.setBookId(bookId);
		h1.setBorrowedDate(LocalDate.now());
		
		historyRepository.save(h1);
		
		BorrowerEntity borrowerEntity = borrowerRepository.findById(borrowerId).orElseThrow();
		borrowerEntity.setBorrowedBookId(bookId);
		return borrowerRepository.save(borrowerEntity);
	}
	
	public BorrowerEntity userSubmitBook(Long borrowerId, Long bookId)
	{

		BorrowingHistory borrowHistory = historyRepository.findByBorrowerId(borrowerId);
		borrowHistory.setReturnedDate(LocalDate.now());
		
		historyRepository.save(borrowHistory);
		
		BorrowerEntity borrowerEntity = borrowerRepository.findById(borrowerId).orElseThrow();
		borrowerEntity.setBorrowedBookId(null);
		return borrowerRepository.save(borrowerEntity);
	}
}
