package org.mm.book_service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "borrower-service", path = "/borrower")
public interface BorrowerFeignClient 
{
	@GetMapping(path = "/helloBorrower")
	public String helloFromBorrower();
	
	@GetMapping(path = "/borrowerByBook/{bookId}")
	public ResponseEntity<?> getBorrowerByBookId(@PathVariable("bookId") Long id);
}
