package org.mm.job_service.service;

import java.util.List;

import org.mm.job_service.client.CompanyFeignClient;
import org.mm.job_service.dao.CompanyDao;
import org.mm.job_service.dto.JobWithCompanyDto;
import org.mm.job_service.entity.Job;
import org.mm.job_service.repository.JobRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class JobService 
{
	private final JobRepository jobRepo;
	
	private final CompanyFeignClient companyClient;
	
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
	
	public JobWithCompanyDto getJobById(Long id)
	{
		JobWithCompanyDto jobDto = new JobWithCompanyDto();
		
		Job job = jobRepo.findById(id).orElseThrow();
		
		CompanyDao companyDao = companyClient.getCompanyDataById(job.getCompanyId());
		
		jobDto.setId(id);
		jobDto.setDescription(job.getDescription());
		jobDto.setSalaryRange(job.getSalaryRange());
		jobDto.setTitle(job.getTitle());
		
		jobDto.setCompanyDao(companyDao);
	
		return jobDto;
	}
	
}
