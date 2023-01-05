package com.advance.Exception;

public class LowBalanceException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LowBalanceException() {
		super();
	}
	
	public LowBalanceException(String s) {
		super(s);
	}
}
