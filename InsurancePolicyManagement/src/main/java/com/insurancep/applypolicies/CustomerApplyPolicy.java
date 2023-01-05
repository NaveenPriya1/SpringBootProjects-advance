package com.insurancep.applypolicies;

import com.Insurance.Management.TodaysDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="customerApply_policies")
public class CustomerApplyPolicy {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long applicaid;
	@Column(nullable = false)
	private long customerId;
	@Column(nullable = false)
	private String customerName;
	@Column(nullable = false)
	private String customerEmail;
	private double policyPrice;
	@Column(nullable = false)
	private String policyCategory;
	private String policyname;
	private String policyStatus="pending";
	private String policyApplaydate=TodaysDate.todayDate();
	
	public CustomerApplyPolicy() {
		super();
	}

	public CustomerApplyPolicy(long customerId, String customerName, String customerEmail, double policyPrice,
			String policyCategory, String policyname, String policyStatus, String policyApplaydate) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.policyPrice = policyPrice;
		this.policyCategory = policyCategory;
		this.policyname = policyname;
		this.policyStatus = policyStatus;
		this.policyApplaydate = policyApplaydate;
	}

	public long getPolicyid() {
		return applicaid;
	}

	public void setPolicyid(long policyid) {
		this.applicaid = policyid;
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

	public double getPolicyPrice() {
		return policyPrice;
	}

	public void setPolicyPrice(double policyPrice) {
		this.policyPrice = policyPrice;
	}

	public String getPolicyCategory() {
		return policyCategory;
	}

	public void setPolicyCategory(String policyCategory) {
		this.policyCategory = policyCategory;
	}

	public String getPolicyname() {
		return policyname;
	}

	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public String getPolicyApplaydate() {
		return policyApplaydate;
	}

	public void setPolicyApplaydate(String policyApplaydate) {
		this.policyApplaydate = policyApplaydate;
	}

	@Override
	public String toString() {
		return "CustomerApplyPolicy [policyid=" + applicaid + ", customerId=" + customerId + ", customerName="
				+ customerName + ", customerEmail=" + customerEmail + ", policyPrice=" + policyPrice
				+ ", policyCategory=" + policyCategory + ", policyname=" + policyname + ", policyStatus=" + policyStatus
				+ ", policyApplaydate=" + policyApplaydate + "]";
	}
	
	
	
}
