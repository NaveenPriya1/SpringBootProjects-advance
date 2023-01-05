package com.insurancep.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepo customerRepo;

	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	public Customer getCByEmailAndPassword(String customerEmail, String customerPassword) {
		return customerRepo.findByEmailandpassword(customerEmail, customerPassword);
		// TODO Auto-generated method stub
		
	}

	public Customer updateCustomerByemail(String customerEmail, Customer customer) {
		// TODO Auto-generated method stub
		Customer cust=customerRepo.findByEmail(customerEmail);
		if(cust!=null) {
		    cust.setCustomerAddress(customer.getCustomerAddress());
		    cust.setCustomerGender(customer.getCustomerGender());
		    cust.setCustomerAge(customer.getCustomerAge());
		    cust.setCustomerName(customer.getCustomerName());
		    cust.setCustomerPassword(customer.getCustomerPassword());
		    cust.setCustomerPhoneno(customer.getCustomerPhoneno());
		    cust.setCustomerEmail(customer.getCustomerEmail());
		return customerRepo.save(cust);
		}else {
			return null;
		}
	}

	public void deletecById(long customerId) {
		// TODO Auto-generated method stub
		customerRepo.deleteById(customerId);
	}

}
