package com.torresj.unseen.repositories.queries;

import com.torresj.unseen.entites.UserGroupRelationEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserGroupRelationQueryRepository
    extends CrudRepository<UserGroupRelationEntity, Long> {
  List<UserGroupRelationEntity> findByUserId(long userId);

  UserGroupRelationEntity findByUserIdAndGroupId(long userId, long groupId);

  List<UserGroupRelationEntity> findByGroupId(long groupId);
}
