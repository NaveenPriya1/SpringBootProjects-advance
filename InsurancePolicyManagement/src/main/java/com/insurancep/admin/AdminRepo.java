package com.insurancep.admin;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface AdminRepo extends JpaRepository<Admin, Long>{
	
	public Admin findByAdminemailAndAdminpassword(String adminEmail,String adminPassword);
     
	public Admin findByAdminemail(String adminEmail);
	
	public List<Admin> findBySeniorManagerEmail(String seniorManagerEmail);
	
	public Admin findByAdminid(long adminId);
}
