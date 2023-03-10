package com.inventory.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inventory.entities.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item, Long>{

	 Item fingItemByName(String itemName);
	 
	 List<Item> findByItemName(String itemName);
	 
	 @Modifying
	 @Query("delete from item i where i.vendorId=:id")
	 void deleteitems(@Param("id") long id);
	 
	 @Transactional
	 void deleteByVendorId(long vendorId);
	 
	 List<Item> findByVendorId(long id);
}
