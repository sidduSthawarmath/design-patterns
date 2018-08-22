package com.test.singleton.pattern;

import java.lang.reflect.Constructor;

/*
 * 7.When you run the above test class, you will notice that hashCode of
 * both the instances are not same that destroys the singleton pattern.
 * Reflection is very powerful and used in a lot of frameworks like Spring
 * and Hibernate
 */

public class DestroySingleton {

	public static void main(String[] args) {

		EagerInitialization instanceOne = EagerInitialization.getInstance();
		EagerInitialization instanceTwo = null;
		try {
			Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (EagerInitialization) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Singleton instanceOne hashcode:\t" + instanceOne.hashCode());
		System.out.println("Singleton instanceTwo hashcode:\t" + instanceTwo.hashCode());

	}

}
