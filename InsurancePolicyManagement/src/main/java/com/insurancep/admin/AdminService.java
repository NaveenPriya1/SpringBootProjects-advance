package com.insurancep.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurancep.customer.Customer;
import com.insurancep.customer.CustomerRepo;

@Service
public class AdminService {
	
	@Autowired
	AdminRepo adminRepo;
	@Autowired
	CustomerRepo customerRepo;

	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepo.save(admin);
	}

	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return adminRepo.findAll();
	}

	public Admin showAdminUsingLogin(String adminEmail, String adminPassword) {
		// TODO Auto-generated method stub
		return adminRepo.findByAdminemailAndAdminpassword(adminEmail, adminPassword);
	}

	public Admin findbyAdminEmail(String adminEmail) {
		// TODO Auto-generated method stub
		return adminRepo.findByAdminemail(adminEmail);
	}

	public Admin updateAdminByEmail(String adminEmail, Admin admin) {
		// TODO Auto-generated method stub
		Admin ad=adminRepo.findByAdminemail(adminEmail);
		if(ad!=null) {
			ad.setAdminAddress(admin.getAdminAddress());
			ad.setAdminAge(admin.getAdminAge());
			ad.setAdminGender(admin.getAdminGender());
			ad.setAdminName(admin.getAdminName());
			ad.setAdminPhoneno(admin.getAdminPhoneno());
			
			return adminRepo.save(ad);
		}else {
		return null;
		}
	}

	public void deleteAdminbyid(long adminId) {
		// TODO Auto-generated method stub
		adminRepo.deleteById(adminId);
	}

	public Admin updateAdminbyId(long adminId, Admin admin) {
		// TODO Auto-generated method stub
		Admin ad=adminRepo.findByAdminid(adminId);
		if(ad!=null) {
			ad.setAdminAddress(admin.getAdminAddress());
			ad.setAdminAge(admin.getAdminAge());
			ad.setAdminGender(admin.getAdminGender());
			ad.setAdminName(admin.getAdminName());
			ad.setAdminPhoneno(admin.getAdminPhoneno());
			ad.setAdminEmail(admin.getAdminEmail());
			ad.setAdminPassword(admin.getAdminPassword());
			return adminRepo.save(ad);
		}else{
		return null;
		}
	}

	public List<Customer> showAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

}
