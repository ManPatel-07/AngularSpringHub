package com.seven.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seven.entities.MarksheetEntity;
import java.util.List;


public interface MarksheetRepo extends JpaRepository<MarksheetEntity, Long>{

	MarksheetEntity findByRollno(String rollno);
	List<MarksheetEntity> findByName(String name);
}
