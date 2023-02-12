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
public class UserValidationEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(updatable = false)
  private Long id;

  @Column(updatable = false)
  @CreationTimestamp
  private LocalDateTime createAt;

  @Column(nullable = false, updatable = false)
  private Long userId;

  @Column(nullable = false, updatable = false)
  private String token;

  @Column(nullable = false)
  private int attempts;
}
