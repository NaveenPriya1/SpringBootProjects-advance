package com.core.java;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s="Priya Naveen";
           String [] arr=s.split(" ");
//           System.out.println(arr[0]);
//           System.out.println(arr[1]);
           if(arr[0].equals("Priya")) {
        	   System.out.print(arr[1]);
        	   System.out.print(" ");
        	   for(int i=arr[0].length()-1;i>=0;i--) {
        		   System.out.print(arr[0].charAt(i));
        	   }
           }
	}

}
