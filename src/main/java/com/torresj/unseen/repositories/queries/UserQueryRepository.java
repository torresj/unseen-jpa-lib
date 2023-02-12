package com.torresj.unseen.repositories.queries;

import com.torresj.unseen.entities.AuthProvider;
import com.torresj.unseen.entities.Role;
import com.torresj.unseen.entities.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserQueryRepository extends CrudRepository<UserEntity, Long> {
  Optional<UserEntity> findByEmail(String email);

  Page<UserEntity> findAll(Pageable pageable);

  Page<UserEntity> findByEmailContainingIgnoreCase(String email, Pageable pageable);

  Page<UserEntity> findByEmailContainingIgnoreCaseAndRole(
      String email, Role role, Pageable pageable);

  Page<UserEntity> findByRole(Role role, Pageable pageable);

  long countByProvider(AuthProvider provider);
}
