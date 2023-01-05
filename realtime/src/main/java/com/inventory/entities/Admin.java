package com.inventory.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_login")
public class Admin {
      
	 @Id
	 @Column(unique = true)
	 private String ausername;
	 private String apassword;
	
	 public Admin() {
		super();
	}

	public Admin(String ausername, String apassword) {
		super();
		this.ausername = ausername;
		this.apassword = apassword;
	}

	public String getAusername() {
		return ausername;
	}

	public void setAusername(String ausername) {
		this.ausername = ausername;
	}

	public String getApassword() {
		return apassword;
	}

	public void setApassword(String apassword) {
		this.apassword = apassword;
	}

	@Override
	public String toString() {
		return "Admin [ausername=" + ausername + ", apassword=" + apassword + "]";
	}
	 
	 
	 
	 
}
