package com.advance.core;

import java.util.HashMap;

public class PrintDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String s="tetraaqa";
            
            char arr[]=s.toCharArray();
            
            HashMap<Character, Integer> freqmap= solveIterative(arr);
            
            for(char key:freqmap.keySet()) {
            	System.out.println("'"+key+"' occurs "+freqmap.get(key)+" times");
            }
            
	}
	
	public static HashMap<Character, Integer> solveIterative(char [] arr){
		
		HashMap<Character, Integer> freqmap=new HashMap<>();
		for(char ss:arr) {
			if(!freqmap.containsKey(ss)) {
				freqmap.put(ss, 1);
			}else {
				freqmap.put(ss, freqmap.get(ss)+1);
			}
		}
		return freqmap;
	}

}
