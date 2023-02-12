package com.torresj.unseen.repositories.mutations;

import com.torresj.unseen.entities.GiftLikesPerGroupAndUserEntity;
import org.springframework.data.repository.CrudRepository;

public interface GiftLikesPerGroupAndUserMutationRepository
    extends CrudRepository<GiftLikesPerGroupAndUserEntity, Long> {}
