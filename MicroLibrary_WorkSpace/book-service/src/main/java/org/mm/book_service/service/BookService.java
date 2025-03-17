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

	public List<BookEntity> getAvailableBooksData() 
	{
		return bookRepository.findAvailableBooks();
	}

	public List<BookEntity> getBorrowedBookData() 
	{
		return bookRepository.findBorrowedBooks();
	}

	public BookEntity createNewBook(BookEntity bookEntity)
	{
		return bookRepository.save(bookEntity);
	}

	public BookEntity bookBorrowProcess(Long id)
	{
		BookEntity bookEntity = bookRepository.findById(id).orElseThrow();
		bookEntity.setIsBorrowed(true);
		
		return bookRepository.save(bookEntity);
	}

	public BookEntity bookSubmitProcess(Long id) 
	{
		BookEntity bookEntity = bookRepository.findById(id).orElseThrow();
		
		bookEntity.setIsBorrowed(false);
		
		return bookRepository.save(bookEntity);
	}
}
