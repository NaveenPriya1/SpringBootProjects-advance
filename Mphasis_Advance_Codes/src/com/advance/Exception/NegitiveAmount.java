package com.advance.Exception;

public class NegitiveAmount extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegitiveAmount() {
		super();
	}
	
       public NegitiveAmount(String s) {
		    super(s);
	}
}
