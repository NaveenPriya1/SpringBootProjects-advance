package com.college.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.management.entities.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Long>{
   
	Admin findByUserName(String name);
}
