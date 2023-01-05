package com.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventory.entities.Purchase;

@Repository
public interface PurchaseRepo extends JpaRepository<Purchase, Long>{
    
	List<Purchase> findByCustomerId(long customerId);
}
