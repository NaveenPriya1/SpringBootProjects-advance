package com.inventory.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vendor {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long vendorId;
	private String vendorName;
	@Column(unique=true)
	private String vendorEmail;
	private String vendorPassword;
	private String vendorAddress;
	private String vendorPhone;
	
	//one vendor should sale multiple items
	@OneToMany(mappedBy = "Vendor")
	private List<Sales> sales;

	public Vendor() {
		super();
	}

	public Vendor(String vendorName, String vendorEmail, String vendorPassword, String vendorAddress,
			String vendorPhone) {
		super();
		this.vendorName = vendorName;
		this.vendorEmail = vendorEmail;
		this.vendorPassword = vendorPassword;
		this.vendorAddress = vendorAddress;
		this.vendorPhone = vendorPhone;
	}

	public long getVendorId() {
		return vendorId;
	}

	public void setVendorId(long vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorEmail() {
		return vendorEmail;
	}

	public void setVendorEmail(String vendorEmail) {
		this.vendorEmail = vendorEmail;
	}

	public String getVendorPassword() {
		return vendorPassword;
	}

	public void setVendorPassword(String vendorPassword) {
		this.vendorPassword = vendorPassword;
	}

	public String getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	public String getVendorPhone() {
		return vendorPhone;
	}

	public void setVendorPhone(String vendorPhone) {
		this.vendorPhone = vendorPhone;
	}

	public List<Sales> getSales() {
		return sales;
	}

	public void setSales(List<Sales> sales) {
		this.sales = sales;
	}

	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorEmail=" + vendorEmail
				+ ", vendorPassword=" + vendorPassword + ", vendorAddress=" + vendorAddress + ", vendorPhone="
				+ vendorPhone + "]";
	}
	
	
	
	
	
}
