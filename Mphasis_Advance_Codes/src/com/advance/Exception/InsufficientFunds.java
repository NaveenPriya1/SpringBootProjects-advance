package com.advance.Exception;

public class InsufficientFunds extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   
	public InsufficientFunds() {
		super();
	}
	
	public InsufficientFunds(String s) {
		super(s);
	}
}
