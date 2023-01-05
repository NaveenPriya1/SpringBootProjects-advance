package com.advance.day2;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num= 143;
        
        int rev = 0 ;
        
        while(num !=0) {
        	rev = rev * 10 +(num % 10);
        	num = num / 10;
        }
        System.out.println(rev);
        
	}

}
