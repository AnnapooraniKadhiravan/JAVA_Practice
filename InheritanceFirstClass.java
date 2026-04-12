package com.inheritance.programs;

class Animal {
	public void sound() {
		System.out.println("Animals make sound!");
	}
}
class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("Dog barks bow - bow");
	}
}
class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("Cat Meows");
	}
}
class Cow extends Animal {
	@Override
	public void sound() {
		System.out.println("Cow Moos");
	}
}

public class InheritanceFirstClass {
	public static void main(String args[]) {
		Animal aa = new Animal();
		aa.sound();
		aa = new Dog();
		aa.sound();
		aa = new Cat();
		aa.sound();
		aa = new Cow();
		aa.sound();
		
	}

}
