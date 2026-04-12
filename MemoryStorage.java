package com.assignments;

class Door {
	//instance variables
	int height;
	int width;
	String lock;
	
	public void displayDoor() {
		System.out.println("The door looks amazing with the exact height, width and lock!");
	}
}

public class MemoryStorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// reference is dd for Door class and stored in stack memory	
		Door dd = new Door(); // object creation stored in heap memory
		dd.height = 145;
		dd.width = 200;
		dd.lock = "Autolock";
		dd.displayDoor();
		
		/* when object is created for door class, height, width, lock, displayDoor also will be there
		 * but without any value being initialized, so values can be assigned 
		 * by calling the instance variables using Door class reference dd
		 * those reference can be dd, dd1, dd2 created as per requirement by the developer
		 * 
		 */
		

	}

}
