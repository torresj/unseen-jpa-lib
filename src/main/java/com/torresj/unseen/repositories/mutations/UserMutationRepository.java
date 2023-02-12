package com.torresj.unseen.repositories.mutations;

import com.torresj.unseen.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserMutationRepository extends CrudRepository<UserEntity, Long> {}
