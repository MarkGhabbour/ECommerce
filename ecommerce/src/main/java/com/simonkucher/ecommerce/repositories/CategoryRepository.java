package com.simonkucher.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simonkucher.ecommerce.entity.models.Category;

 
public interface CategoryRepository extends JpaRepository<Category, Integer> {

	
	
	
}
