package com.torresj.unseen.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class GiftEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(updatable = false)
  private Long id;

  @Column(updatable = false)
  @CreationTimestamp
  private LocalDateTime createAt;

  @Column @UpdateTimestamp private LocalDateTime updateAt;

  @Column(unique = true, nullable = false, updatable = false)
  private String name;
}
