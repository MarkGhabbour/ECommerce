package com.simonkucher.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simonkucher.ecommerce.domain.models.EmailSubscriber;

 
public interface EmailSubscriberRepository extends JpaRepository<EmailSubscriber, Integer> {

	
	
	
}
