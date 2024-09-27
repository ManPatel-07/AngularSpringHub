package org.mm.repository;

import org.mm.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<BookEntity, Long>{

}
