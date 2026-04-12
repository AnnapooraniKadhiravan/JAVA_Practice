/* because of Diamond problem, interface is being used in Java
 * 
 * 
 * 
 * */

package com.assignments;

interface Animals {
	void makeSound();
	void sleep();
}

class Pig implements Animals {
	public void makeSound() {
		System.out.println("Wee - Wee");
	}
	public void sleep() {
		System.out.println("Pig Sleeps - Zzzzzzzzz");
	}
}

public class IntroToInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig mp = new Pig();
		mp.makeSound();
		mp.sleep();

	}

}
