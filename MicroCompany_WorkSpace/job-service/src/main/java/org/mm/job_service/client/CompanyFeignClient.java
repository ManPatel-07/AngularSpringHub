package org.mm.job_service.client;

import org.mm.job_service.dao.CompanyDao;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "company-service")
public interface CompanyFeignClient 
{
	@GetMapping(path = "/company/getById/{id}")
	public CompanyDao getCompanyDataById(@PathVariable("id") Long companyId);
	
	@GetMapping(path = "/company/test")
	public String testComapny();
}
