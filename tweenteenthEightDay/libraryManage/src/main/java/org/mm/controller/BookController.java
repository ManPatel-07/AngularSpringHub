package org.mm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mm.entities.BookEntity;
import org.mm.repository.BookRepo;
import org.mm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<Map<String, String>> deleteBook(@PathVariable("id") Long id)
	{
		String deletString = bookService.bookDelete(id);
		Map<String, String> response = new HashMap<>();
		response.put("message", deletString);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@PutMapping(path = "/{authorId}/updateById/{bookId}")
	public BookEntity updateBookById(@RequestBody BookEntity bookEntity,
									@PathVariable("bookId") Long bookId,
									@PathVariable("authorId") Long authorId)
	{
		return bookService.updateBookById(bookEntity, bookId, authorId);
	}
}
