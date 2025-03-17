package org.mm.book_service.repository;

import java.util.List;

import org.mm.book_service.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> 
{

    @Query("SELECT b FROM BookEntity b WHERE b.isBorrowed = true")
    List<BookEntity> findBorrowedBooks();
    
    @Query("SELECT b FROM BookEntity b WHERE b.isBorrowed = false")
    List<BookEntity> findAvailableBooks();
}
