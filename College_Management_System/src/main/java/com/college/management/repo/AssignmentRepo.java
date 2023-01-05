package com.college.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.management.entities.Assignment;

@Repository
public interface AssignmentRepo extends JpaRepository<Assignment, Long>{

}
