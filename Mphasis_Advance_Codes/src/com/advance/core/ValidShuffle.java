package com.advance.core;

import java.util.Scanner;

public class ValidShuffle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First String");
		String s1=sc.next();
		System.out.println("Enter your second String");
		String s2=sc.next();
		System.out.println("Enter your final String");
		String s3=sc.next();
		
		
		if(isInterleaving(s1,s2,s3)) {
			System.out.println("interleaving");
		}else {
			System.out.println("not interleaving");
		}
	}

	private static boolean isInterleaving(String s1, String s2, String s3) {
		// TODO Auto-generated method stub
		if(s1.length()==0 && s2.length()==0 && s3.length()==0) {
			return true;
		}
		
		if(s3.length()==0) {
			return false;
		}
		boolean x=(s1.length()!=0 && s3.charAt(0)==s1.charAt(0) && 
				  isInterleaving(s1.substring(1),s2,s3.substring(1)));
		
		boolean y=(s2.length()!=0 && s3.charAt(0)==s2.charAt(0) && 
				 isInterleaving(s1,s2.substring(1),s3.substring(1)));
		return x || y;
	}

}
