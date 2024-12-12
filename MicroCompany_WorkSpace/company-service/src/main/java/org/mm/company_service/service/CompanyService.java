package org.mm.company_service.service;

import java.util.List;

import org.mm.company_service.entity.Company;
import org.mm.company_service.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CompanyService 
{
	private final CompanyRepository companyRepository;
	
	public Company saveComapnyInfo(Company company)
	{
		return companyRepository.save(company);
	}
	
	public List<Company> getAllCompanyData()
	{
		return companyRepository.findAll();
	}
	
	public Company getByReviewId(Long reviewId)
	{
		return companyRepository.findByReviewId(reviewId);
	}
}
