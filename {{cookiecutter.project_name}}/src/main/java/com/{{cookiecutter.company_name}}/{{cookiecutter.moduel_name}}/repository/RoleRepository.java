package com.{{cookiecutter.company_name}}.{{cookiecutter.moduel_name}}.repository;

import com.{{cookiecutter.company_name}}.{{cookiecutter.moduel_name}}.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

}
