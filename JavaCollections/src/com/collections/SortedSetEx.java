package com.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SortedSet s= new TreeSet();
         
         for(int i=10;i<=20;i++)
        	 s.add(i);
         
         System.out.println(s.first());
         System.out.println(s.last());
         System.out.println(s.headSet(16));
         System.out.println(s.tailSet(16));
         System.out.println(s.subSet(12, 17));
         System.out.println(s.comparator());
	}

}
