package com.assignments;

//parent class

class Iphone {
	void cameraFeatures() {
		System.out.println("Standard iPhone camera");
	}
}

// child class

class Iphone17 extends Iphone {
	@Override
	void cameraFeatures() {
		System.out.println("iPhone 17: AI - enhanced Photography.");
	}
}

class Iphone18 extends Iphone {
	@Override
	void cameraFeatures() {
		System.out.println("iPhone 18: Periscope Zoom camera");
	}
}


public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone myPhone = new Iphone();
		// myPhone = new Iphone();
		myPhone.cameraFeatures();
		
		myPhone = new Iphone17();
		myPhone.cameraFeatures();
		
		myPhone = new Iphone18();
		myPhone.cameraFeatures();
		
		

	}

}
