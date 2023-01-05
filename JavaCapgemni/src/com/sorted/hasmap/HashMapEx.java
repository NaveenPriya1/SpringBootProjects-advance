package com.sorted.hasmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Map<String , Integer> map= new HashMap<>();
		map.put("Naveen", 22);
		map.put("John", 28);
		map.put("Kiran", 20);
		map.put("Raghu", 12);
		map.put("Deeven", 32);
		
		System.out.println("--------Map Before Sorted---------");
		System.out.println(map);
		System.out.println();
		
		
		LinkedHashMap<String, Integer> sortedMap=map.entrySet().stream().sorted((e1,e2) -> {
			return e1.getValue()-e2.getValue();
		}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)-> e1,LinkedHashMap::new));
		System.out.println("--------Map  Sorted---------");
		System.out.println(sortedMap);
	}
	
	

}
