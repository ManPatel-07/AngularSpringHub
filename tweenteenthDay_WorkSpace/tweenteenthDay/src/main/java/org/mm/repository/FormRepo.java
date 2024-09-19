package org.mm.repository;

import org.mm.entities.FormEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepo extends JpaRepository<FormEntity, Long> 
{

}
