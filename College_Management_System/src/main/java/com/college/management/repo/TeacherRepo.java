package com.college.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.management.entities.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long>{

}
