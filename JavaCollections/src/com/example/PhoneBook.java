package com.example;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
	
	
	static String s1="Press:   \'A\' for add contact\t  \'D\' for delete contact \t \'S\' for search \t  \'E\' for Exit";
     private String ContactName;
     private String phoneNumber;
     
     
	public PhoneBook() {
		super();
	}

	

	public PhoneBook(String contactName, String phoneNumber) {
		super();
		ContactName = contactName;
		this.phoneNumber = phoneNumber;
	}


     
	public String getContactName() {
		return ContactName;
	}



	public void setContactName(String contactName) {
		ContactName = contactName;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashMap<String, String> phoneBook=new HashMap<>();
         
         Scanner sc = new Scanner(System.in);
         System.out.println("\n\n ************************   Welcome to Phone Book  ********************************* \n\n");
         
         for(;;) {
        	 System.out.println("MENU \t"+s1);
             
             String input=sc.nextLine().trim();
             
             if(input.equalsIgnoreCase("A")) {
            	 System.out.println("Enter name");
            	String name= sc.nextLine();
            	 System.out.println("Enter phone Number");
            	 String number=sc.nextLine();
            	 phoneBook.put(name, number);
            	 System.out.println("Contact added successfully \n");
            	 System.out.println(phoneBook);
             }
             
             else if(input.equalsIgnoreCase("D")) {
            	 System.out.println("Enter name to delete");
            	 String name=sc.nextLine();
            	if( phoneBook.remove(name) != null) {
            		System.out.println("deleted successfully");
            	System.out.println(phoneBook);
            	}else
            		System.out.println("dont worry u dont have contact with that name");
             }
             
             else if(input.equalsIgnoreCase("E")) {
            	 System.out.println("Thank you visist again");
            	 System.exit(0);
             }
             
             else if(input.equalsIgnoreCase("S")){
            	 System.out.println("Enter name to search");
            	 String name=sc.nextLine();
            	 if(phoneBook.containsKey(name)) {
            		 System.out.println(phoneBook.get(name));
            	 }else {
            		 System.out.println("no such contact ");
            	 }
             }
             
             
             else
            	 System.out.println("Unknown command Try again");
         }
         
	}

}
