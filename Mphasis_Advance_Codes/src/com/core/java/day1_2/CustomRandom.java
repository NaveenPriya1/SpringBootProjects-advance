package com.core.java.day1_2;

public class CustomRandom {

	public int randomWithRange(int min,int max) {
		int range = (max-min)+1;
		return (int) (Math.random() * range)+min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomRandom c= new CustomRandom();
		int random = c.randomWithRange(1, 6);
		System.out.println(random);
	}

}
