package com.core.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n1=72,n2=120,A;
			
			// 72 > 120      120
			A=(n1 > n2)? n1:n2;
			
			//System.out.println(A);
			
			while(true) {
				if(A % n1 == 0 && A % n2 == 0 ) {
					System.out.println(A);
					break;
				}
				++A;
			}
	}

}
