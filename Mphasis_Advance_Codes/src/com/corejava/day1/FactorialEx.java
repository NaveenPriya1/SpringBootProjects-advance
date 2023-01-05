package com.corejava.day1;

import java.util.Scanner;

class FactorialEx{  
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get for Factorial");
		int n = sc.nextInt();
		
		System.out.println("Factorial of "+n+" is "+fact(n));
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
}
