package com.sourav.springsecurity.identity.repository;

import com.sourav.springsecurity.identity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignupRepository extends JpaRepository<UserEntity, Integer> {
}
