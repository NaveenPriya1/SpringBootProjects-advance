package com.example;

import java.util.Scanner;

public class Example {
	
	static double i10=2.1_0_0;
	
	synchronized public static final strictfp void main(String...naveen) {
		System.out.println(i10);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check");
		int n = sc.nextInt();
		String s= n%2==0 ? "Even" : "Odd";
		System.out.println(s);
		
	}

}
