package com.torresj.unseen.entites.repositories.mutations;

import com.torresj.unseen.entites.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserMutationRepository extends CrudRepository<UserEntity, Long> {}
