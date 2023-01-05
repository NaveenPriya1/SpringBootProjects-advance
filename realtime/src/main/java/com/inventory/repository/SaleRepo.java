package com.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventory.entities.Sales;

@Repository
public interface SaleRepo extends JpaRepository<Sales, Long>{
     
	List<Sales> finfByVendorId(long vendorId);
}
