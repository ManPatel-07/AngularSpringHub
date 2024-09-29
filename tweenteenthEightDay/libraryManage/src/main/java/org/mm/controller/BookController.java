package org.mm.controller;

import java.util.List;

import org.mm.entities.BookEntity;
import org.mm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/book")
@CrossOrigin(origins = "http://localhost:4200")
public class BookController
{
	@Autowired
	private BookService bookService;
	
	@PostMapping(path = "/save/{author_Id}")
	public BookEntity saveBook(@RequestBody BookEntity bookEntity,
							@PathVariable("author_Id") Long author_Id)
	{
		return bookService.save(bookEntity, author_Id);
	}
	
	@GetMapping(path = "/getAll")
	public List<BookEntity> getAllBook()
	{
		return bookService.getAllBook();
	}
}
