package org.mm.review_service.controller;

import org.mm.review_service.entity.Review;
import org.mm.review_service.service.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping(path = "/review")
@RestController
public class ReviewController 
{
	private final ReviewService reviewService;
	
	@PostMapping(path = "/save")
	public ResponseEntity<?> saveReview(@RequestBody Review review)
	{
		return new ResponseEntity<>(reviewService.saveReview(review), HttpStatus.OK);
	}
	
	@GetMapping(path = "/getAll")
	public ResponseEntity<?> getAllReview()
	{
		return new ResponseEntity<>(reviewService.getAllReview(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/getByCompany")
	public ResponseEntity<?> getByCompanyId(@RequestParam("companyId") Long id)
	{
		return new ResponseEntity<>(reviewService.getReviewsByCompany(id), HttpStatus.OK);
	}
}
