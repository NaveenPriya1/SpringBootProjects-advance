package com.college.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.management.entities.Parent;

@Repository
public interface ParentRepo extends JpaRepository<Parent, Long>{

}
