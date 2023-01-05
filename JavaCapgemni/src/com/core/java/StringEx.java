package com.core.java;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StringBuffer sb= new StringBuffer("NavneetH");
			StringOper(sb);
	}

	private static void StringOper(StringBuffer sb) {
		// TODO Auto-generated method stub
		 int length=sb.length();
		/* 
		 for(int i=0;i<length;i++) {
			 Character c=sb.charAt(i);
			 if(Character.isLowerCase(c)) {
				 sb.setCharAt(i, Character.toUpperCase(c));
			 }else
				 sb.setCharAt(i, Character.toLowerCase(c));*/
			 
		 for(int i=0;i<length;i++) {
			 Character c=sb.charAt(i);
			 if(Character.isLowerCase(c)) {
				 char Uppercase= (char)(c-32);
				 sb.setCharAt(i, Uppercase);
			 }else {
				 char Lowercase= (char)(c+32);
				 sb.setCharAt(i, Lowercase);
			 }
		 }
		 System.out.println(sb);
	}

}
