package com.test.singletonpattern;

/*
 * Static block initialization implementation is similar to eager
 * initialization, except that instance of class is created in the static
 * block that provides option for exception handling. Both eager
 * initialization and static block initialization creates the instance even
 * before it’s being used and that is not the best practice to use.
 */


public class StaticBlockInitialization {

	private static StaticBlockInitialization instance = null;

	
	private StaticBlockInitialization() {
	}

	static {
		try {
			instance = new StaticBlockInitialization();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static StaticBlockInitialization getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		System.out.println("Sigleton object :\t" + StaticBlockInitialization.getInstance());
	}

}
