package com.torresj.unseen.repositories.mutations;

import com.torresj.unseen.entities.PairEntity;
import org.springframework.data.repository.CrudRepository;

public interface PairMutationRepository extends CrudRepository<PairEntity, Long> {}
