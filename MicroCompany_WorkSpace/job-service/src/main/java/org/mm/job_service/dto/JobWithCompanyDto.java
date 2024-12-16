package org.mm.job_service.dto;

import org.mm.job_service.dao.CompanyDao;
import org.mm.job_service.entity.Job;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JobWithCompanyDto 
{
	private Long id;
	
	private String title;
	private String description;
	private String salaryRange;
//	private Job job;
	private CompanyDao companyDao;
}
