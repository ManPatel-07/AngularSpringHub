package org.mm.job_service.service;

import java.util.List;

import org.mm.job_service.entity.Job;
import org.mm.job_service.repository.JobRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class JobService 
{
	private final JobRepository jobRepo;
	
	public Job saveJobDetails(Job job)
	{
		return jobRepo.save(job);
	}
	
	public List<Job> getAllJobData()
	{
		return jobRepo.findAll();
	}
	
	public Job getByCompanyId(Long id)
	{
		return jobRepo.findByCompanyId(id);
	}
	
}
