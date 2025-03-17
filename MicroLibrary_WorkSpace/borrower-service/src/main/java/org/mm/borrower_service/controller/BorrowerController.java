package org.mm.borrower_service.controller;

import java.util.List;

import org.mm.borrower_service.client.BookFeignClient;
import org.mm.borrower_service.entity.BorrowerEntity;
import org.mm.borrower_service.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/borrower")
public class BorrowerController 
{
	@Autowired
	private BorrowerService borrowerService;
	
	@Autowired
	private BookFeignClient bookFeignClient;
	
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
	
	@GetMapping(path = "/borrowerByBook/{bookId}")
	public ResponseEntity<?> getBorrowerByBookId(@PathVariable("bookId") Long id)
	{
		return ResponseEntity.ok(borrowerService.getBorrowerByBookId(id));
	}
	
	@PostMapping(path = "/createUser")
	public BorrowerEntity createUser(@RequestBody BorrowerEntity borrowerEntity)
	{
		return borrowerService.createUser(borrowerEntity);
	}
	
	@PutMapping(path = "/user/{borrowerId}/borrowBook/{bookId}")
	public  BorrowerEntity userBorrowBook(@PathVariable("borrowerId") Long borrowerId,
			@PathVariable("bookId") Long bookId)
	{
		BorrowerEntity userBorrower = borrowerService.userBorrowBook(borrowerId, bookId);
		bookFeignClient.bookBorrowProcess(bookId);
		return userBorrower;
	}
	
	@PutMapping(path = "/user/{borrowerId}/submitBook/{bookId}")
	public  BorrowerEntity userBookSubmit(@PathVariable("borrowerId") Long borrowerId,
			@PathVariable("bookId") Long bookId)
	{
		BorrowerEntity userBorrower = borrowerService.userSubmitBook(borrowerId, bookId);
		bookFeignClient.bookSubmitProcess(bookId);
		return userBorrower;
	}
	
}
