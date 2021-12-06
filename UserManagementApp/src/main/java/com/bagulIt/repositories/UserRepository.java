package com.bagulIt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bagulIt.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
