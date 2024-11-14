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
	
	@GetMapping(path = "/fetchBorrowerHello")
	public String bookDataHello()
	{
		return borrowerFeignClient.helloFromBorrower();
	}
	
	@GetMapping(path = "/books/{id}/borrower")
	public ResponseEntity<?> getBorrowerFromBook(@PathVariable("id") Long id)
	{
		return new ResponseEntity<>(bookService.fromBookBorrowerInfo(id), HttpStatus.OK);
	}
	
	@GetMapping(path = "/getAllBook")
	public List<BookEntity> findAllBook()
	{
		return bookService.findAllBooks();
	}
}
