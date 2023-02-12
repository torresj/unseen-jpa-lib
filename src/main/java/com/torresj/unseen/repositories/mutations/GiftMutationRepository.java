package com.torresj.unseen.repositories.mutations;

import com.torresj.unseen.entities.GiftEntity;
import org.springframework.data.repository.CrudRepository;

public interface GiftMutationRepository extends CrudRepository<GiftEntity, Long> {}
