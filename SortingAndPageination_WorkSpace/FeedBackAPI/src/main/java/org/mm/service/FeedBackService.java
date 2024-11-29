package org.mm.service;

import java.util.List;

import org.mm.entity.FeedBack;
import org.mm.repository.FeedBackRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class FeedBackService 
{
	private final FeedBackRepository feedBackRepo;
	
	private final int PAGE_SIZE = 5;
	
	public FeedBack createNewFeedBack(FeedBack feedBack)
	{
		return feedBackRepo.save(feedBack);
	}
	
	public List<FeedBack> getFeedBacks(Integer pageNumber)
	{
		Pageable pageable = PageRequest.of(pageNumber, PAGE_SIZE);
		
		return feedBackRepo.findAll(pageable).getContent();
	}
	
	public FeedBack getFeedBackById(Long id)
	{
		return feedBackRepo.findById(id).orElseThrow();
	}
}
