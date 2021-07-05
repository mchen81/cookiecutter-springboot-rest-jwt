package com.{{cookiecutter.company_name}}.{{cookiecutter.moduel_name}}.repository;

import com.{{cookiecutter.company_name}}.{{cookiecutter.moduel_name}}.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByUsername(String username);

    Optional<UserEntity> findByEmail(String email);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
