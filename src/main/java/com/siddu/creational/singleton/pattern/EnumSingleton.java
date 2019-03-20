package com.siddu.creational.singleton.pattern;

/*
 *8. The use of Enum to implement Singleton design pattern as Java ensures
 * that any enum value is instantiated only once in a Java program. Since
 * Java Enum values are globally accessible, so is the singleton. The
 * drawback is that the enum type is somewhat inflexible; for example, it
 * does not allow lazy initialization.
 */

public enum EnumSingleton {

	// This is instance
	INSTANCE;

	// Initial connection value
	String dbConnection = null;

	// In Constructor establish connection
	private EnumSingleton() {
		dbConnection = "Connected";
		System.out.println("DB connected successfully");
	}

	// Return connection
	public String getInstance() {
		return dbConnection;

	}

	public static void main(String[] args) {
		// Every time we call the getInstance() method for the instance
		EnumSingleton.INSTANCE.getInstance();
	}

}
