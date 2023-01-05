package com.advance.day2;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

	public static void main(String[] args) {
		String expr="({}([]))";
		
		if(arebareBalancedBrackets(expr))
			System.out.println("Balanced...");
		else
			System.out.println("Not Balanced...");
	}

	private static boolean arebareBalancedBrackets(String expr) {
		// TODO Auto-generated method stub
		Deque<Character> stack = new ArrayDeque<>();
		
		for(int i=0;i<expr.length();i++) {
			char x= expr.charAt(i);
		
			if (x == '[' || x == '{' || x == '(') {
				stack.push(x);
				continue;
			}
			
			if(stack.isEmpty())
				return false;
			
			char check;
			
			switch (x) {
			
			case ')':
				   check = stack.pop();
				   if(x == '}' || x== ']')
					   return false;
				   break;
				   
			case '}':
				check = stack.pop();
				if(x == ')' || x == ']')
					return false;
				break;
				
			case ']':
				check = stack.pop();
				if(x == '}' || x == ')')
					return false;
				break;
					
			}
		}
		return stack.isEmpty();
}
}
