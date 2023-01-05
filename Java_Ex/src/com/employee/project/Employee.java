package com.employee.project;

public class Employee {

	public int id;
	public String name;
	public double salary;
	public String location;
	public String designation;
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", location=" + location
				+ ", designation=" + designation + "]";
	}
	
	
	
}
