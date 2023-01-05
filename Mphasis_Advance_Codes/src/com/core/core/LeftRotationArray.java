package com.core.core;

import java.util.Scanner;

public class LeftRotationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[] = {1,2,3,4,5};
         Scanner sc = new Scanner(System.in);
         System.out.println("How many rotations u want?");
         int numOfRotations=sc.nextInt();
         
         int finArr[]=new int[arr.length];
         int k=0;
         for(int i = numOfRotations;i<arr.length;i++) {
        	 finArr[k]=arr[i];
        	 k++;
         }
         
         for(int i=0;i<numOfRotations;i++) {
        	 finArr[k]=arr[i];
        	 k++;
        	
         }
         
         for(int ss:finArr) {
        	 System.out.print(ss+" ");
         }
	}

}
