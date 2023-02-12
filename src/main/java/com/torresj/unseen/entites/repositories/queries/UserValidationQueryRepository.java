package com.torresj.unseen.entites.repositories.queries;

import com.torresj.unseen.entites.UserValidationEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserValidationQueryRepository extends CrudRepository<UserValidationEntity, Long> {
  List<UserValidationEntity> findByUserId(long userId);

  UserValidationEntity findByToken(String token);
}
