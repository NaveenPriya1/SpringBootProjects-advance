package com.insurancep.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurancep.customer.Customer;
import com.insurancep.customer.CustomerService;
import com.insurancep.exceptions.ProjectException;

@RestController
@CrossOrigin("http://localhost:4200")
public class AdminController {
	
	HttpStatus hs;
	
	@Autowired
	AdminService adminService;
	
	
	@PostMapping("/addadmin")
	public Admin addAdmin(@RequestBody Admin admin) {
		try {
		return adminService.saveAdmin(admin);
		}catch(Exception e) {
			throw new ProjectException();
		}
	}
	
	
	//getting data from admintale
	
	@GetMapping("/alladmin")
	public List<Admin> showAllAdmins(){
		return adminService.getAllAdmins();
	}
	
	//getting data using emailid and password
	@GetMapping("/showadmindata/{email}/{password}")
	public Admin showAdmin(@PathVariable("email") String adminEmail,@PathVariable("password") String adminPassword) {
		
		Admin admin=adminService.showAdminUsingLogin(adminEmail,adminPassword);
		
		if(admin!=null)
			return admin;
		throw new ProjectException("admin not found");
	}
	
	@GetMapping("/loweradmin/{email}")
	public Admin getAdminByEmail(@PathVariable("email") String adminEmail) {
		Admin admin= adminService.findbyAdminEmail(adminEmail);
		if(admin!=null)
			return admin;
		throw new ProjectException("admin not found");
	}
	
	@PutMapping("/update")
	public HttpStatus updateAdmin(@RequestBody Admin admin) {
		try {
		Admin ad=adminService.updateAdminByEmail(admin.getAdminEmail(),admin);
		if(ad!=null)
			return hs.OK;
		throw new ProjectException("admin not found");
		}catch(Exception e) {
			throw new ProjectException();
		}
	}
	
	//delete data in admin
	@DeleteMapping("/delete/{id}")
	public String deleteAdminById(@PathVariable("id") long adminId) {
		try {
			adminService.deleteAdminbyid(adminId);
			return adminId+" is deleted";
		}catch(Exception e) {
			throw new ProjectException();
		}
	}
	
	
	//update admin by id
	
	@PutMapping("updateadmin")
	public Admin updateAdminbyid(@RequestBody Admin admin) {
		
		try {
		Admin ad=adminService.updateAdminbyId(admin.getAdminId(),admin);
		if(ad!=null)
			return ad;
		throw new ProjectException();
		}catch(Exception e) {
			throw new ProjectException();
		}
	}
     
	//customer section
	@GetMapping("/allcustomers")
	public ResponseEntity<?> showAllcustomers(){
		List<Customer> customers=adminService.showAllCustomers();
		if(customers.size()>0)
			return ResponseEntity.ok(customers);
		throw new ProjectException();
	}
	
	//count customer
	@GetMapping("/count")
	public int countCustomers() {
		List<Customer> customers=adminService.showAllCustomers();
		return customers.size();
	}
	
	
}
