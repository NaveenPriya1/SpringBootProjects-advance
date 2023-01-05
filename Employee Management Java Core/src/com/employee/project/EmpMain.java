package com.employee.project;

import java.util.Scanner;

public class EmpMain implements EmployeeInterface{

	  int x;
	  public static Employee[] employees;
	  
	@Override
	public void showEmployeeById(int id, Employee[] emps) {
		// TODO Auto-generated method stub
		try {
		for(int i=0;i<emps.length;i++) {
			if(emps[i].id==id) {
				System.out.println();
				System.out.println("--------------------------------------------");
				System.out.println(emps[i]);
				System.out.println("--------------------------------------------");
			}
		}
		}catch(Exception e) {
			System.out.println("--------------------------------------------");
			System.out.println("Oops Id not found........");
			System.out.println("--------------------------------------------");
			
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("-------------------- Welcome To Employee management System---------------------\n");
			System.out.println("Press: '1' to add Employee ,'2'   search employeeById , '3' to list of Employees, '4' to Exit  \n");
			char x=sc.next().charAt(0);
			
			//case started
			switch(x) {
			case '1':
				System.out.println("Please Enter howmany Employees You want to Add");
				int num=sc.nextInt();
				 employees=new Employee[num];
				 
				 for(int i=0;i<num;i++) {
					 System.out.println("-----------------------------------------------------");
					 Employee e1= new Employee();
					 System.out.println("Enter Employee Id  \n");
					 e1.id=sc.nextInt();
					 sc.nextLine();
					 
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
				 break;
				 
			case '3':
				System.out.println("--------------------------------------------");
				System.out.println("The Total Employee List is   \n");
				for(Employee rr:employees ) {
					System.out.println(rr);
				}
				System.out.println("--------------------------------------------");
				break;
				
			case '2':
				System.out.println("Enter the Employee Id to get details  \n");
				EmpMain main=new EmpMain();
				int id=sc.nextInt();
				main.showEmployeeById(id, employees);
				System.out.println("\n");
				
				break;
				
			 default:
				 System.out.println("wrong choice ");
				 break;
				
			case '4':
				System.out.println("Thank You for the Employee Management System!....");
				System.exit(2);
				
				
			}
		}
	}
}
