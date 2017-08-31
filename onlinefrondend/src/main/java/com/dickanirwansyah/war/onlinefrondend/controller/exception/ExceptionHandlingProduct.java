package com.dickanirwansyah.war.onlinefrondend.controller.exception;

import java.io.Serializable;

public class ExceptionHandlingProduct extends Exception implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public ExceptionHandlingProduct(){
		this("Product yang anda cari tidak tersedia !");
	}

	public ExceptionHandlingProduct(String message){
		this.message = System.currentTimeMillis() + ": " + message;
	}
	
	public String getMessage(){
		return message;
	}
	
	public void setMessage(String message){
		this.message =message;
	}
}
