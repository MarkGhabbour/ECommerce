package com.simonkucher.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simonkucher.ecommerce.domain.models.Customer;

 
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	
	
	
}
