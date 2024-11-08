package org.mm.repository;

import org.mm.entities.UserTableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserTableEntity, Long>
{
	UserTableEntity findByUsername(String username);
}
