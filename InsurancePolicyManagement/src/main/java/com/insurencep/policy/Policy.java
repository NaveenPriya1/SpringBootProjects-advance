package com.insurencep.policy;

import com.Insurance.Management.TodaysDate;

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
public class Policy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long policyId;
	@Column(nullable = false)
	private String policyName;
	@Column(nullable = false)
	private String policyCategory;
	@Column(nullable = false)
	private double policyPrice;
	
	private String policyDate=TodaysDate.todayDate();

	public Policy() {
		super();
	}

	public Policy(String policyName, String policyCategory, double policyPrice, String policyDate) {
		super();
		this.policyName = policyName;
		this.policyCategory = policyCategory;
		this.policyPrice = policyPrice;
		this.policyDate = policyDate;
	}

	public long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(long policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyCategory() {
		return policyCategory;
	}

	public void setPolicyCategory(String policyCategory) {
		this.policyCategory = policyCategory;
	}

	public double getPolicyPrice() {
		return policyPrice;
	}

	public void setPolicyPrice(double policyPrice) {
		this.policyPrice = policyPrice;
	}

	public String getPolicyDate() {
		return policyDate;
	}

	public void setPolicyDate(String policyDate) {
		this.policyDate = policyDate;
	}

	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", policyCategory=" + policyCategory
				+ ", policyPrice=" + policyPrice + ", policyDate=" + policyDate + "]";
	}
	
	

}
