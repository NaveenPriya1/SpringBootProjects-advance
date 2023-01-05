package com.inventory.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entities.Item;
import com.inventory.entities.Sales;
import com.inventory.entities.Vendor;
import com.inventory.repository.ItemRepo;
import com.inventory.repository.SaleRepo;
import com.inventory.repository.VendorRepo;

@Service
public class VendorServiece {
	     
	   @Autowired
	    VendorRepo venderRepo;
	   @Autowired
	   ItemRepo itemRepo;
       @Autowired
       SaleRepo saleRepo;
	   
	public Vendor addVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return venderRepo.save(vendor);
	}

	
	
	public Vendor getVendorByEmail(String vendorEmail) {
		// TODO Auto-generated method stub
		return venderRepo.findByEmail(vendorEmail);
	}



	public Vendor getVendorById(long id) {
		Optional<Vendor> vendor=venderRepo.findById(id);
		if(vendor.isEmpty())
			return null;
		return vendor.get();
	}



	public Item addItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepo.save(item);
	}



	public List<Item> getAllItemsByVid(long vid) {
		// TODO Auto-generated method stub
		return itemRepo.findByVendorId(vid);
	}



	public Item getItemById(long iid) {
		// TODO Auto-generated method stub
		return itemRepo.findById(iid).get();
	}



	public List<Sales> getSalesByVendorId(long vid) {
		// TODO Auto-generated method stub
		return saleRepo.finfByVendorId(vid);
	}



	public Sales getSaleById(long id) {
		Optional<Sales> sales=saleRepo.findById(id);
		if(sales.isPresent())
			return sales.get();
		return null;
	}



	public void deleteById(long id) {
		// TODO Auto-generated method stub
		itemRepo.deleteById(id);
	}
	

	
}



