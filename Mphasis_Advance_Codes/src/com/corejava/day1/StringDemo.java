package com.corejava.day1;

public class StringDemo {

	
	
	public static void main(String...Naveen) {
		String s = "Java is Simple";
		
		//replace oldd with new
		System.out.println(s.replace('a', 'w'));
		
		System.out.println(s.replace("av", "ww"));
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toUpperCase());
		
		String arr[]=s.split(" ");
		for(String ss:arr) {
			System.out.print(ss.charAt(0)+" ");
			
		}
		System.out.println();
		
		String [] arr1=s.split("\\s");
		//System.out.println(arr1.length);
		for(int i=arr1.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		String [] arr2=s.split("\\s");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(new StringBuilder(arr[i]).reverse());
			System.out.print(" ");
			
		}
}
}