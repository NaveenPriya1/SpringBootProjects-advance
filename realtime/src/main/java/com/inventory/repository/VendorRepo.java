package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventory.entities.Vendor;

@Repository
public interface VendorRepo extends JpaRepository<Vendor, Long>{
   
	Vendor findByEmail(String vendorEmail);
}
