package org.mm.review_service.service;

import java.util.List;

import org.mm.review_service.entity.Review;
import org.mm.review_service.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ReviewService 
{
	private final ReviewRepository reviewRepository;
	
	public Review saveReview(Review review)
	{
		return reviewRepository.save(review);
	}
	
	public List<Review> getAllReview()
	{
		return reviewRepository.findAll();
	}
	
	public List<Review> getReviewsByCompany(Long companyId)
	{
		return reviewRepository.findByCompanyId(companyId);
	}
}
