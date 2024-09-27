package org.mm.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.mm.entities.AuthorEntity;
import org.mm.entities.BookEntity;
import org.mm.repository.AuthorRepo;
import org.mm.repository.BookRepo;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthorService 
{
	private final AuthorRepo authorRepo;
	
	private final BookRepo bookRepo;
	
	public AuthorEntity saveAuthor(AuthorEntity authorEntity)
	{
		return authorRepo.save(authorEntity);
	}
	
	public List<AuthorEntity> findAllAuthor()
	{
		return authorRepo.findAll().stream().collect(Collectors.toList());
	}

	public BookEntity setAuthorToBook(Long authorId, Long bookId)
	{
		Optional<AuthorEntity> authorEntity = authorRepo.findById(authorId);
		Optional<BookEntity> bookEntity = bookRepo.findById(bookId);
		
		return authorEntity.flatMap(author -> 
				bookEntity.map(book -> {
					book.setAuthor(author);
					return bookRepo.save(book);
				})).orElse(null);
	}
	
//	public AuthorEntity authorToBook(Long authorId, Long bookId)
//	{
//		AuthorEntity authorEntity = authorRepo.findById(authorId).orElse(null);
//		BookEntity bookEntity = bookRepo.findById(bookId).orElse(null);
//		
//		authorEntity.setBook(bookEntity);
//		
//		return authorRepo.save(authorEntity);
//	}
}
