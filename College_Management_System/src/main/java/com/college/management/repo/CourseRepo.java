package com.college.management.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.management.entities.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long>{
   
	List<Course> getCourceByStudentId(long studentId);
	
	Course getCourseByName(String courseName);
}
