package org.mm.book_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "borrower-service", path = "/borrower")
public interface BorrowerFeignClient 
{
	@GetMapping(path = "/helloBorrower")
	public String helloFromBorrower();
}
