package org.mm.repository;

import java.util.Optional;

import org.mm.entity.SecondUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondUserRepository extends JpaRepository<SecondUserEntity, Long>{

	Optional<SecondUserEntity> findByEmail(String email);
}
