package org.mm.book_service.controller;

import java.util.List;

import org.mm.book_service.client.BorrowerFeignClient;
import org.mm.book_service.entity.BookEntity;
import org.mm.book_service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/books")
public class BookController 
{
	@Autowired
	private BookService bookService;
	
	@Autowired
	private BorrowerFeignClient borrowerFeignClient;
	
	@GetMapping(path = "/helloBook")
	public String helloFromBook()
	{
		return "Hello from book Service  ...";
	}
	
	@PostMapping(path = "/createBook")
	public ResponseEntity<?> createNewBook(@RequestBody BookEntity bookEntity)
	{
		return ResponseEntity.ok(bookService.createNewBook(bookEntity));
	}
	
	@PutMapping(path = "/borrowBook/{bookId}")
	public ResponseEntity<?> bookBorrowProcess(@PathVariable("bookId") Long id)
	{
		return ResponseEntity.ok(bookService.bookBorrowProcess(id));
	}

	@PutMapping(path = "/submitBook/{bookId}")
	public ResponseEntity<?> bookSubmitProcess(@PathVariable("bookId") Long id)
	{
		return ResponseEntity.ok(bookService.bookSubmitProcess(id));
	}
	
	@GetMapping(path = "/fetchBorrowerHello")
	public String bookDataHello()
	{
		return borrowerFeignClient.helloFromBorrower();
	}
	
	
	@GetMapping(path = "/getAllBook")
	public List<BookEntity> findAllBook()
	{
		return bookService.findAllBooks();
	}
	
	@GetMapping(path = "/fetchBorrowerInfo/{bookId}")
	public ResponseEntity<?> getBorowerByBookId(@PathVariable("bookId") Long id)
	{
		return borrowerFeignClient.getBorrowerByBookId(id);
	}
	
	@GetMapping(path = "/availableBooks")
	public ResponseEntity<?> getAvailableBooksData()
	{
		return ResponseEntity.ok(bookService.getAvailableBooksData());
	}
	
	@GetMapping(path = "/borrowedBooks")
	public ResponseEntity<?> getBorrowedBooksData()
	{
		return ResponseEntity.ok(bookService.getBorrowedBookData());
	}
}
