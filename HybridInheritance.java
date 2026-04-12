package com.assignments;

class Device {
	public void turnOn() {
		System.out.println("Device is turing On...");
	}
}

interface Light {
	void flash();
}

interface Battery {
	void chargeIt();
}

class SmartPhone extends Device implements Light, Battery {
	@Override
	public void turnOn() {
		System.out.println("Device Turned On");
	}
	@Override
	public void flash() {
		System.out.println("Turn on Flash Light");
	}
	@Override
	public void chargeIt() {
		System.out.println("Charging Device");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone();
		sp.turnOn();
		sp.flash();
		sp.chargeIt();

	}

}
