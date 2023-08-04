package com.pasim.blogApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pasim.blogApp.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);

}
