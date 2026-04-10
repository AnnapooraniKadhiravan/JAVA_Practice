package com.assignments;

class Animal1 {
	void eat() {
		System.out.println("Animals Eat food");
	}
}

class Dog1 extends Animal1 {
	void bark() {
		System.out.println("Bow - Bow");
	}
}

class Cat extends Animal1 {
	void meow() {
		System.out.println("Meow - Meow");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cc = new Cat();
		cc.eat();
		cc.meow();
		Dog1 dd = new Dog1();
		//dd.eat();
		dd.bark();

	}

}
