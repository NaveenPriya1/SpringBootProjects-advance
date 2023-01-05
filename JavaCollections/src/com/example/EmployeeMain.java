package com.example;

import java.util.LinkedList;

public class EmployeeMain {
	LinkedList<Employee> employeeList = new LinkedList<>();
	
	public void addInput() {
		Employee obj1= new Employee(111,"Nav","Srikaku");
		Employee obj2= new Employee(222,"Ragav","SPunw");
		Employee obj3= new Employee(333,"Syam","china");
		Employee obj4= new Employee(444,"Prachu","hangkong");
		
		employeeList.add(obj1);
		employeeList.add(obj2);
		employeeList.add(obj3);
		employeeList.add(obj4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       
       EmployeeMain eMain= new EmployeeMain();
       eMain.addInput();
       eMain.display();
	}

	private void display() {
		// TODO Auto-generated method stub
		System.out.println("EmployeeId |\t EmployeeName |\t EmployeeAddress");
		System.out.println("=================================================================");
		for(Employee e:employeeList) {
			System.out.println(e.getEmployeeId()+"|\t \t"+e.getEmployeeName()+"|\t \t"+e.getEmployeeAddress());
			System.out.println("-----------------------------------------------------------------");
		}
		System.out.println("=================================================================");
	}

}
