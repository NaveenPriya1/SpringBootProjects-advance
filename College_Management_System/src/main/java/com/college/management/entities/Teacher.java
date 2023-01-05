package com.college.management.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long teacherId;
	@Column(nullable = false)
	private String teacherName;
	@Column(nullable = false)
	private String teacherUsername;
	@Column(nullable = false)
	private String teacherPassword;
	@Column(nullable = false)
	private String teacherEmail;
	private String teacherPhone;
	private String teacherAddress;
	
	@ManyToMany
	@JoinTable(name =  "teachers-cources",joinColumns = @JoinColumn(name = "teacherId"),
	inverseJoinColumns = @JoinColumn(name = "courseId"))
	private List<Course> cources;
	
	@OneToMany(fetch = FetchType.LAZY,
			cascade = CascadeType.ALL,
			mappedBy = "teacher")
	private List<Assignment> assignments;

	public Teacher() {
		super();
	}

	public Teacher(String teacherName, String teacherUsername, String teacherPassword, String teacherEmail,
			String teacherPhone, String teacherAddress, List<Course> cources) {
		super();
		this.teacherName = teacherName;
		this.teacherUsername = teacherUsername;
		this.teacherPassword = teacherPassword;
		this.teacherEmail = teacherEmail;
		this.teacherPhone = teacherPhone;
		this.teacherAddress = teacherAddress;
		this.cources = cources;
	}

	public long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherUsername() {
		return teacherUsername;
	}

	public void setTeacherUsername(String teacherUsername) {
		this.teacherUsername = teacherUsername;
	}

	public String getTeacherPassword() {
		return teacherPassword;
	}

	public void setTeacherPassword(String teacherPassword) {
		this.teacherPassword = teacherPassword;
	}

	public String getTeacherEmail() {
		return teacherEmail;
	}

	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}

	public String getTeacherPhone() {
		return teacherPhone;
	}

	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}

	public String getTeacherAddress() {
		return teacherAddress;
	}

	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}

	public List<Course> getCources() {
		return cources;
	}

	public void setCources(List<Course> cources) {
		this.cources = cources;
	}
	
	
	
	
	
	
}
