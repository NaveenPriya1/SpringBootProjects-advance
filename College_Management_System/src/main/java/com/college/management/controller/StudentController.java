package com.college.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.management.entities.Course;
import com.college.management.entities.Student;
import com.college.management.service.StudentService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	//Student register
	@PostMapping("/register")
	public ResponseEntity<?> addStudent(@RequestBody Student student){
		Student stu=studentService.addStudent(student);
		if(stu!=null)
			return ResponseEntity.ok(stu);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	
	//student login
	@PostMapping("login")
	public ResponseEntity<?> studentLogin(@RequestBody Student student){
		Student stu=studentService.getstudentByUserName(student.getStudentUsername());
		if(stu.getStudentPassword().equals(student.getStudentPassword()))
			return ResponseEntity.ok(stu);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
			
	}
	
	//student forgot password
	@PostMapping("/forgotpass")
	public ResponseEntity<?> forgotPassword(@RequestBody Student student){
		Student stu=studentService.getstudentByUserName(student.getStudentUsername());
		if(stu!=null) {
			stu.setStudentPassword(student.getStudentPassword());
			return ResponseEntity.ok(studentService.addStudent(stu));
		}
			return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	//update student
	@PutMapping("/update")
	public ResponseEntity<?> updateStudentById(@RequestBody Student student){
		Student stude=studentService.getStudentById(student.getStudentId());
		if(stude!=null)
			return ResponseEntity.ok(studentService.updateStudent(student));
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	
	//****************student cources*******************
	
	//to see all the courses
	@GetMapping("/allcourses")
	public ResponseEntity<?> getAllCourses(){
		List<Course> courseList=studentService.getAllCourses();
		if(courseList.size()>0)
			return ResponseEntity.ok(courseList);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();		
	}
	
	//get courses by student id
	@GetMapping("/optedcourses/{sid}")
	public ResponseEntity<?> Studentoptedcources(@PathVariable("sid") long studentId){
		List<Course> courseList=studentService.getCourcesByStudentId(studentId);
		if(courseList.size()>0)
			return ResponseEntity.ok(courseList);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();		
	}
	
   
	// opting for the cource
	@PutMapping("/optingcourse")
	public ResponseEntity<?> optingForCourse(@RequestBody Student student,@RequestBody Course course){
		Course cour=studentService.getCourseByName(course.getCourseName());
		if(cour!=null) {
			Student stu=studentService.getStudentById(student.getStudentId());
			stu.setCources(cour);
			return ResponseEntity.ok(studentService.addStudent(stu));
		}
		return (ResponseEntity<?>)ResponseEntity.internalServerError();	
	}
	
	
	//with drawn for the course
	@PutMapping("/withdrawn")
	public ResponseEntity<?> withdrawnCourse(@RequestBody Student student){
		Student stu=studentService.getStudentById(student.getStudentId());
		if(stu!=null) {
			stu.setCources(null);
			return ResponseEntity.ok(studentService.addStudent(stu));
		}
		return (ResponseEntity<?>)ResponseEntity.internalServerError();	
	}
	
}

