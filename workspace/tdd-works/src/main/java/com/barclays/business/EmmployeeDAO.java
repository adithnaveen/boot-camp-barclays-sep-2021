package com.barclays.business;

import com.barclays.exception.NameTooShortException;

public class EmmployeeDAO {
	public String sayHi(String name) {
		return "Hi "+ name;
	}
	
	public boolean checkName(String name) throws NameTooShortException {
		if(name.length() < 6) {
			throw new NameTooShortException("Please give valid Name" + name); 
		}
		
		try {
		Thread.sleep(3000);
		}catch(InterruptedException ie) {}
		
		
		return true; 
	}
	
}
