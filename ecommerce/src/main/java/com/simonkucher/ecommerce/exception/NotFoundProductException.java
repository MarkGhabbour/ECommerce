package com.simonkucher.ecommerce.exception;

public class NotFoundProductException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NotFoundProductException() {
		super("product id not found");
	}

	
}
