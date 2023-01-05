package com.advance.Exception;

public class ExpressionParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s=(" 23 +  45  -  (  343  /  12  ) ");
      String[] c=s.split("\\s");
      for(String ss:c) {
    	  System.out.println(ss);
      }
      
      String str = "word1, word2 word3@word4?word5.word6";
      String[] arrOfStr = str.split("[, @?.]+");
      
      for(String s1:arrOfStr) {
    	  System.out.println(s1);
      }
	}

}
