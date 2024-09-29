package org.mm.service;

import java.util.List;
import java.util.Optional;

import org.mm.entities.AuthorEntity;
import org.mm.entities.BookEntity;
import org.mm.repository.AuthorRepo;
import org.mm.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService
{
	@Autowired
	private BookRepo bookRepo;
	
	@Autowired
	private AuthorRepo authorRepo;
	
	public BookEntity save(BookEntity bookentity, Long author_Id)
	{
		AuthorEntity authorEntity = authorRepo.findById(author_Id).orElse(null);
		
		bookentity.setAuthor(authorEntity);
		
		return bookRepo.save(bookentity);
	}
	
	public List<BookEntity> getAllBook()
	{
		return bookRepo.findAll();
	}
}
