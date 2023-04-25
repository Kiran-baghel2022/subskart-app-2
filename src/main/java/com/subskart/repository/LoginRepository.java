package com.subskart.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subskart.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
	Optional<Login> findByEmail(String email);
    Optional<Login> findByUsernameOrEmail(String username, String email);
    Optional<Login> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
