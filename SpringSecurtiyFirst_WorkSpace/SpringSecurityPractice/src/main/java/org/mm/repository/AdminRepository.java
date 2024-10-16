package org.mm.repository;

import java.util.Optional;

import org.mm.entities.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Long>
{
	Optional<AdminEntity> findByEmail(String email);
}
