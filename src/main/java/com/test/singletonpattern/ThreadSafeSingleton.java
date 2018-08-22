package com.test.singletonpattern;

public class ThreadSafeSingleton {

	private ThreadSafeSingleton(){}
	
/*	
	 * The EagerInitialization,LazyInitialization,StaticBlockInitialization singleton 
	 * implementation works fine in case of single threaded environment
	 * but when it comes to multithreaded systems, it can cause issues if
	 * multiple threads are inside the if loop at the same time. It will destroy
	 * the singleton pattern and both threads will get the different instances
	 * of singleton class.
	 */
	public static ThreadSafeSingleton instance=null;

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

	public static void main(String[] args) {
		System.out.println("Instance:\t" + ThreadSafeSingleton.getInstance());
	}
	
	
}
