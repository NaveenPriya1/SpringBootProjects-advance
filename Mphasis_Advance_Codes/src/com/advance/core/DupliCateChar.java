package com.advance.core;

import java.util.HashMap;

public class DupliCateChar {
	

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Character arr[]= {'n','a','v','v','g','v'};
	        
	        HashMap<Character,Integer> freqmap=solveIterative(arr);
	       
	        for(Character key: freqmap.keySet()) {
	        	System.out.println(key +" occurs "+freqmap.get(key)+" times");
	        }
	        
		}

		private static HashMap<Character, Integer> solveIterative(Character[] arr) {
			// TODO Auto-generated method stub
			HashMap<Character, Integer> freqmap=new HashMap<>();
			for(Character value:arr) {
				if(!freqmap.containsKey(value)) {
					freqmap.put(value, 1);
				}else {
					freqmap.put(value, freqmap.get(value)+1);
				}
			}
			return freqmap;
		}
	}
	       


