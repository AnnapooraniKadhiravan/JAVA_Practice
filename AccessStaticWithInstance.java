package com.assignments;

public class AccessStaticWithInstance {
	
	static int a = 40;
	int b = 50;
	static String str = "Hello";
	
	void simpleDisplay() {
		System.out.println(a);
		System.out.println(b);
	}
	// declaration of static method
	
	static void staticDisplay() {
		System.out.println("Static number is : "+ a);
		System.out.println("Static String is: "+ str);
		
		
	}
	
	public void nsMethod() { // non static method
		staticDisplay();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessStaticWithInstance obj = new AccessStaticWithInstance();
		obj.simpleDisplay();
		
		//calling static method
		staticDisplay();
		obj.nsMethod();
		

	}

}
