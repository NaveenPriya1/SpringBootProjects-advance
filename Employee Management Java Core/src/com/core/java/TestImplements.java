package com.core.java;

public class TestImplements implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		TestImplements t = new TestImplements();
		Thread t1 = new Thread(t);
		t1.start();
		t1.start();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("the run method");
	}

}
