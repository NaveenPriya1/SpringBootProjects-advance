package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventory.entities.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{
   
	//this method goes to jpa repository and create a query for parameter customername
	//and return the Customer object
	Customer findByCustomerName(String customerName);
	
	//this method goes to jpa repository and create a query for parameter customerEmail 
	//and return customer object
	Customer findByCustomerEmail(String customerEmail);
	
}
