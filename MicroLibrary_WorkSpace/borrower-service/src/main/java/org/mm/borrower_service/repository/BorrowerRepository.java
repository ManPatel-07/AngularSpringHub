package org.mm.borrower_service.repository;

import java.util.List;

import org.mm.borrower_service.entity.BorrowerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowerRepository extends JpaRepository<BorrowerEntity, Long> 
{
	List<BorrowerEntity> findByBorrowedBookId(Long borrowedBookId);
}
