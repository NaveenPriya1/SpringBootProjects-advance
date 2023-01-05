package com.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entities.Admin;
import com.inventory.entities.Customer;
import com.inventory.entities.Item;
import com.inventory.entities.Purchase;
import com.inventory.entities.Sales;
import com.inventory.entities.Vendor;
import com.inventory.services.AdminService;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	//to login
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Admin admin){
		Admin ad=adminService.getAdminByuserName(admin.getAusername());
		if(ad.getApassword().equals(admin.getApassword()))
			return ResponseEntity.ok(ad);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
		}
	
	//forgot password
	@PostMapping("/forgot")
	public ResponseEntity<?> forgot(@RequestBody Admin admin){
		Admin ad=adminService.getAdminByuserName(admin.getAusername());
		if(ad!=null) {
			ad.setApassword(admin.getApassword());
			return ResponseEntity.ok(adminService.addAdmin(ad));
		}
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
			}
	
	//************Items Section**********
	//to get all items
	@GetMapping("/items")
	public ResponseEntity<?> getAllItems(){
		List<Item> itemslist=adminService.getAllItems();
		if(itemslist.size()>0)
			return ResponseEntity.ok(itemslist);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	//to add item
	@PostMapping("/item")
	public ResponseEntity<?> addItem(@RequestBody Item item){
		Item items=adminService.addItem(item);
		if(items!=null)
			return ResponseEntity.ok(items);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
		
	}
	
	
	  //to delete item by id
	     @DeleteMapping("/item/{id}")
	     public void deleteById(@PathVariable("id") long id) {
	    	 adminService.deleteItemById(id);
	     }
	
	//to get item, by id
         @GetMapping("/item/{id}")
         public ResponseEntity<?> getItembyId(@PathVariable("id") long id){
        	 Item item=adminService.getItemById(id);
        	 if(item!=null)
        		 return ResponseEntity.ok(item);
        	 return (ResponseEntity<?>)ResponseEntity.internalServerError();
         }
         
         //***********Customer Section************
         @PostMapping("/addcustomer")
         public ResponseEntity<?> addCustomer(@RequestBody Customer customer){
        	 Customer cust=adminService.addCustomer(customer);   
        	 if(customer!=null)
        		 return ResponseEntity.ok(customer);
        	 return (ResponseEntity<?>)ResponseEntity.internalServerError();
         }
         
         @DeleteMapping("/delete/{id}")
         public void deleteCustomer(@PathVariable("id") long id) {
        	 adminService.deleteCustomerById(id);
         }
         
         @GetMapping("/getall")
         public ResponseEntity<?> getAllCust(){
        	 List<Customer> customerList=adminService.getAllCustomers();
        	 if(customerList.size()>0)
        		 return ResponseEntity.ok(customerList);
        	 return (ResponseEntity<?>)ResponseEntity.internalServerError();
         }
         
         @GetMapping("/customer/{id}")
         public ResponseEntity<?> getCustomerByid(@PathVariable("id") long id){
        	 Customer customer=adminService.getCustomerbyid(id);
        	 if(customer!=null)
        		 return ResponseEntity.ok(customer);
        	 return (ResponseEntity<?>)ResponseEntity.internalServerError();
         }
         
         //********vendor section****************
         
         @PostMapping("/addvendor")
         public ResponseEntity<?> addVendor(@RequestBody Vendor vendor){
        	 Vendor vend=adminService.addVendor(vendor);   
        	 if(vend!=null)
        		 return ResponseEntity.ok(vendor);
        	 return (ResponseEntity<?>)ResponseEntity.internalServerError();
         }
         
         @DeleteMapping("/deletevendor/{id}")
         public void deleteVendor(@PathVariable("id") long id) {
        	 adminService.deleteVendorById(id);
         }
         
         @GetMapping("/getallvendors")
         public ResponseEntity<?> getAllVendors(){
        	 List<Vendor> vendorList=adminService.getAllVendors();
        	 if(vendorList.size()>0)
        		 return ResponseEntity.ok(vendorList);
        	 return (ResponseEntity<?>)ResponseEntity.internalServerError();
         }
         
         @GetMapping("/vendor/{id}")
         public ResponseEntity<?> getVendorByid(@PathVariable("id") long id){
        	 Vendor vendor=adminService.getVendorbyid(id);
        	 if(vendor!=null)
        		 return ResponseEntity.ok(vendor);
        	 return (ResponseEntity<?>)ResponseEntity.internalServerError();
         }
         
         //*************Purchase Section**************
         @GetMapping("/getallPurchase")
         public ResponseEntity<?> getAllPurchases(){
        	 List<Purchase> purchaseList=adminService.getAllPurchases();
        	 if(purchaseList.size()>0)
        		 return ResponseEntity.ok(purchaseList);
        	 return (ResponseEntity<?>)ResponseEntity.internalServerError();
         }
         
         @GetMapping("/purchase/{id}")
         public ResponseEntity<?> getPurchaseByid(@PathVariable("id") long id){
        	 Purchase purchase=adminService.getPurchasebyid(id);
        	 if(purchase!=null)
        		 return ResponseEntity.ok(purchase);
        	 return (ResponseEntity<?>)ResponseEntity.internalServerError();
         }

         
         
         //*************Sales Section**************
         
         @GetMapping("/getallSales")
         public ResponseEntity<?> getAllSales(){
        	 List<Sales> salesList=adminService.getAllSales();
        	 if(salesList.size()>0)
        		 return ResponseEntity.ok(salesList);
        	 return (ResponseEntity<?>)ResponseEntity.internalServerError();
         }
         
         @GetMapping("/sales/{id}")
         public ResponseEntity<?> getSaleByid(@PathVariable("id") long id){
        	 Sales sales=adminService.getSalebyid(id);
        	 if(sales!=null)
        		 return ResponseEntity.ok(sales);
        	 return (ResponseEntity<?>)ResponseEntity.internalServerError();
         }

}
