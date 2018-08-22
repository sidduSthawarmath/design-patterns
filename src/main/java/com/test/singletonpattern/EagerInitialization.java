package com.test.singletonpattern;

/*
 * 1. In eager initialization, the instance of Singleton Class is created at the
 * time of class loading, this is the easiest method to create a singleton class
 * but it has a drawback that instance is created even though client application
 * might not be using it.
 */

public class EagerInitialization {

	private EagerInitialization() {
	}

	private static final EagerInitialization INSTANCE = new EagerInitialization();

	public static EagerInitialization getInstance() {
		return INSTANCE;
	}

	public static void main(String[] args) {
		System.out.println("Instance hashcode:\t" + EagerInitialization.getInstance().hashCode());
		System.out.println("Instance hashcode:\t" + EagerInitialization.getInstance().hashCode());
	}
}
