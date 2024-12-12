package org.mm.company_service.repository;

import org.mm.company_service.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>
{
	public Company findByReviewId(Long reviewId);
}
