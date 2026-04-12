package com.inheritance.programs;

class Helper {
	public static  int multiply(int a, int b) {
		return a*b;
	}
	public static  double multiply(double c,double d) {
		return c*d;
	}

}

// only if it is definied in other class, can call with class.methodname
// also while calling with class, it should be static method

public class PolyMO {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Helper.multiply(5,6));
		System.out.println(Helper.multiply(67.8,26.9));
		

	}

}
