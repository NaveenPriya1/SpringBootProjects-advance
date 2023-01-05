package com.core.java.day1_2;

import java.util.Arrays;

public class MoveZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,0,0,1,1,0};
        int temp;
        Arrays.sort(arr);
        //sorting of array
//        for(int i=0;i<arr.length;i++) {
//        	for(int j=i+1;j<arr.length;j++) {
//        		if(arr[i]>=arr[j]) {
//        			temp=arr[i];
//        			arr[i]=arr[j];
//        			arr[j]=temp;
//        		}	
//        	}
//        }
        //to print array
        for(int ss:arr) {
        	System.out.print(ss+" ");
        }
	}

}
