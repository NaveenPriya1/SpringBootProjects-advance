package com.core.core;

public class ReplacingName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="NAVEEN";
         printRotatedString(str);
	}
    
	//Method to print rotated String
	private static void printRotatedString(String str) {
		// TODO Auto-generated method stub
		int leng=str.length();
		
		StringBuffer sb;
		
		for(int i=0;i<=leng;i++) {
			sb = new StringBuffer();
			
			int j = i;
			int k = 0;
			
			//Copying the second part from the rotation
			for(int l=j;l<leng;l++) {
				sb.insert(k, str.charAt(j));
				k++;
				j++;
			}
			
			//Copying the first part from the string
			j = 0;
			while(j<i) {
				sb.insert(k, str.charAt(j));
				j++;
				k++;
			}
			System.out.println(sb);
		}
		
	}

}
