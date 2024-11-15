package org.mm.borrower_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "book-service", path = "/books")
public interface BookFeignClient 
{
	@PutMapping(path = "/borrowBook/{bookId}")
	public ResponseEntity<?> bookBorrowProcess(@PathVariable("bookId") Long id);
	
	@PutMapping(path = "/submitBook/{bookId}")
	public ResponseEntity<?> bookSubmitProcess(@PathVariable("bookId") Long id);
}
