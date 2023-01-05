package com.college.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.management.entities.Admin;
import com.college.management.entities.Course;
import com.college.management.entities.Review;
import com.college.management.entities.Student;
import com.college.management.entities.Teacher;
import com.college.management.exception.ProjectException;
import com.college.management.service.AdminService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/admin")
public class AdminController {
 
	@Autowired
	AdminService adminService;
	
	//admin login
	@PostMapping("/login")
	public ResponseEntity<?> adminLogin(@RequestBody Admin admin){
		Admin db=adminService.getAdminByUsername(admin.getAdminUsername());
		if(db.getAdminPassword().equals(admin.getAdminPassword()))
			return ResponseEntity.ok(db);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
			}
	
    //admin forgot password
	@PostMapping("/forgot")
	public ResponseEntity<?> forgotPass(@RequestBody Admin admin){
		Admin db=adminService.getAdminByUsername(admin.getAdminUsername());
		if(db!=null) {
			db.setAdminPassword(admin.getAdminPassword());
			return ResponseEntity.ok(adminService.addAdmin(db));
		}
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	
	
	//************course section in admin*********************
	
	//add course
	@PostMapping("/addcourse")
	public ResponseEntity<?> addCourse(@RequestBody Course course){
		Course c=adminService.addCourse(course);
		if(c!=null)
			return ResponseEntity.ok(c);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	//list of courses
	@GetMapping("/allcourses")
	public ResponseEntity<?> listOfcourses(){
		List<Course> courseList=adminService.getAllCourses();
		if(courseList.size() >0)
			return ResponseEntity.ok(courseList);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	//get course by id
	@GetMapping("/course/{id}")
	public ResponseEntity<?> getCourseById(@PathVariable("id") long courseId){
		Course course=adminService.getCourseByid(courseId);
		if(course!=null)
			return ResponseEntity.ok(course);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	//delete course by id
	@DeleteMapping("/deletecourse/{id}")
	public String deleteCourseById(@PathVariable("id") long courseId){
		try {
			adminService.deleteCourse(courseId);
			return courseId+" this id course deleted successfully";
		}catch(Exception e) {
			throw new ProjectException("course not found with id");
		}
	}
	
	//update course by id
	@PutMapping("/updatecourse")
	public ResponseEntity<?> updateCourseById(@RequestBody Course course){
		Course cour=adminService.getCourseByid(course.getCourseId());
		if(cour!=null)
			return ResponseEntity.ok(adminService.updateCourseById(course));
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	
	//************Teacher section****************
	
	//add tecaher
	@PostMapping("/addtecaher")
	public ResponseEntity<?> addTeacher(@RequestBody Teacher teacher){
		Teacher teac=adminService.addTeacher(teacher);
		if(teacher!=null)
			return ResponseEntity.ok(teacher);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	//list of teachers
	@GetMapping("/listteachers")
	public ResponseEntity<?> listOfteachers(){
		List<Teacher> teachersList=adminService.getAllTeachers();
		if(teachersList.size()>0)
			return ResponseEntity.ok(teachersList);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();	
	}
	
	//get teacher by id
	@GetMapping("/teacher/{id}")
	public ResponseEntity<?> getTeacherById(@PathVariable("id") long teacherId){
		Teacher teacher=adminService.getTeacherByid(teacherId);
		if(teacher!=null)
			return ResponseEntity.ok(teacher);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();	
	}
	
	//delete teacher by id
	@DeleteMapping("/deleteteacher/{id}")
	public String deleteteacherById(@PathVariable("id") long teacherId) {
		try {
			adminService.deleteTeacherById(teacherId);
			return teacherId+" teacher deleted successfully";
		}catch(Exception e) {
			throw new ProjectException("teacher not found with this id");
		}
	}
	
	
	//************   Student section *****************
	
	//to get all students
	@GetMapping("/liststudents")
	public ResponseEntity<?> listOfstudents(){
		List<Student> studentsList=adminService.getAllStudents();
		if(studentsList.size()>0)
			return ResponseEntity.ok(studentsList);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();	 
	}
	
	//to get student by id
	@GetMapping("/student/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable("id") long studentId){
		Student student =adminService.getStudentById(studentId);
		if(student!=null)
			return ResponseEntity.ok(student);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();	 
	}
	
	//to delete student
	@DeleteMapping("/deletestudent/{id}")
	public String deleteStudentByid(@PathVariable("id") long studentId){
		try {
			adminService.deleteStudentById(studentId);
			return studentId+" teacher deleted successfully";
		}catch(Exception e) {
			throw new ProjectException("student not found with this id");
		}
	}
	
	
	//******************* review Section ******************
	
	
	//get all reviews
	@GetMapping("/allreviews")
	public ResponseEntity<?> getallReviews(){
		List<Review> reviewList=adminService.getAllReviews();
		if(reviewList.size()>0)
			return ResponseEntity.ok(reviewList);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	//get review by course id
	@GetMapping("/reviewbycourseid/{id}")
	  public ResponseEntity<?> getreviewByCourseId(@PathVariable("id") long courseId){
		Review review=adminService.getreviewByCourseId(courseId);
		if(review!=null)
			return ResponseEntity.ok(review);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	//get review by course name
		@GetMapping("/reviewbycourseid/{name}")
		  public ResponseEntity<?> getreviewByCourseName(@PathVariable("name") String courseName){
			Review review=adminService.getreviewByCourseName(courseName);
			if(review!=null)
				return ResponseEntity.ok(review);
			return (ResponseEntity<?>)ResponseEntity.internalServerError();
		}
	
}
