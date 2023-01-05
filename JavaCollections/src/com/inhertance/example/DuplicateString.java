package com.inhertance.example;

import java.util.HashSet;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="tetraaqa";
//		String s="naveen";
		char [] arr=s.toCharArray();
		
		Set<Character> set= new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
//					System.out.println("Duplicate characters are "+arr[j]);
					set.add(arr[j]);
					break;
				}
			}
		}
		
		System.out.println(set);
	}

}
