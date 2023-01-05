package com.advance.core;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,2,4,4,4,5,5,6,8,8,9};
		
		int visitedArr[] = new int[arr.length];
		int visited=-1;
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				visitedArr[j]=visited;
				}
			}
			if(visitedArr[i]!=visited) {
				visitedArr[i]=count;
			}
		}
		
		for(int i=0;i<visitedArr.length;i++) {
			if(visitedArr[i]!=visited) {
				System.out.println(arr[i]+" occurs "+visitedArr[i]+" times");
			}
		}
	}

}
