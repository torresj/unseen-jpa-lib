package com.torresj.unseen.repositories.queries;

import com.torresj.unseen.entities.GroupEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GroupQueryRepository extends CrudRepository<GroupEntity, Long> {
  Page<GroupEntity> findByNameContainingOrCodeEquals(String name, String code, Pageable pageable);

  Page<GroupEntity> findByNameContainingIgnoreCaseAndOwner(
      String name, long owner, Pageable pageable);

  Page<GroupEntity> findByOwner(long owner, Pageable pageable);

  List<GroupEntity> findByOwner(long owner);

  Page<GroupEntity> findAll(Pageable pageable);

  GroupEntity findByCode(String code);
}
