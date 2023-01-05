package com.advance.core;

import java.util.Scanner;
import java.util.Vector;

public class Money {
	
	static int notes[]= {1,2,5,10,20,50,100,500,1000,2000};
	
	static int len = notes.length;
	
	public static int findMin(int n) {
		Vector<Integer> ans=new Vector<>();
		for(int i=len-1;i>=0;i--) {
			while(n>=notes[i]) {
				n-=notes[i];
				ans.add(notes[i]);
			}
		}
		for(int i=0;i<ans.size();i++) {
			System.out.print(" "+ans.elementAt(i));
		}
		return ans.size();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the money you want");
			int n=sc.nextInt();
			System.out.println("\n The minimul number of notes for "+n+" "+findMin(n));
	}

}
