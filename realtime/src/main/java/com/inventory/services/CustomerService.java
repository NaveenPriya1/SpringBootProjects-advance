package com.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entities.Customer;
import com.inventory.entities.Item;
import com.inventory.entities.Purchase;
import com.inventory.entities.Sales;
import com.inventory.repository.CustomerRepo;
import com.inventory.repository.ItemRepo;
import com.inventory.repository.PurchaseRepo;
import com.inventory.repository.SaleRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	ItemRepo itemRepo;
	
	@Autowired
	PurchaseRepo purchaseRepo;
	
	@Autowired
	SaleRepo saleRepo;
    
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	public Customer getCustomerByEmail(String customerEmail) {
		// TODO Auto-generated method stub
		return customerRepo.findByCustomerEmail(customerEmail);
	}

	public Customer updateCustomer(Customer cust) {
		// TODO Auto-generated method stub
		  Customer old=customerRepo.findById(cust.getCustomerId()).get();
		  old.setCustomerName(cust.getCustomerName());
		  old.setCustomerAddress(cust.getCustomerAddress());
		  old.setCustomerEmail(cust.getCustomerEmail());
		  old.setCustomerPassword(cust.getCustomerPassword());
		  old.setPhoneNumber(cust.getPhoneNumber());
		  
		return customerRepo.save(old);
	}

	public Customer getCustomerById(long cus_id) {
		// TODO Auto-generated method stub
		return customerRepo.findById(cus_id).get();
	}

	public Customer getCustomerByName(String cus_name) {
		// TODO Auto-generated method stub
		return customerRepo.findByCustomerName(cus_name);
	}

	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		return itemRepo.findAll();
	}

	public Item getItemById(long id) {
		// TODO Auto-generated method stub
		return itemRepo.findById(id).get();
	}

	public void updateItem(Item item) {
		// TODO Auto-generated method stub
		itemRepo.save(item);
	}

	public void addSale(Sales sale) {
		// TODO Auto-generated method stub
		saleRepo.save(sale);
	}

	public Purchase addPurchase(Purchase purchase) {
		// TODO Auto-generated method stub
		return purchaseRepo.save(purchase);
	}

	public Purchase getPurchaseById(long id) {
		// TODO Auto-generated method stub
		return purchaseRepo.findById(id).get();
	}

	public List<Purchase> getPurchasesByCustomer(long id) {
		// TODO Auto-generated method stub
		return purchaseRepo.findByCustomerId(id);
	}

}
