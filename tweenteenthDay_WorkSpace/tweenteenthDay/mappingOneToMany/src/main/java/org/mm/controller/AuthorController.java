package org.mm.controller;

import java.util.List;

import org.mm.entities.AuthorEntity;
import org.mm.entities.BookEntity;
import org.mm.service.AuthorService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/author")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class AuthorController
{
	private final AuthorService authorService;
	
	@PostMapping(path = "/save")
	public AuthorEntity saveAuthor(@RequestBody AuthorEntity authorEntity)
	{
		return authorService.saveAuthor(authorEntity);
	}
	
	@GetMapping(path = "/allData")
	public List<AuthorEntity> findAllAuthor()
	{
		return authorService.findAllAuthor();
	}
	
	@PutMapping(path = "/{authorId}/authorToBook/{bookId}")
	public BookEntity setAuthorToBook(
							@PathVariable("authorId") Long authorId,
							@PathVariable("bookId") Long bookId)
	{
		return authorService.setAuthorToBook(authorId, bookId);
	}
	
//	@PutMapping(path = "/{authorId}/setAuthorToBook/{bookId}")
//	public AuthorEntity authorToBook(
//							@PathVariable("authorId") Long authorId,
//							@PathVariable("bookId") Long bookId)
//	{
//		return authorService.authorToBook(authorId, bookId);
//	}
}
