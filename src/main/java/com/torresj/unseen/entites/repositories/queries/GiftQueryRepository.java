package com.torresj.unseen.entites.repositories.queries;

import com.torresj.unseen.entites.GiftEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GiftQueryRepository extends CrudRepository<GiftEntity, Long> {
  Page<GiftEntity> findAll(Pageable pageable);

  GiftEntity findByName(String name);

  List<GiftEntity> findByNameContainingIgnoreCase(String filter);

  Page<GiftEntity> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
