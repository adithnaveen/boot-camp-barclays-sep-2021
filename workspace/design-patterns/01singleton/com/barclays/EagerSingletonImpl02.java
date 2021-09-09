package com.barclays;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EagerSingletonImpl02 {
	public static void main(String[] args) throws InstantiationException,
	IllegalAccessException, IllegalArgumentException, 
	InvocationTargetException {
		EagerSingleton instanceOne = EagerSingleton.getInstance();
		
		
		EagerSingleton instanceTwo = null;
		EagerSingleton instanceThree = null;
		
		Constructor [] constructors = 
				EagerSingleton.class.getDeclaredConstructors(); 
		
		for(Constructor constructor :constructors ) {
			constructor.setAccessible(true);
			instanceTwo = (EagerSingleton) constructor.newInstance(); 
			instanceThree = (EagerSingleton) constructor.newInstance();
		}
		
		System.out.println("instanceOne - "+ instanceOne.hashCode());
		System.out.println("instanceTwo - "+instanceTwo.hashCode());
		System.out.println("instanceThree - "+instanceThree.hashCode());
		
	}
}
