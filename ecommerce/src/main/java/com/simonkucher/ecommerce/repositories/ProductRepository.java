package com.simonkucher.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simonkucher.ecommerce.entity.models.Product;

 
public interface ProductRepository extends JpaRepository<Product, Integer> {

	
	
	
}
