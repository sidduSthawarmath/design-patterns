package com.siddu.factory.pattern;

/*
 * Factory design pattern is used when we have a super class with multiple
 * sub-classes and based on input, we need to return one of the sub-class.
 * This pattern take out the responsibility of instantiation of a class from
 * client program to the factory class.
 */

public class FactoryDesignPattern {

	public static void main(String[] args) {
		Mobile samsung = MobileShowRoom.getMobile("samsung", "2 GB","16 GB");
		System.out.println(samsung.getDescription());

		System.out.println("\n\n\n");
		Mobile onePlus = MobileShowRoom.getMobile("onePlus","4 GB","64 GB");
		System.out.println(onePlus.getDescription());

	}
}

interface Mobile {
	public String getDescription();
}

class Samsung implements Mobile {

	private String ram;

	private String internalMemory;

	public Samsung(String ram, String internalMemory) {
		this.ram = ram;
		this.internalMemory = internalMemory;
	}

	public String getDescription() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Samsung");
		stringBuilder.append("\n------\n");
		stringBuilder.append("Ram=");
		stringBuilder.append(ram);
		stringBuilder.append(", InternalMemory=");
		stringBuilder.append(internalMemory);
		return stringBuilder.toString();
	}

}

class OnePlus implements Mobile {

	private String ram;

	private String internalMemory;

	public OnePlus(String ram, String internalMemory) {
		this.ram = ram;
		this.internalMemory = internalMemory;
	}

	public String getDescription() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("OnePlus");
		stringBuilder.append("\n------\n");
		stringBuilder.append("Ram=");
		stringBuilder.append(ram);
		stringBuilder.append(", InternalMemory=");
		stringBuilder.append(internalMemory);
		return stringBuilder.toString();
	}
}

class MobileShowRoom {
	static Mobile mobile = null;

	public static Mobile getMobile(String mobileName, String ram, String internalMemory) {
		if ("samsung".equalsIgnoreCase(mobileName)) {
			mobile = new Samsung(ram, internalMemory);
		} else if ("oneplus".equalsIgnoreCase(mobileName)) {
			mobile = new OnePlus(ram, internalMemory);
		}
		return mobile;
	}

}