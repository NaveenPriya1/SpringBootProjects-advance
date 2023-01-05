package com.insurancep.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurancep.exceptions.ProjectException;

@RestController
@CrossOrigin("http://localhost:4200")
@ControllerAdvice
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@PostMapping("/addcustomer")
	public ResponseEntity<?> addCustomer(@RequestBody Customer customer) {
		return ResponseEntity.ok(customerService.addCustomer(customer));
	}
	
	
	//show customer by email and password
	@GetMapping("/customer/{email}/{password}")
	public Customer getCustomerByEmailAndPass(@PathVariable("email") String customerEmail,@PathVariable("password")String customerPassword) {
		Customer c=customerService.getCByEmailAndPassword(customerEmail,customerPassword);
		if(c!=null)
			return c;
		throw new ProjectException();
	}
	
	@PutMapping("/update/{email}")
	public Customer updateCustomer(@PathVariable("email") String customerEmail,@RequestBody Customer customer) {
		try {
		Customer c=customerService.updateCustomerByemail(customerEmail,customer);
		if(c!=null)
			return c;
		throw new ProjectException();
		}catch(Exception e) {
			throw new ProjectException();
		}
	}
	
	@DeleteMapping("/deletec/{id}")
	public String deleteCustomerById(@PathVariable("id") long customerId) {
		try {
		customerService.deletecById(customerId);
		return customerId+" this deleted succesfully";
		}catch(Exception e) {
			throw new ProjectException();
		}
	}
}
