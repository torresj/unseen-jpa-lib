package com.torresj.unseen.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class PairEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(updatable = false)
  private Long id;

  @Column(updatable = false, nullable = false)
  private Long iterationId;

  @Column(nullable = false)
  private Long giftingUserId;

  @Column(nullable = false)
  private Long giftedUserId;

  @Column(updatable = false)
  @CreationTimestamp
  private LocalDateTime createAt;
}
