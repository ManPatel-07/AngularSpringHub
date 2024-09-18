package com.mm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mm.enitites.MarksheetEntity;

@Repository
public interface MarksheetRepository extends JpaRepository<MarksheetEntity, Long>{

}
