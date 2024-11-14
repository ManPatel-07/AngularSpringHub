package org.mm.book_service.service;

import java.util.List;

import org.mm.book_service.entity.BookEntity;
import org.mm.book_service.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService 
{
	@Autowired
	private BookRepository bookRepository;
	
	public List<BookEntity> findAllBooks()
	{
		return bookRepository.findAll();
	}

	public Object fromBookBorrowerInfo(Long id)
	{	
		return null;
	}
}
