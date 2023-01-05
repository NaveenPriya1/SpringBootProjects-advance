package com.advance.core;
//program o find the frequency of each element in a sorted array

import java.util.HashMap;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {2,2,2,4,4,4,5,5,6,8,8,9};
        
        HashMap<Integer,Integer> freqmap=solveIterative(arr);
        for(int key: freqmap.keySet()) {
        	System.out.println(key +" occurs "+freqmap.get(key)+" times");
        }
        
	}

	private static HashMap<Integer, Integer> solveIterative(int[] arr) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> freqmap=new HashMap<>();
		for(int value:arr) {
			if(!freqmap.containsKey(value)) {
				freqmap.put(value, 1);
			}else {
				freqmap.put(value, freqmap.get(value)+1);
			}
		}
		return freqmap;
	}
}
       
