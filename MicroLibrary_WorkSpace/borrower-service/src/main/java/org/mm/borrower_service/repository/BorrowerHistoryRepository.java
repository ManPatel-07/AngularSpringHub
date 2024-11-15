package org.mm.borrower_service.repository;

import org.mm.borrower_service.entity.BorrowingHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowerHistoryRepository extends JpaRepository<BorrowingHistory, Long> 
{	
    BorrowingHistory findByBorrowerId(Long borrowerId);
}
