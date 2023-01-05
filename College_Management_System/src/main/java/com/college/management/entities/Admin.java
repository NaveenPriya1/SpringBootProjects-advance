package com.college.management.entities;

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
public class Admin {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long adminId;
	@Column(nullable = false)
	private String adminName;
	@Column(nullable = false)
	private String adminUsername;
	@Column(nullable = false)
	private String adminPassword;
	@Column(nullable = false)
	private String adminEmail;
	private String adminPhone;
	private String adminAddress;
	
	
	public Admin() {
		super();
	}
	public Admin(String adminName, String adminUsername, String adminPassword, String adminEmail, String adminPhone,
			String adminAddress) {
		super();
		this.adminName = adminName;
		this.adminUsername = adminUsername;
		this.adminPassword = adminPassword;
		this.adminEmail = adminEmail;
		this.adminPhone = adminPhone;
		this.adminAddress = adminAddress;
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
	public String getAdminUsername() {
		return adminUsername;
	}
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPhone() {
		return adminPhone;
	}
	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}
	public String getAdminAddress() {
		return adminAddress;
	}
	public void setAdminAddress(String adminAddress) {
		this.adminAddress = adminAddress;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminUsername=" + adminUsername
				+ ", adminPassword=" + adminPassword + ", adminEmail=" + adminEmail + ", adminPhone=" + adminPhone
				+ ", adminAddress=" + adminAddress + "]";
	}
	
	
}
