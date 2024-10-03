package org.mm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mm.entities.AuthorEntity;
import org.mm.entities.BookEntity;
import org.mm.service.AuthorService;
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
	
	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<Map<String, String>> deleteAuthor(@PathVariable("id") Long id)
	{
		String deleteMessage = authorService.deleteAuthor(id);
		Map<String, String> response = new HashMap<>();
		response.put("message", deleteMessage);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping(path = "/getByIdAuthor/{id}")
	public AuthorEntity getAuthorById(@PathVariable("id") Long id)
	{
		return authorService.getAuthorById(id);
	}
	
	@PutMapping(path = "/updateById/{id}")
	public AuthorEntity updateByIdAuthor(@RequestBody AuthorEntity authorEntity,
										@PathVariable("id") Long id)
	{
		return authorService.updateAuthorById(authorEntity, id);
	}
	
}
