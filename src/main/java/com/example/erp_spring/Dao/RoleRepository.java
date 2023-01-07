package com.example.erp_spring.Dao;

import java.util.Optional;

import com.example.erp_spring.model.ERole;
import com.example.erp_spring.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
