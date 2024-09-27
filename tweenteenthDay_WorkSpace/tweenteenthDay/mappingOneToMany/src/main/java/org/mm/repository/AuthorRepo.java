package org.mm.repository;

import org.mm.entities.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<AuthorEntity, Long>{

}
