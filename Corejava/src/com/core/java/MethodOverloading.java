package com.core.java;



public class MethodOverloading {
	
	int i=10;
    
	//phone pay
    public void  makePayment(long mobile) {
    	System.out.println("payment successful");
    }
   
  
    
    public void  makePayment(int password,long mobile) {
    	
    	System.err.println("payment ");
    }
    
    //card
    public void  makePayment(long cardnumber,int cvv,String date) {
    	System.out.println(" successful");
    }
    
    public static void main(String[] args) {
    	MethodOverloading m = new MethodOverloading();
    	m.makePayment(86574356);
    	m.makePayment(6754, 9977766);
    	m.makePayment(77877778, 656, "12/66/2023");
    	
    	
	}
    
}
