package com.torresj.unseen.repositories.queries;

import com.torresj.unseen.entities.PairGiftRelationEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PairGiftRelationQueryRepository
    extends CrudRepository<PairGiftRelationEntity, Long> {
  List<PairGiftRelationEntity> findByPairId(long pairId);

  List<PairGiftRelationEntity> findByGiftId(long giftId);

  PairGiftRelationEntity findByPairIdAndGiftId(long pairId, long giftId);
}
