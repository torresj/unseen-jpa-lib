package com.torresj.unseen.entities;

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
public class IterationEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(updatable = false)
  private Long id;

  @Column(updatable = false, nullable = false)
  private Long groupId;

  @Column(updatable = false)
  @CreationTimestamp
  private LocalDateTime createAt;

  @Column(nullable = false)
  @CreationTimestamp
  private LocalDateTime giftsDay;

  @Column private boolean closed;

  @Column private boolean seePairs;

  @Column private String budget;

  @Column private String comments;
}
