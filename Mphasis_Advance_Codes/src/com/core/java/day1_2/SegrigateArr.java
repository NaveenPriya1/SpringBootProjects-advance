package com.core.java.day1_2;

public class SegrigateArr {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,0,1,1,0};
	
		int len=arr.length;
		segrigate0and1(arr,len);
	}

	//function to segregate 0 and 1 s
	private static void segrigate0and1(int[] arr, int len) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<len;i++) {
			if(arr[i]==0)
				count++;
		}
		
		//loop fills the array with 0s until count
		for(int i=0;i<count;i++) {
			arr[i]=0;
		}
		
		//loop fills the array with 1s after count
		for(int j=count;j<len;j++) {
			arr[j]=1;
		}
		
		//to print array
		for(int ss:arr) {
			System.out.print(ss+" ");
		}
	}

	

}
