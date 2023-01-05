package com.collection.userinput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionUserInput {
      
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your data \n");
		List<Integer> list= new ArrayList<Integer>();
		while(sc.hasNextInt()) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
	}
}
