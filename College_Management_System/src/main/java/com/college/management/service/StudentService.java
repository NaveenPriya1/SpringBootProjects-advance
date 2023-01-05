package com.college.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.management.entities.Course;
import com.college.management.entities.Student;
import com.college.management.repo.CourseRepo;
import com.college.management.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo studentRepo;
	
	@Autowired
	CourseRepo courseRepo;

	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	public Student getstudentByUserName(String studentUsername) {
		// TODO Auto-generated method stub
		return studentRepo.FindByUserName(studentUsername);
	}

	public Student getStudentById(long studentId) {
		// TODO Auto-generated method stub
		return studentRepo.findById(studentId).get();
	}

	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepo.findAll();
	}

	public List<Course> getCourcesByStudentId(long studentId) {
		// TODO Auto-generated method stub
		return courseRepo.getCourceByStudentId(studentId);
	}

	public Course getCourseByName(String courseName) {
		// TODO Auto-generated method stub
		return courseRepo.getCourseByName(courseName);
	}

}
