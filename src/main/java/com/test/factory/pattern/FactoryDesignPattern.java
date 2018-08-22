package com.test.factory.pattern;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		Mobile samsung = MobileShowRoom.getMobile("samsung");
		System.out.println(samsung.getDescription());
 
		System.out.println("-------------------------");
		Mobile onePlus = MobileShowRoom.getMobile("onePlus");
		System.out.println(onePlus.getDescription());

	}
}

interface Mobile {
	public String getDescription();
}

class Samsung implements Mobile {
	
	
	public String getDescription() {
		return "Mobile : Samsung \nRAM : 2GB \nInternal Memory : 16GB \nPrice : Rs.10000 ";
	}
}

class OnePlus implements Mobile {
	public String getDescription() {
		return "Mobile : OnePlus \nRAM : 4GB \nInternal Memory : 64GB \nPrice : Rs.35000 ";
	}
}

class MobileShowRoom {
	static Mobile mobile = null;

	public static Mobile getMobile(String mobileName) {
		if ("samsung".equalsIgnoreCase(mobileName)) {
			mobile = new Samsung();
		} else if ("oneplus".equalsIgnoreCase(mobileName)) {
			mobile = new OnePlus();
		}
		return mobile;
	}

}