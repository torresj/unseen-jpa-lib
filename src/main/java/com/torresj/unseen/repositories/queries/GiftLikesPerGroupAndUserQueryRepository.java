package com.torresj.unseen.repositories.queries;

import com.torresj.unseen.entites.GiftLikesPerGroupAndUserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GiftLikesPerGroupAndUserQueryRepository
    extends CrudRepository<GiftLikesPerGroupAndUserEntity, Long> {
  GiftLikesPerGroupAndUserEntity findByGiftIdAndGroupIdAndUserId(
      long giftId, long groupId, long userId);

  List<GiftLikesPerGroupAndUserEntity> findByGiftIdAndGroupId(long giftId, long groupId);

  List<GiftLikesPerGroupAndUserEntity> findByGiftIdAndUserId(long giftId, long userId);

  List<GiftLikesPerGroupAndUserEntity> findByGiftId(long giftId);

  List<GiftLikesPerGroupAndUserEntity> findByGroupId(long groupId);

  List<GiftLikesPerGroupAndUserEntity> findByUserId(long userId);
}
