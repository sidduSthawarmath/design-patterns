package com.siddu.creational.singleton.pattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonSerialized {
	
	/* 
	 * 9. Sometimes in distributed systems, we need to implement Serializable
	 * interface in Singleton class so that we can store it’s state in file
	 * system and retrieve it at later point of time. Here is a small singleton
	 * class that implements Serializable interface also.
	 */
	
	/*
	 * The problem with above serialized singleton class is that whenever we
	 * deserialize it, it will create a new instance of the class
	 */
	
	
	/*
	 * To overcome this scenario all we need to do it provide the implementation
	 * of readResolve() method.
	 */
	
	
	public static void main(String[] args) throws Exception {

		SerializedSingleton instanceOne = SerializedSingleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		out.writeObject(instanceOne);
		out.close();

		// deserailize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
		SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
		in.close();

		System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
		System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());
	}

}

class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = -7604766932017737115L;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}

	protected Object readResolve() {
		return getInstance();
	}

}