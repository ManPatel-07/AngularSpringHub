package org.mm.service;

import java.util.List;
import java.util.stream.Collectors;

import org.mm.entities.BookEntity;
import org.mm.repository.BookRepo;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService 
{
	private final BookRepo bookRepo;
	
	public BookEntity saveBook(BookEntity bookEntity)
	{
		return bookRepo.save(bookEntity);
	}
	
	public List<BookEntity> findAllBook()
	{
		return bookRepo.findAll().stream().collect(Collectors.toList());
	}
}
