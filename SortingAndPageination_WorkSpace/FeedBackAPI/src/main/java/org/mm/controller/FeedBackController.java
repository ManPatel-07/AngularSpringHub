package org.mm.controller;

import org.mm.dao.FeedBackDao;
import org.mm.entity.FeedBack;
import org.mm.service.FeedBackService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/feedback")
public class FeedBackController 
{
	private final FeedBackService feedBackService;
	
	@PostMapping()
	public ResponseEntity<?> createNewFeedBack(@RequestBody FeedBack feedBack)
	{
		return ResponseEntity.ok(feedBackService.createNewFeedBack(feedBack));
	}
	
	@PostMapping(path = "/get")
	public ResponseEntity<?> getAllFeedBack(@RequestBody FeedBackDao feedBackDao)
	{
		System.out.println(feedBackDao.getPageNumber());
		return ResponseEntity.ok(feedBackService.getFeedBacks(feedBackDao.getPageNumber()));
	}
	
	@GetMapping(path = "/getbyid/{id}")
	public ResponseEntity<?> findByIdFeedBack(@PathVariable Long id)
	{
		return ResponseEntity.ok(feedBackService.getFeedBackById(id));
	}
}
