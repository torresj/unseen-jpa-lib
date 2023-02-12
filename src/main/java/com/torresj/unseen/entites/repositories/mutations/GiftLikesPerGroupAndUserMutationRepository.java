package com.torresj.unseen.entites.repositories.mutations;

import com.torresj.unseen.entites.GiftLikesPerGroupAndUserEntity;
import org.springframework.data.repository.CrudRepository;

public interface GiftLikesPerGroupAndUserMutationRepository
    extends CrudRepository<GiftLikesPerGroupAndUserEntity, Long> {}
