package com.core.core;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s = "I am Learning Java Programming";
      int count=0;
      int vCount=0;
      int cCount=0;
      System.out.println("total lenth\t"+s.length());
      
      s=s.toLowerCase();
      
      for(int i=0;i<s.length();i++) {
    	  if(s.charAt(i)!=' ')
    		  count++;
    	  
    	  if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
    		  vCount++;
    	  else if(s.charAt(i)>='a' && s.charAt(i)<='z')
    		  cCount++;
      }
      
      System.out.println("total count without spaces\t"+count);
      System.out.println("total vowel count\t"+vCount);
      System.out.println("total consonent count\t"+cCount);
	}

}
