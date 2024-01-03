package com.mystoreapplication.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mystoreapplication.dao.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {
	
}