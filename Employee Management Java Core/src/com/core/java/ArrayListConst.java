package com.core.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class ArrayListConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedHashSet<String> linkHas= new LinkedHashSet<>();
        linkHas.add("Subhaldip");
		linkHas.add("Samiran");
		linkHas.add("Sourav");
		linkHas.add("Sunirmal");
		linkHas.add("Kuila");
		linkHas.add("Test");
		linkHas.add("123");
		
		System.out.println(linkHas);
		
		
		ArrayList<String> al=new ArrayList<>(linkHas);
		Collections.sort(al);
		
		System.out.println(al);
		
		al.removeAll(linkHas);
		
		System.out.println(al);
		
		System.out.println(al.isEmpty());
	}

}
