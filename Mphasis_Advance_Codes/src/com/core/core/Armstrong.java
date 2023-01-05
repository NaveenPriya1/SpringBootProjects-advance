package com.core.core;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //if the addition of cubes of digits of a number are equal to original number
		//then its called as Armstrong number
		
		int num=40;
		int num1=num;
		int temp=0;
		int sum =0;
		
		while(num>0) {
			temp = num % 10;
			sum= sum + (temp * temp * temp);
			num = num / 10;
		}
		if(num1==sum)
			System.out.println(num1+" is a armstrong number");
		else
		    System.out.println(num1+" is not armstrong number");
	}

}
