package org.mm.controller;

import java.util.List;

import org.mm.entities.BookEntity;
import org.mm.service.BookService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/book")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class BookController 
{
	private final BookService bookService;
	
	@PostMapping(path = "/save")
	public BookEntity saveBook(@RequestBody BookEntity bookEntity)
	{
		return bookService.saveBook(bookEntity);
	}
	
	@GetMapping(path = "/allData")
	public List<BookEntity> findAllBook()
	{
		return bookService.findAllBook();
	}
}
