package com.core.java;

public class TestExtends extends Thread{
	
	public void run() {
		
		System.out.println("This is Runnable statement");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		TestExtends t = new TestExtends();
		    t.start();
		    t.start();
           
	       }catch(IllegalThreadStateException e) {
		System.out.println(e);
	}
	}
}
