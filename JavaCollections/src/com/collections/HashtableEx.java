package com.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Hashtable<String,Integer> ht=new Hashtable<>();
				ht.put("kohli", 90);
				ht.put("ramesh", 98);
				ht.put("dhoni", 55);
				ht.put("yhtd", 85);
				ht.put("Ramesh", 5);
				
				System.out.println(ht);
				Enumeration e=ht.keys();
				while(e.hasMoreElements())
					System.out.println(e.nextElement()+" ");
				
				
	}

}
