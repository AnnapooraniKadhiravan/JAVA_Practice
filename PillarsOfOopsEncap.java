package com.assignments;

public class PillarsOfOopsEncap {
	// Instance variables
	private String name;
	private int age;
	
	public PillarsOfOopsEncap(String name,int age) {
		// setting value to instance variables
		this.name = name;
		this.age = age;
		
	}
	//getters and setters to access instance variables
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String newName) {
		if(newName!=null) {
			this.name = newName;
		}else {
			System.out.println("Invalid name");
		}
		
	}
	
	public void setAge(int newAge) {
		if(newAge > 0 && newAge <120) {
			this.age = newAge;
		}
		else {
			System.out.println("Invalid Age");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PillarsOfOopsEncap pc = new PillarsOfOopsEncap("Alice",30);
		System.out.println("Values before update");
		System.out.println("Name: "+pc.name);
		System.out.println("Age: "+pc.age);
		
		//modify values using setter method, accessed with obj
		pc.setName("Bob");
		pc.setAge(25);
		
		System.out.println("Updated Information");
		System.out.println("Name: "+pc.name);
		System.out.println("Age: "+pc.age);
		
		pc.setAge(-5);
		System.out.println("Age after invalid attempt: "+pc.getAge());
       
	}

}
