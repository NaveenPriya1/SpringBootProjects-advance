package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventory.entities.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, String>{

}
