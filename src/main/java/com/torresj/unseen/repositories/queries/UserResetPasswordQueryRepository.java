package com.torresj.unseen.repositories.queries;

import com.torresj.unseen.entites.UserResetPasswordEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserResetPasswordQueryRepository
    extends CrudRepository<UserResetPasswordEntity, Long> {
  List<UserResetPasswordEntity> findByUserId(long userId);

  UserResetPasswordEntity findByToken(String token);
}
