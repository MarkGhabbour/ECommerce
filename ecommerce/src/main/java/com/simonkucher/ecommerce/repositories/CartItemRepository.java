package com.simonkucher.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simonkucher.ecommerce.domain.models.CartItem;

 
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {

	
	
	
}
