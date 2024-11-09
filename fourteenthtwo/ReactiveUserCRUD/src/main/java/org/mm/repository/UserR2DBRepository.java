package org.mm.repository;

import org.mm.entities.UserEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserR2DBRepository extends ReactiveCrudRepository<UserEntity, Long>{

}
