package com.torresj.unseen.repositories.mutations;

import com.torresj.unseen.entities.UserResetPasswordEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserResetPasswordMutationRepository
    extends CrudRepository<UserResetPasswordEntity, Long> {}
