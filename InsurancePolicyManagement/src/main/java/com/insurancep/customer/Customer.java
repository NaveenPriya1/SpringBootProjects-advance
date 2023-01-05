package com.insurancep.customer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
	private String customerName;
	@Column(unique = true,nullable = false)
	private String customerEmail;
	@Column(nullable = false)
	private String customerPassword;
	private String customerPhoneno;
	private String customerAddress;
	private String customerAge;
	private String customerGender;
	
	public Customer() {
		super();
	}

	public Customer(String customerName, String customerEmail, String customerPassword, String customerPhoneno,
			String customerAddress, String customerAge, String customerGender) {
		super();
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
		this.customerPhoneno = customerPhoneno;
		this.customerAddress = customerAddress;
		this.customerAge = customerAge;
		this.customerGender = customerGender;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerPhoneno() {
		return customerPhoneno;
	}

	public void setCustomerPhoneno(String customerPhoneno) {
		this.customerPhoneno = customerPhoneno;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(String customerAge) {
		this.customerAge = customerAge;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerPassword=" + customerPassword + ", customerPhoneno=" + customerPhoneno
				+ ", customerAddress=" + customerAddress + ", customerAge=" + customerAge + ", customerAdress="
				+ customerGender + "]";
	}
	
	
	
	
}
