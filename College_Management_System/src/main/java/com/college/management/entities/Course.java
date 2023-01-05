package com.college.management.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long courseId;
	@Column(nullable = false,unique = true)
	private String courseName;
	
	@OneToMany(mappedBy = "course")
	@JsonIgnore
	private List<Review> reviews;
	
	@ManyToMany(mappedBy = "course")
	@JsonIgnore
	private List<Student> students;
	
	@ManyToMany(mappedBy = "course")
	@JsonIgnore
	private List<Teacher> teachers;

	public Course() {
		super();
	}

	public Course( String courseName, List<Review> reviews, List<Student> students,List<Teacher> teachers) {
		super();
		this.courseName = courseName;
		this.reviews = reviews;
		this.students = students;
		this.teachers = teachers;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
