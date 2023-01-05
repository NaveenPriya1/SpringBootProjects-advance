package com.college.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.management.entities.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

	Student FindByUserName(String studentUsername);
}
