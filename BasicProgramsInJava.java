package com.inheritance.programs;

public class BasicProgramsInJava {
	
	public void sumOfOdd() {
		int sum = 0;
		for(int i = 1; i<=100;i++) {
			if(i%2==1) {
				sum = sum + i; //sum+=1
			}
		}
		System.out.println("The sum of Odd numbers between 1 and 100 is: "+sum);

	}
	
	public void sumOfEven() {
		int sum = 0;
		for(int i = 1; i<=100;i++) {
			if(i%2==0) {
				sum = sum + i; //sum+=1
			}
		}
		System.out.println("The sum of Even numbers between 1 and 100 is: "+sum);

	}
	
	public void factorial() {
		int count=1;
		for(int i=1;i<=8;i++) {
			count=count*i;
		}
		System.out.println("The factorial of 8 is: "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicProgramsInJava obj = new BasicProgramsInJava();
		obj.sumOfEven();
		obj.sumOfOdd();
		obj.factorial();
		
	}

}
