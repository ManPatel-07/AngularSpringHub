package org.mm.repository;

import java.util.Optional;

import org.mm.entity.DepartmentEntity;
import org.mm.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<DepartmentEntity, Long>{

	DepartmentEntity findByManager(Optional<EmployeeEntity> employeeEntity);

}
