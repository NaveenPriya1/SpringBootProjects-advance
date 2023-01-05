package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//LinkedList ll= new LinkedList<>();
		   ArrayList ll= new ArrayList<>();
			ll.add("Nav");
			ll.add(100);
			ll.add(10.0);
			ll.add('n');
			System.out.println(ll);
			ll.add(0, "ramesh");
			System.out.println(ll);
//			ll.remove();
//			System.out.println(ll);
//			ll.removeLast();
//			System.out.println(ll);
//			ll.addFirst("Navr");
//			System.out.println(ll);
			ll.set(0, "raghav");
			System.out.println(ll);
	}

}
