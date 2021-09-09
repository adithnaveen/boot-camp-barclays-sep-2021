package com.barclays;

import java.io.Serializable;

public class EagerSingleton implements Serializable {
	// eager singleton is the one which has the instance available 
	// even before the object creation 
	private static final EagerSingleton instance = new EagerSingleton(); 

	// if you dont have a constructor 
	// the compiler gives you a constructor
	private EagerSingleton() {
		System.out.println("EagerSingleton() Creation");
	}

	public static EagerSingleton getInstance() {
		return instance;
	}
	
	// when ever you get the instance from the external resource then
	// a pre check is done with readResolve method 
	protected Object readResolve() {
		return getInstance();
	}
}
