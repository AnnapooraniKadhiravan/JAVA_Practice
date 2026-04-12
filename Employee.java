package com.wipro.Employee;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name,double Salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary() {
		this.salary = salary;
	}

}
