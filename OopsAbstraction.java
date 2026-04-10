//inheritance is must in Abstraction

package com.assignments;

abstract class Cars {
	
abstract public void displayDetails();

public void testDrive() {
	System.out.println("You can have a test driver on these cars");
}
}

class Rollsroyce extends Cars {
	public void displayDetails() {
		String brand = "Rollsroyce";
		double mileage = 10.2;
		boolean auto_trans = true;
		System.out.println("The brand is: "+ brand);
		System.out.println("The mileage is: "+mileage);
		System.out.println("Is Automatic Transmission available? "+ auto_trans);
	}
}
public class OopsAbstraction{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rollsroyce rr = new Rollsroyce();
		rr.displayDetails();
		rr.testDrive();
		

	}
}


