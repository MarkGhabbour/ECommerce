package com.simonkucher.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simonkucher.ecommerce.entity.models.CustomerOrderLineItemKey;

public interface CustomerOrderLineItem extends JpaRepository<CustomerOrderLineItemKey, Integer> {

	
	
}
