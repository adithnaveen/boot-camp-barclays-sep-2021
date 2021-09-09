package com.barclays;

public class EagerSingltonImpl {
	public static void main(String[] args) {
		// creating an object directly is not possible 
//		EagerSingleton e = new EagerSingleton();
		

		EagerSingleton es1 = EagerSingleton.getInstance(); 
		System.out.println(es1.hashCode());
		

		EagerSingleton es2 = EagerSingleton.getInstance(); 
		System.out.println(es2.hashCode());
		

		EagerSingleton es3 = EagerSingleton.getInstance(); 
		System.out.println(es3.hashCode());
		
		
	}
}
