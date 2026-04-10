package com.assignments;

class Animal {
	void sound() {
		System.out.println("Animals make sound");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dogs barks - bow bow!");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a;
		System.out.println("Calling Animal class Sound method");
		a = new Animal();
		a.sound();
		
		System.out.println("Calling Dog class Sound method");
		
		a = new Dog();		
		a.sound();
		
		
		//a.sound();

	}

}
