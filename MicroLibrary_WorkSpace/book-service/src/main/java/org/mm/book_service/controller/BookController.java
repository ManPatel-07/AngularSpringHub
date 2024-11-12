package org.mm.book_service.controller;

import java.util.List;

import org.mm.book_service.entity.BookEntity;
import org.mm.book_service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/books")
public class BookController 
{
	@Autowired
	private BookService bookService;
	
	@GetMapping(path = "/getAll")
	public List<BookEntity> findAllBook()
	{
		return bookService.findAllBooks();
	}
}
