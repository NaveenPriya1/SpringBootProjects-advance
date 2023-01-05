package com.core.java;

public class Saturn {
     
	interface IterF1{
		int a= 50;
		int b=30;
		void add();
		void sub();
	}
	
	class Maintain implements IterF1{

		@Override
		public void add() {
			// TODO Auto-generated method stub
			System.out.println("sum of "+a+" and "+b+" is "+(a+b));
		}

		@Override
		public void sub() {
			// TODO Auto-generated method stub
			System.out.println("difference of "+a+" and "+b+" is "+(a-b));
		}
		
	}
	
	
	
	public void Obj() {
		 Maintain main = new  Maintain();
		 main.add();
		 main.sub();
	}
	
	public static void main(String[] args) {
		
		Saturn s= new Saturn();
		//IterF1 s1=new  Maintain();
		s.Obj();
		
	}
}
