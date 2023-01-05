package com.collections;

import java.util.StringTokenizer;

public class TokeniserEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer obj=new StringTokenizer("Naresh it solutions", " ");
		while(obj.hasMoreTokens())
			System.out.println(obj.nextToken());
	}

}
