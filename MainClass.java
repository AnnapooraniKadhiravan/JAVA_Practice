package practice;

class  Person{
	public String name;
	protected int age;
	private String SocialSecurityNumber;
	String address;
	
	Person(String name, int age, String ssn, String address)
	{
		this.name = name;
		this.age = age;
		this.SocialSecurityNumber = ssn;
		this.address = address;
		System.out.println(SocialSecurityNumber);
	}
	
}

class Employee extends Person {
	Employee(String name, int age, String ssn, String address)
	{
		super(name,age,ssn,address);
		System.out.println("Hello Employee");
	}
}

public class MainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee("John",23,"xysd","Bangalore");
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.address);
		//System.out.println(e1.SocialSecurityNumber);
		
	}

}
