package com.college.management.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Assignment")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "Assignment.findAll", query = "SELECT * FROM ASSIGNMENT r")
public class Assignment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Set<Teacher> teachers=null;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long assignmentId;
	@Column(nullable = false)
	private String assignmentName;
	
	//bi directional many to many association
	@ManyToMany
	@JoinTable(name = "student_assignments",
	 joinColumns = @JoinColumn(name = "assignmentId"),
	 inverseJoinColumns = @JoinColumn(name = "studentId"))
	private List<Student> students;
	
	
	@OneToMany(mappedBy = "assignment")
	private Teacher teacher;


	public Assignment() {
		super();
	}


	public Assignment(String assignmentName, List<Student> students, Teacher teacher) {
		super();
		this.assignmentName = assignmentName;
		this.students = students;
		this.teacher = teacher;
	}


	public long getAssignmentId() {
		return assignmentId;
	}


	public void setAssignmentId(long assignmentId) {
		this.assignmentId = assignmentId;
	}


	public String getAssignmentName() {
		return assignmentName;
	}


	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public static Set<Teacher> getTeachers() {
		return teachers;
	}
	
	
}
