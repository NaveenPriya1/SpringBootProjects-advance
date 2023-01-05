package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet ts= new TreeSet<>(new MyComparator());
        ts.add(89);
        ts.add(9);
        ts.add(6);
        ts.add(67);
        ts.add(45);
        ts.add(49);
        
        System.out.println(ts);
        
	}

}


