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

import com.inventory.entities.Item;
import com.inventory.entities.Sales;
import com.inventory.entities.Vendor;
import com.inventory.services.VendorServiece;

@RestController
@RequestMapping("/vendor")
@CrossOrigin(allowedHeaders = "*",origins = "*")
public class VendorController {
	
	@Autowired
	VendorServiece vendorService;
	
	@PostMapping("/register")
	public ResponseEntity<?> vendorRegister(@RequestBody Vendor vendor) {
		
		return ResponseEntity.ok(vendorService.addVendor(vendor));
		
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<?> vendorLogin(@RequestBody Vendor vendor){
		
		Vendor db=vendorService.getVendorByEmail(vendor.getVendorEmail());
		
		if(db.getVendorPassword().equals(vendor.getVendorPassword())) {
			return ResponseEntity.ok(db);
		}
		
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	
	@PostMapping("/forgot")
	public ResponseEntity<?> forgotPassword(@RequestBody Vendor vendor){
		Vendor v=vendorService.getVendorByEmail(vendor.getVendorEmail());
		
		v.setVendorPassword(vendor.getVendorPassword());
		return ResponseEntity.ok(vendorService.addVendor(v));
	}
	
	//get vendor by id
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getVendorById(@PathVariable("id") long id){
		
		Vendor vendor=vendorService.getVendorById(id);
		
		return ResponseEntity.ok(vendor);
		
	}
	
	
     @PostMapping("/item")
	public ResponseEntity<?> addItem(@RequestBody Item item){
		
		return ResponseEntity.ok(vendorService.addItem(item));
		
	}
     
     @GetMapping("/items/{vid}")
     public ResponseEntity<?> getAllItems(@PathVariable("vid") long vid){
    	
    	 List<Item> itemList=vendorService.getAllItemsByVid(vid);
    	if(itemList.size()>0)
    		return ResponseEntity.ok(itemList);
    	 return (ResponseEntity<?>)ResponseEntity.internalServerError();
     }
     
     @GetMapping("/item/get/{iid}")
     public ResponseEntity<?> getitemById(@PathVariable("iid") long iid){
    	 Item item=vendorService.getItemById(iid);
    	 if(item!=null)
    		 return ResponseEntity.ok(item);
    	 return (ResponseEntity<?>)ResponseEntity.internalServerError();
     }
     
     @GetMapping("/sales/{vid}")
     public ResponseEntity<?> getSalesByVendorId(@PathVariable("vid") long vid){
    	 List<Sales> totalsale=vendorService.getSalesByVendorId(vid);
    	 
    	 if(totalsale.size()>0)
    		 return ResponseEntity.ok(totalsale);
    	 return (ResponseEntity<?>)ResponseEntity.internalServerError();
     }
     
     
     @GetMapping("/sales/get/{id}")
     public ResponseEntity<?> getSaleByid(@PathVariable("id") long id){
    	 
    	 Sales sales=vendorService.getSaleById(id);
    	 if(sales!=null)
    		 return ResponseEntity.ok(sales);
    	 return (ResponseEntity<?>)ResponseEntity.internalServerError();
     }
     
     @DeleteMapping("/delete/{id}")
     public void deleteItemById(@PathVariable("id") long id) {
    	 vendorService.deleteById(id);
     }

}
