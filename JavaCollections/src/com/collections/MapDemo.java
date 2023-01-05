package com.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
   
	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap<>();
		hm.put(7, "Ronaldo");
		hm.put(16, "Kohli");
		hm.put(9, "Rphith");
		
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.clone());
		
		Set<Integer> s=hm.keySet();
		System.out.println(s);
		
		Collection<String> cv=hm.values();
		System.out.println(cv);
		
		hm.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByKey())
		.forEach(System.out::println);
		
		hm.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
	}
}
