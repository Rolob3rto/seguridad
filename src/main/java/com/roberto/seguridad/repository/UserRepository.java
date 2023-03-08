package com.roberto.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roberto.seguridad.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByNombre(String userName);
}
