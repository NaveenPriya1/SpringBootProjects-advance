package com.advance.day2;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number to check");
			int n = sc .nextInt();
			int count=0;
			
			for(int i=2;i<=n/2;i++) {
				if(n%i==0)
					count++;
			}
			if(n==1)
				System.out.println("1 is not a prime");
			else if(count==0)
				System.out.println(n+" is prime");
			else
				System.out.println(n+" is not prime");
	}

}
