package com.advance.day2;

import java.util.Scanner;

public class Stairs {
	
	public static int countWays(int steps) {
		return fib(steps+1);
	}
	
	private static int fib(int i) {
		// TODO Auto-generated method stub
		if(i<=1)
			return i;
		return fib(i-1)+fib(i-2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Steps");
		int steps= sc.nextInt();
		
		{
			System.out.println("the number of ways to climb "+steps+" steps are "+countWays(steps));
		}
	}
	
}