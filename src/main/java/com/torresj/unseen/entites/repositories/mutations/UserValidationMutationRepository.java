package com.torresj.unseen.entites.repositories.mutations;

import com.torresj.unseen.entites.UserValidationEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserValidationMutationRepository
    extends CrudRepository<UserValidationEntity, Long> {}
