package com.collections;

import java.util.Arrays;

public class A {
    
	public static void main(String[] args) {
		
		int arr[]=new int[100];
		arr[0]=100;
		arr[1]=110;
		arr[3]=101;
		arr[6]=123;
		arr[8]=1;
		arr[9]=10;
		arr[10]=190;
		
		for(int a:arr) {
			System.out.println(a);
		}
		
		Arrays.sort(arr);
		System.out.println(arr.hashCode());
		for(int a:arr) {
			System.out.println(a);
		}

	}
}
