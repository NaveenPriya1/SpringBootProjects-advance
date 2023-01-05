package com.corejava.day1;

import java.util.Scanner;

public class Fibonachi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number");
          int n=13,i=1,firstTerm=sc.nextInt();
       System.out.println("Enter your second number");
    		int  secondTerm=sc.nextInt();
       
       while(i<=n) {
    	   System.out.print(firstTerm+" ");
    	   int nextTerm=firstTerm+secondTerm;
    	   firstTerm = secondTerm;
    	   secondTerm=nextTerm;
    	   i++;   
    	   
       }
	}

}
