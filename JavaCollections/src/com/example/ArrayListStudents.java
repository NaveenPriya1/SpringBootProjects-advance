package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n;
       
       ArrayList<String> studentList=new ArrayList<>();
       
       Scanner sc = new Scanner(System.in);
       System.out.println("please Enter the number of students ");
       n = sc.nextInt();
       sc.nextLine();
       
       
       for(int i =0;i<n;i++) {
    	   System.out.println("please Enter "+(i+1)+"nd student name");
    	   studentList.add(sc.nextLine());
    	   
       }
       
       System.out.println("Students list : ");
       System.out.println(studentList);
       
       
      for(String ss:studentList) {
    	  System.out.println("Enter the name the student to search ");
    	  String s= sc.nextLine();
    	  int position=Collections.binarySearch(studentList, s);
    	  if(position < 0)
    		  System.out.println("Name not in the list ");
    	  else
    	  System.out.println(s +"is found at position "+position);
    	  
    	  
      }
	}

}
