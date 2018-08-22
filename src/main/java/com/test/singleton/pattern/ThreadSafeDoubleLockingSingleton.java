package com.test.singleton.pattern;

/*
 *5. ThreadSafeSingleton implementation works fine and provides thread-safety but it reduces
 * the performance because of cost associated with the synchronized method,
 * although we need it only for the first few threads who might create the
 * separate instances (Read: Java Synchronization). To avoid this extra
 * overhead every time, double checked locking principle is used. In this
 * approach, the synchronized block is used inside the if condition with an
 * additional check to ensure that only one instance of singleton Class is
 * created.
 */
public class ThreadSafeDoubleLockingSingleton {

	private static ThreadSafeDoubleLockingSingleton instance = null;

	private ThreadSafeDoubleLockingSingleton() {
	}

	public static ThreadSafeDoubleLockingSingleton getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeDoubleLockingSingleton.class) {
				instance = new ThreadSafeDoubleLockingSingleton();
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		System.out.println("Instance hashcode:\t" + ThreadSafeDoubleLockingSingleton.getInstance().hashCode());
		System.out.println("Instance hashcode:\t" + ThreadSafeDoubleLockingSingleton.getInstance().hashCode());
	}

}
