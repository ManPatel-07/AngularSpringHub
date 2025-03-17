package org.mm.review_service.repository;

import org.mm.review_service.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>
{
	List<Review> findByCompanyId(Long companyId);
}
