package com.torresj.unseen.entites.repositories.queries;

import com.torresj.unseen.entites.IterationEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IterationQueryRepository extends CrudRepository<IterationEntity, Long> {
  List<IterationEntity> findByGroupId(long groupId);

  Page<IterationEntity> findByGroupId(long groupId, Pageable pageable);

  Page<IterationEntity> findAll(Pageable pageable);

  List<IterationEntity> findByClosedFalse();
}
