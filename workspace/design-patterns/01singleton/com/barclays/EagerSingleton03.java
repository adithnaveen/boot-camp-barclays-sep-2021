package com.barclays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EagerSingleton03 {
	public static void main(String[] args) throws FileNotFoundException, IOException,
		ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sample.ser"));
		EagerSingleton instance = EagerSingleton.getInstance(); 
		
		oos.writeObject(instance);
		
		// to persist into the file 
		oos.close(); 
		System.out.println("Hashcode : " + instance.hashCode());
		System.out.println("Data saved... ");
		
		// get the data which is stored 
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sample.ser")); 
		EagerSingleton readObject = (EagerSingleton) ois.readObject();
		ois.close(); 
		
		System.out.println("hashcode after reading : " +readObject.hashCode());
	}
}
