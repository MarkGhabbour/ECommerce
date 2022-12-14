package com.simonkucher.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simonkucher.ecommerce.entity.models.CustomerOrder;


public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Integer> {

}
