package com.assignments;

public class AboutMethods {
	// instance variables
	int num1;
	int num2;
	
	// User - defined Methods
	
	public static void D() { // static Method
		int i = 10;
		System.out.println("Method D");
	}
	public static void C() {
		double d = 10.67;
		System.out.println("Method C");
	}
	public static void B() {
		double d = 10.67;
		C();
		System.out.println("Method B");
	}
	public static void A() {
		double d = 10.67;
		B();
		System.out.println("Method A");
	}
	
	public void methodWithObject() {  //Instance Method
		System.out.println("I am Instance Method");
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	// instance method : requires an object to be invoked
	public void addAndDisplay() {
		int sum = num1 + num2;
		System.out.println("The sum using instance object is: "+ sum);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A();
		D();
		AboutMethods am = new AboutMethods();
		am.methodWithObject();
		double value = Math.PI;
		System.out.println("Predefined Method value of pi is: "+ value);
		int sum = AboutMethods.add(10, 20);
		System.out.println("The sum value using static method is: "+ sum);
		am.num1 = 50;
		am.num2 = 50;
		am.addAndDisplay();

	}

}
