package com.college.management.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentId;
	@Column(nullable = false)
	private String studentName;
	@Column(nullable = false)
	private String studentUsername;
	@JsonIgnore
	@Column(nullable = false)
	private String studentPassword;
	@Column(nullable = false)
	private String studentEmail;
	private String studentPhone;
	private String studentAddress;
	
	@ManyToMany
	@JoinTable(name = "students-cources",joinColumns = @JoinColumn(name = "studentId",referencedColumnName = "studentId")
	,inverseJoinColumns = @JoinColumn(name = "couseId",referencedColumnName = "courseId"))
	private List<Course> cources;
	
	@ManyToMany(mappedBy = "student")
	private List<Assignment> assignments;

	public Student() {
		super();
	}
	
	

	public Student(String studentName, String studentUsername, String studentPassword, String studentEmail,
			String studentPhone, String studentAddress, List<Course> cources) {
		super();
		this.studentName = studentName;
		this.studentUsername = studentUsername;
		this.studentPassword = studentPassword;
		this.studentEmail = studentEmail;
		this.studentPhone = studentPhone;
		this.studentAddress = studentAddress;
		this.cources = cources;
	}



	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentUsername() {
		return studentUsername;
	}

	public void setStudentUsername(String studentUsername) {
		this.studentUsername = studentUsername;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public List<Course> getCources() {
		return cources;
	}

	public void setCources(Course cour) {
		this.cources = (List<Course>) cour;
	}



	public long getStudentId() {
		return studentId;
	}



	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	
	
	
	
}
