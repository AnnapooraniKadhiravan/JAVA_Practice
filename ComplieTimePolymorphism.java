package com.assignments;

public class ComplieTimePolymorphism {
	
	public void displayDetails(String name,int price) {
	
		System.out.println(name);
		System.out.println(price);
	}
	public void displayDetails(String name,int price, int ram) {
	
		System.out.println(name);
		System.out.println(price);
		System.out.println(ram);
	}
	public void displayDetails(String name,int price, int ram,String gen) {
		
		System.out.println(name);
		System.out.println(price);
		System.out.println(ram);
		System.out.println(gen);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplieTimePolymorphism ct = new ComplieTimePolymorphism();
		System.out.println("Method 1");
		ct.displayDetails("Dell", 35000);
		System.out.println("Method 2");
		ct.displayDetails("Lenevo", 40000, 16);
		System.out.println("Method 3");
		ct.displayDetails("HP", 50000, 16, "Eleven");

	}

}
