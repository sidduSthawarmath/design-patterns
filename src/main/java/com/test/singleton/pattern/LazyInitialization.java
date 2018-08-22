package com.test.singleton.pattern;

/*2. Object will created when its required */

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
		System.out.println("Singleton instance hashcode:\t" + LazyInitialization.getInstance().hashCode());
		System.out.println("Singleton instance hashcode:\t" + LazyInitialization.getInstance().hashCode());
	}

}
