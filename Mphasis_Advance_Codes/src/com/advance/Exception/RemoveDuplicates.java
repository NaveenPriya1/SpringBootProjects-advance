package com.advance.Exception;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   String str ="abbbaan";
	   
	   System.out.println(removeDuplicates(str));
	}

	private static String removeDuplicates(String str) {
		// TODO Auto-generated method stub
		String ans="";
		
		for(int i=0;i<str.length();i++) {
			
			if(ans.isEmpty() || ans.charAt(ans.length()-1) != str.charAt(i))
				ans+=str.charAt(i);
			else if(ans.charAt(ans.length()-1) == str.charAt(i))
				ans = ans.substring(0,ans.length()-1);
		}
		
		return ans;
	}
}