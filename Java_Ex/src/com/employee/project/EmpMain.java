package com.employee.project;

import java.util.Scanner;

public class EmpMain implements EmployeeInterface{

	  int x;
	  public static Employee[] employees;
	  
	@Override
	public void showEmployeeById(int id, Employee[] emps) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("-------------------- Welcome To Employee management System---------------------\n");
			System.out.println("Press 1 to add  Employee ,2   search employeeById ,   3 to Exit  \n");
			int x=sc.nextInt();
			
			//case started
			switch(x) {
			case 1:
				System.out.println("Please Enter howmany Employees You want to Add");
				int num=sc.nextInt();
				 employees=new Employee[num];
				 
				 for(int i=0;i<num;i++) {
					 System.out.println("-----------------------------------------------------");
					 Employee e1= new Employee();
					 System.out.println("Enter Employee Id  \n");
					 e1.id=sc.nextInt();
					 
					 System.out.println("Enter Employee Name \n");
					 e1.name=sc.nextLine();
					 
					 System.out.println("Enter Employee Location \n");
					 e1.location=sc.nextLine();
					 
					 System.out.println("Enter Employee Designation \n");
					 e1.designation=sc.nextLine();
					 
					 System.out.println("Enter Employee Salary \n");
					 e1.salary=sc.nextDouble();
					 
					 //add employee in array
					 employees[i]=e1;
					 System.out.println("-----------------------------------------");
				 }
			}
		}
	}
}
