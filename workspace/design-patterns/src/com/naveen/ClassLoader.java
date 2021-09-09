package com.naveen;

public class ClassLoader {
	
	public ClassLoader() {
		System.out.println("Constructing :ClassLoader ");
	}
	static {
		System.out.println("hey i'm from static block ClassLoader");
	}
}
