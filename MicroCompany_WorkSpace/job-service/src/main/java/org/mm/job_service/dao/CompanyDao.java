package org.mm.job_service.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CompanyDao 
{
	private String name;
	private String description;
	private String location;
}
