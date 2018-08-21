package com.test.singletonpattern;

public class LazyInitialization {

	private LazyInitialization() {
	};

	public static LazyInitialization instance = null;

	public static LazyInitialization getInstance() {
		if (instance == null) {
			instance = new LazyInitialization();
		}
		return instance;
	}

	public static void main(String[] args) {
		System.out.println("Singleton instance:\t" + LazyInitialization.getInstance());
	}

}
