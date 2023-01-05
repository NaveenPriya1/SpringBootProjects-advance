package com.insurancep.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{
   
	public Customer findByEmailandpassword(String email,String password);
	
	public Customer findByEmail(String email);
}
