package org.mm.repository;

import org.mm.entities.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<CourseEntity, Long>{

}
