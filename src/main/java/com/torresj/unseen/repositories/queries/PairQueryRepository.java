package com.torresj.unseen.repositories.queries;

import com.torresj.unseen.entities.PairEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PairQueryRepository extends CrudRepository<PairEntity, Long> {
  List<PairEntity> findByGiftingUserIdOrGiftedUserId(long userIdA, long userIdB);

  Page<PairEntity> findByGiftingUserIdOrGiftedUserId(long userIdA, long userIdB, Pageable pageable);

  List<PairEntity> findByIterationIdAndGiftingUserIdOrGiftedUserId(
      long iterationId, long userIdA, long userIdB);

  Page<PairEntity> findByIterationIdAndGiftingUserIdOrGiftedUserId(
      long iterationId, long userIdA, long userIdB, Pageable pageable);

  List<PairEntity> findByIterationId(long iterationId);

  Page<PairEntity> findByIterationId(long iterationId, Pageable pageable);

  PairEntity findByIterationIdAndGiftingUserId(long iterationId, long giftingUserId);

  Page<PairEntity> findByIterationIdAndGiftingUserId(
      long iterationId, long giftingUserId, Pageable pageable);

  Page<PairEntity> findAll(Pageable pageable);
}
