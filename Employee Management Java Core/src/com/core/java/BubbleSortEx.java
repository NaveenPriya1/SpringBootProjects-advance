package com.core.java;

public class BubbleSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr= {5,2,-1,3,0,10};
       // int temp;
        
        for(int i=0;i<arr.length;i++) {
        	for(int j=i+1;j<arr.length;j++) {
        		if(arr[i]>arr[j]) {
					/*
					 * temp=arr[i]; arr[i]=arr[j]; arr[j]=temp;
					 */
        			//swaping without using 3rd variable
        			arr[i]=arr[i]+arr[j];
        			arr[j]=arr[i]-arr[j];
        			arr[i]=arr[i]-arr[j];
        			
        		}
        	}
        }
        for(int k:arr)
        System.out.print(k+" ");
	}

}
