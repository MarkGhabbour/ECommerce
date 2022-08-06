package com.simonkucher.ecommerce.exception;

public class DuplicateCartItemException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DuplicateCartItemException() {
		super("error adding duplicate cart item");
	}

	
}
