package com.college.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.management.entities.Admin;
import com.college.management.entities.Course;
import com.college.management.entities.Review;
import com.college.management.entities.Student;
import com.college.management.entities.Teacher;
import com.college.management.repo.AdminRepo;
import com.college.management.repo.CourseRepo;
import com.college.management.repo.ReviewRepo;
import com.college.management.repo.StudentRepo;
import com.college.management.repo.TeacherRepo;

@Service
public class AdminService {
	
	@Autowired
	AdminRepo adminRepo;
	
	@Autowired
	StudentRepo studentRepo;
	
	@Autowired
	TeacherRepo teacherRepo;
	
	@Autowired
	ReviewRepo reviewRepo;
	
	@Autowired
	CourseRepo courseRepo;

	public Admin getAdminByUsername(String adminUsername) {
		// TODO Auto-generated method stub
		return adminRepo.findByUserName(adminUsername);
	}

	public Admin addAdmin(Admin db) {
		// TODO Auto-generated method stub
		return adminRepo.save(db);
	}

	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepo.save(course);
	}

	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepo.findAll();
	}

	public Course getCourseByid(long courseId) {
		// TODO Auto-generated method stub
		return courseRepo.findById(courseId).get();
	}

	public void deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		courseRepo.deleteById(courseId);
	}

	public Course updateCourseById(Course course) {
		// TODO Auto-generated method stub
		Course co=courseRepo.findById(course.getCourseId()).get();
		if(co!=null) {
			co.setCourseName(course.getCourseName());
			co.setStudents(course.getStudents());
			co.setTeachers(course.getTeachers());
			co.setReviews(course.getReviews());
		}
		return courseRepo.save(co);
	}

	public Teacher addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepo.save(teacher);
	}

	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return teacherRepo.findAll();
	}

	public Teacher getTeacherByid(long teacherId) {
		// TODO Auto-generated method stub
		return teacherRepo.findById(teacherId).get();
	}

	public void deleteTeacherById(long teacherId) {
		// TODO Auto-generated method stub
		teacherRepo.deleteById(teacherId);
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	public Student getStudentById(long studentId) {
		// TODO Auto-generated method stub
		return studentRepo.findById(studentId).get();
	}

	public void deleteStudentById(long studentId) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(studentId);
	}

	public List<Review> getAllReviews() {
		// TODO Auto-generated method stub
		return reviewRepo.findAll();
	}

	public Review getreviewByCourseId(long courseId) {
		// TODO Auto-generated method stub
		return reviewRepo.findReviewByCourseId(courseId);
	}

	public Review getreviewByCourseName(String courseName) {
		// TODO Auto-generated method stub
		return reviewRepo.findReviewByCoursename(courseName);
	}

}
