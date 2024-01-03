package com.mystoreapplication.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mystoreapplication.dao.entity.User;



public interface UserRepository extends JpaRepository<User, Long> {
    
	User findByEmail (String email);
}