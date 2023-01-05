package com.inhertance.example;
/**
 * this class a i am checking inheritance properties
 * @author DELL
 *  these are documentation comments
 */
class A{
	
	int i =10;
	static int j = 100;
	
	  A(){ System.err.printf("parent %d constructor \n",8000);
	  
	  }
	  
	  A(int i){ System.err.println("parent parametrerized constructor"); }
	 
      
      public void m1() {
    	  System.err.println("parent m1");
      }
      
      public void m2() {
    	  System.err.println("parent m2");
      }
}

public class B extends A{
	
	   int i =20;
	   static int j=200;
	   
    
	 B(){
		 System.err.println("child default constructor");
	 }
	 
      B(int i){
    	  System.out.println("child parametrerized constructor");
	 }
      
      public void m1() {
    	  System.out.println("child m1");
      }
      
      public void m3() {
    	  System.out.println("child m3");
      }
	
	public static void main(String[] args) {
		
		B b= new B();
		b.m1();
		b.m3();
		b.m2();
		System.out.println(b.i);
		System.out.println(b.j);
		System.out.println("=============================================================");
		
		A a = new B();
		a.m1();
		a.m2();
		System.out.println(a.i);
		System.out.println("===================================================");
		
		
		
		System.out.println("===================================================");
		A d = new B();
		B b2=(B) d;
		b2.m1();
		b2.m2();
		b2.m3();
		System.out.println(b2.i);
		
		
	}
}
