package com.collections;

import java.util.StringTokenizer;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s=" : ";
			String s2="Welcome : to : String : Tokenizer : . : how : are you?";
			StringTokenizer t= new StringTokenizer(s, s2);
			int count1=t.countTokens();
			for(int i=0;i < count1;i++) {
				System.out.println("token ["+i+"] : "+t.nextToken());
			}
			StringTokenizer d=null;
			while(t.hasMoreElements()) {
				System.out.println(d.nextToken());
			}
			System.out.println(t.hashCode());
	}

}
