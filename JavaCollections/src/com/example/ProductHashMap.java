package com.example;

import java.util.HashMap;
import java.util.Scanner;

public class ProductHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String, String> productMap=new HashMap<>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the \'number\' of products u want to add");
        n = sc.nextInt();
        sc.nextLine();
        
        for(int i =0;i<n;i++) {
        	System.out.println("Enter product id");
        	String s1=sc.nextLine();
        	System.out.println("Enter product Name");
        	String s2=sc.nextLine();
        	productMap.put(s1, s2);
        }
        
        System.out.println(productMap.toString());
        
        System.out.println("Enter the product d to remove");
        String id = sc.nextLine();
        productMap.remove(id);
        
        System.out.println("list is "+productMap.toString());
        
        
        System.out.println("Enter the product id to search");
        String pid = sc.nextLine();
        if(productMap.containsKey(pid)) {
        	System.out.println(productMap.get(pid));
        }else {
        	System.out.println("no product with given id");
        }
	}

}
