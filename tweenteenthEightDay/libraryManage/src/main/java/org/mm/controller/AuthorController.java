package org.mm.controller;

import java.util.List;

import org.mm.entities.AuthorEntity;
import org.mm.entities.BookEntity;
import org.mm.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/author")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthorController 
{
	@Autowired
	private AuthorService authorService;
	
	@PostMapping(path = "/save")
	public AuthorEntity saveAuthor(@RequestBody AuthorEntity authorEntity)
	{
		return authorService.saveAuthor(authorEntity);
	}
	
	@GetMapping(path = "/getAll")
	public List<AuthorEntity> findAllAuthor()
	{
		return authorService.findAllAuthor();
	}
	
	@PutMapping(path = "/{authorId}/setBook/{bookId}")
	public BookEntity setBookToAuthor(@PathVariable("authorId") Long authorId,
										@PathVariable("bookId") Long bookId)
	{
		return authorService.setBootToAuthor(authorId, bookId);
	}
	
}
