package com.simonkucher.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simonkucher.ecommerce.domain.models.Payment;

 
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

	
	
	
}
