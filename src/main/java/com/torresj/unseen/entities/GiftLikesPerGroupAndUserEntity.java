package com.torresj.unseen.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class GiftLikesPerGroupAndUserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(updatable = false)
  private Long id;


  @Column(nullable = false)
  private Long giftId;

  @Column(nullable = false)
  private Long groupId;

  @Column(nullable = false)
  private Long userId;

  @Column(nullable = false)
  private LikeStatus likeStatus;
}
