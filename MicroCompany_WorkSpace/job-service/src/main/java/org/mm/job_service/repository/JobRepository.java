package org.mm.job_service.repository;

import org.mm.job_service.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long>
{
	Job findByCompanyId(Long companyId);
}
