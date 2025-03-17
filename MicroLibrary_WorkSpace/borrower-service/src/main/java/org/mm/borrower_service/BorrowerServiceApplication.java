package org.mm.borrower_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BorrowerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BorrowerServiceApplication.class, args);
	}

}
