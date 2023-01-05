package com.insurancep.admin;

import com.Insurance.Management.TodaysDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;




@Entity
@Data
public class Admin {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long adminId;
	private String adminName;
	@Column(unique = true,nullable = false)
	private String adminEmail;
	@Column(nullable = false)
	private String adminPassword;
	private String adminPhoneno;
	private String adminAge;
	private String adminGender;
	private String adminAddress;
	
	private String seniorManagerEmail;
	private String adminJoinDate=TodaysDate.todayDate();
	
	public Admin() {
		super();
	}

	public Admin(String adminName, String adminEmail, String adminPassword, String adminPhoneno, String adminAge,
			String adminGender, String adminAddress, String seniorManagerEmail, String adminJoinDate) {
		super();
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
		this.adminPhoneno = adminPhoneno;
		this.adminAge = adminAge;
		this.adminGender = adminGender;
		this.adminAddress = adminAddress;
		this.seniorManagerEmail = seniorManagerEmail;
		this.adminJoinDate = adminJoinDate;
	}

	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminPhoneno() {
		return adminPhoneno;
	}

	public void setAdminPhoneno(String adminPhoneno) {
		this.adminPhoneno = adminPhoneno;
	}

	public String getAdminAge() {
		return adminAge;
	}

	public void setAdminAge(String adminAge) {
		this.adminAge = adminAge;
	}

	public String getAdminGender() {
		return adminGender;
	}

	public void setAdminGender(String adminGender) {
		this.adminGender = adminGender;
	}

	public String getAdminAddress() {
		return adminAddress;
	}

	public void setAdminAddress(String adminAddress) {
		this.adminAddress = adminAddress;
	}

	public String getSeniorManagerEmail() {
		return seniorManagerEmail;
	}

	public void setSeniorManagerEmail(String seniorManagerEmail) {
		this.seniorManagerEmail = seniorManagerEmail;
	}

	public String getAdminJoinDate() {
		return adminJoinDate;
	}

	public void setAdminJoinDate(String adminJoinDate) {
		this.adminJoinDate = adminJoinDate;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminEmail=" + adminEmail
				+ ", adminPassword=" + adminPassword + ", adminPhoneno=" + adminPhoneno + ", adminAge=" + adminAge
				+ ", adminGender=" + adminGender + ", adminAddress=" + adminAddress + ", seniorManagerEmail="
				+ seniorManagerEmail + ", adminJoinDate=" + adminJoinDate + "]";
	}
	
	
	
	
	
}
