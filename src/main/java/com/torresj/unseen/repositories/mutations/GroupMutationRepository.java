package com.torresj.unseen.repositories.mutations;

import com.torresj.unseen.entities.GroupEntity;
import org.springframework.data.repository.CrudRepository;

public interface GroupMutationRepository extends CrudRepository<GroupEntity, Long> {}
