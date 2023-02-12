package com.torresj.unseen.entites.repositories.mutations;

import com.torresj.unseen.entites.UserResetPasswordEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserResetPasswordMutationRepository
    extends CrudRepository<UserResetPasswordEntity, Long> {}
