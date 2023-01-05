package com.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entities.Customer;
import com.inventory.entities.Item;
import com.inventory.entities.Purchase;
import com.inventory.entities.Sales;
import com.inventory.services.CustomerService;

@RestController
@CrossOrigin(origins = "http://localhost/4200")
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	Sales sale;
	
	//Customer Regiser
	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody Customer customer){
		return ResponseEntity.ok(customerService.addCustomer(customer));
	}
	
	
	//customer login
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Customer customer){
		Customer cust=customerService.getCustomerByEmail(customer.getCustomerEmail());
		if(cust!=null)
			if(cust.getCustomerPassword().equals(customer.getCustomerPassword()))
				return ResponseEntity.ok(cust);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	//forgot password
	@PostMapping("/forgot")
    public ResponseEntity<?> forgotpassword(@RequestBody Customer customer){
		Customer cust=customerService.getCustomerByEmail(customer.getCustomerEmail());
		if(cust!=null)
			cust.setCustomerPassword(customer.getCustomerPassword());
		return ResponseEntity.ok(customerService.updateCustomer(cust));
		
	}
	
	//get customer by id
	@GetMapping("/customer/{cus_id}")
	public ResponseEntity<?> getCustomerById(@PathVariable("cus_id") long cus_id){
		Customer cust=customerService.getCustomerById(cus_id);
		if(cust!=null)
			return ResponseEntity.ok(cust);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	//get customer by name
	@GetMapping("/customer/{cus_name}")
	public ResponseEntity<?> getCustomerById(@PathVariable("cus_name") String cus_name){
		Customer cust=customerService.getCustomerByName(cus_name);
		if(cust!=null)
			return ResponseEntity.ok(cust);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	//get customer by email
		@GetMapping("/customer/{cus_email}")
		public ResponseEntity<?> getCustomerByEmail(@PathVariable("cus_email") String cus_email){
			Customer cust=customerService.getCustomerByEmail(cus_email);
			if(cust!=null)
				return ResponseEntity.ok(cust);
			return (ResponseEntity<?>)ResponseEntity.internalServerError();
		}
		
		//update customer by id
		@PutMapping("/update")
		public ResponseEntity<?> updateCustomer(@RequestBody Customer customer){
			Customer cust=customerService.getCustomerById(customer.getCustomerId());
			if(cust!=null)
				return ResponseEntity.ok(customerService.updateCustomer(customer));
			return (ResponseEntity<?>)ResponseEntity.internalServerError();
		}
		
		
		//to get all items by customer id
		@GetMapping("/items")
		public ResponseEntity<?> getAllItems(){
			List<Item> items=customerService.getAllItems();
			if(items.size()>0)
				return ResponseEntity.ok(items);
			return (ResponseEntity<?>)ResponseEntity.internalServerError();
			
		}
		
		
		//to get item by id
		@GetMapping("/items/{id}")
		public ResponseEntity<?> getItemById(@PathVariable("id") long id){
			Item item= customerService.getItemById(id);
			if(item!=null)
				return ResponseEntity.ok(item);
			return (ResponseEntity<?>)ResponseEntity.internalServerError();
		}
		
		
		
		//***********Purchase Section************//
		@PostMapping("/purchase")
		public ResponseEntity<?> addPurchase(@RequestBody Purchase purchase){
			Item item=customerService.getItemById(purchase.getItemId());
			if(item.getItemQuantity()>purchase.getPurchaseQuantity()) {
				item.setItemQuantity(item.getItemQuantity()-purchase.getPurchaseQuantity());
				purchase.setTotalPrice(item.getItemPrice()*purchase.getPurchaseQuantity());
				purchase.setItemName(item.getItemName());
				
				purchase.setCustomerName(customerService.getCustomerById(purchase.getCustomerId()).getCustomerName());
				customerService.updateItem(item);
			}
			
			//adding these deatils to sales
			  sale.setCustomerId(purchase.getCustomerId());
			  sale.setCustomerName(purchase.getCustomerName());
			  sale.setItemId(purchase.getItemId());
			  sale.setItemName(purchase.getItemName());
			  sale.setSaleDate(purchase.getPurchaseDate());
			  sale.setPriceperItem(purchase.getPriceperItem());
			  sale.setSaleQuantity(purchase.getPurchaseQuantity());
			  sale.setTotalPrice(purchase.getTotalPrice());
			  sale.setVendorId(item.getVendorId());
			  
			  customerService.addSale(sale);
			  
			  return ResponseEntity.ok(customerService.addPurchase(purchase));
			  
			}
		
		//get purchase by purchase id
		@GetMapping("/purchase/{id}")
		public ResponseEntity<?> getPurchaseById(@PathVariable("id") long id){
			Purchase purchase=customerService.getPurchaseById(id);
			if(purchase!=null)
				return ResponseEntity.ok(purchase);
			return (ResponseEntity<?>)ResponseEntity.internalServerError();
		}
		
		//get purchases by customer id
		@GetMapping("/puchase/get/{id}")
        public ResponseEntity<?> getPurchaseByCId(@PathVariable("id") long id){
			List<Purchase> purchases=customerService.getPurchasesByCustomer(id);
			if(purchases.size()>0)
				return ResponseEntity.ok(purchases);
			return (ResponseEntity<?>)ResponseEntity.internalServerError();
		}
}
