package com.core.java;

public class Sun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=0,b=5;
		 * 
		 * System.out.println(a/b);
		 */
				
				int arr[]=new int[] {0,1,2,3};
				//		0     +      2     /  0   *  3
				int z= arr[0]-- + arr[2]-- /arr[0]*arr[3];
				System.out.println(z);
	}

}
