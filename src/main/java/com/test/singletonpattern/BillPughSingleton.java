package com.test.singletonpattern;

public class BillPughSingleton {

	private BillPughSingleton() {
	}

	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Singleton instance hashcode:\t" + BillPughSingleton.getInstance().hashCode());
		System.out.println("Singleton instance hashcode:\t" + BillPughSingleton.getInstance().hashCode());
	}
	
}
