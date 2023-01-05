package com.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entities.Admin;
import com.inventory.entities.Customer;
import com.inventory.entities.Item;
import com.inventory.entities.Purchase;
import com.inventory.entities.Sales;
import com.inventory.entities.Vendor;
import com.inventory.repository.AdminRepo;
import com.inventory.repository.CustomerRepo;
import com.inventory.repository.ItemRepo;
import com.inventory.repository.PurchaseRepo;
import com.inventory.repository.SaleRepo;
import com.inventory.repository.VendorRepo;

@Service
public class AdminService {
	
	@Autowired
	AdminRepo adminRepo;
	
	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	PurchaseRepo purchaseRepo;
	
	@Autowired
	SaleRepo saleRepo;
	
	@Autowired
	VendorRepo vendorRepo;
	
	@Autowired
	ItemRepo itemRepo;
	
	

	public Admin getAdminByuserName(String ausername) {
		// TODO Auto-generated method stub
		return adminRepo.findById(ausername).get();
	}

	public Admin addAdmin(Admin ad) {
		// TODO Auto-generated method stub
		return adminRepo.save(ad);
	}

	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		return itemRepo.findAll();
	}

	public Item addItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepo.save(item);
	}

	public void deleteItemById(long id) {
		// TODO Auto-generated method stub
		itemRepo.deleteById(id);
	}

	public Item getItemById(long id) {
		// TODO Auto-generated method stub
		return itemRepo.findById(id).get();
	}

	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	public void deleteCustomerById(long id) {
		// TODO Auto-generated method stub
		customerRepo.deleteById(id);
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

	public Customer getCustomerbyid(long id) {
		// TODO Auto-generated method stub
		return customerRepo.findById(id).get();
	}

	public Vendor addVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return vendorRepo.save(vendor);
	}

	public void deleteVendorById(long id) {
		// TODO Auto-generated method stub
		vendorRepo.deleteById(id);
	}

	public List<Vendor> getAllVendors() {
		// TODO Auto-generated method stub
		return vendorRepo.findAll();
	}

	public Vendor getVendorbyid(long id) {
		// TODO Auto-generated method stub
		return vendorRepo.findById(id).get();
	}

	public List<Purchase> getAllPurchases() {
		// TODO Auto-generated method stub
		return purchaseRepo.findAll();
	}

	public Purchase getPurchasebyid(long id) {
		// TODO Auto-generated method stub
		return purchaseRepo.findById(id).get();
	}

	public List<Sales> getAllSales() {
		// TODO Auto-generated method stub
		return saleRepo.findAll();
	}

	public Sales getSalebyid(long id) {
		// TODO Auto-generated method stub
		return saleRepo.findById(id).get();
	}

}
