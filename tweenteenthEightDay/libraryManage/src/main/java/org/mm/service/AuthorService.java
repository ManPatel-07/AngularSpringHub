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
public class AuthorService
{
	@Autowired
	private AuthorRepo authorRepo;
	
	@Autowired
	private BookRepo bookRepo;
	
	public AuthorEntity saveAuthor(AuthorEntity authorEntity)
	{
		return authorRepo.save(authorEntity);
	}
	
	public List<AuthorEntity> findAllAuthor()
	{
		return authorRepo.findAll();
	}

	public BookEntity setBootToAuthor(Long authorId, Long bookId) {
		Optional<AuthorEntity> authorEntity = authorRepo.findById(authorId);
		Optional<BookEntity> bookEntity = bookRepo.findById(bookId);
		
		return authorEntity.flatMap(author -> 
			bookEntity.map(book -> {
				book.setAuthor(author);
				return bookRepo.save(book);
			})).orElse(null);
	}
}
