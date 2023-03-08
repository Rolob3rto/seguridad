package com.roberto.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roberto.seguridad.model.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
