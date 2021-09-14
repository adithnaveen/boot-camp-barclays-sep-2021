package com.barclays.exception;

public class NameTooShortException extends Exception{
	private String msg; 
	
	public NameTooShortException() {
		this.msg = "Name Too Short"; 
	}
	
	public NameTooShortException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "NameTooShortException [msg=" + msg + "]";
	}
	
	
}
