package com.assignments;

public class ClassesAndObjects {
	
	public void Laptops()
	{
		String brand = "Dell";
		int price = 35000;
		int RAM = 8;
		System.out.println("Brand is : "+brand);
		System.out.println("Price is : "+price);
		System.out.println("RAM is : "+ RAM);

	
	}
	
	public static void main(String[] args) {
		
		
		ClassesAndObjects obj = new ClassesAndObjects();
		obj.Laptops();
		
	}
	

}
