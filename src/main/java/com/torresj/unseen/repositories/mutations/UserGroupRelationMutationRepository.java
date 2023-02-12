package com.torresj.unseen.repositories.mutations;

import com.torresj.unseen.entites.UserGroupRelationEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserGroupRelationMutationRepository
    extends CrudRepository<UserGroupRelationEntity, Long> {}
