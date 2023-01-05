package com.example;

public class Employee {

	private long EmployeeId;
	private String EmployeeName;
	private String EmployeeAddress;
	
	public Employee() {
		super();
	}

	public Employee(long employeeId, String employeeName, String employeeAddress) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeAddress = employeeAddress;
	}

	public long getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(long employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return EmployeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeAddress="
				+ EmployeeAddress + "]";
	}
	
	
}
