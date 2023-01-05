package com.college.management.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long parentId;
	@Column(nullable = false)
	private String parentName;
	@Column(nullable = false)
	private String parentEmail;
	private String parentPhone;
	
	@OneToOne(fetch = FetchType.LAZY,
			cascade = CascadeType.ALL,
			mappedBy = "parent")
	private Student student;
	
	@OneToMany(fetch = FetchType.LAZY,
			cascade = CascadeType.ALL,
			mappedBy = "parent")
	private Set<Student> childs;

	public Parent() {
		super();
	}

	public Parent(String parentName, String parentEmail, String parentPhone, Student student, Set<Student> childs) {
		super();
		this.parentName = parentName;
		this.parentEmail = parentEmail;
		this.parentPhone = parentPhone;
		this.student = student;
		this.childs = childs;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentEmail() {
		return parentEmail;
	}

	public void setParentEmail(String parentEmail) {
		this.parentEmail = parentEmail;
	}

	public String getParentPhone() {
		return parentPhone;
	}

	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Set<Student> getChilds() {
		return childs;
	}

	public void setChilds(Set<Student> childs) {
		this.childs = childs;
	}
	
	
	
}
