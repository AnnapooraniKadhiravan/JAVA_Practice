package practice;

import java.util.Scanner;

public class SimpleExercises {
	public static void main (String[] args) {
		int num1,num2,num3;
		Scanner s = new Scanner(System.in);
		SimpleExercises obj = new SimpleExercises();
		System.out.println("Enter value for Print Numbers :");
		num1 = s.nextInt();
		System.out.println("Enter value for Square Numbers :");
		num2 = s.nextInt();
		System.out.println("Enter value for Multiple table :");
		num3 = s.nextInt();
		//SimpleExercises obj = new SimpleExercises();
		obj.printNumbers(num1);
		//System.out.println("Enter value for Square Numbers :");
		obj.printSquaresOfNumbers(num2);
		//System.out.println("Enter value for Multiple table :");
		obj.multiplicationTable(num3);
		obj.multiplicationTable();
		int result = obj.sumOfThreeNums(12, 13, 14);
		System.out.print(result);
	}

	 void printNumbers(int n) {
		System.out.println("Numbers from 1 to n ");
		for(int i=1;i<=n;i++) {
			
			System.out.println(i);

		}
	}
	 void printSquaresOfNumbers(int n) {
		System.out.println("Square of numbers ");
		for(int i=1;i<=n;i++) {
			
			System.out.println(i*i);

		}
	}
	 void multiplicationTable(int n) {
		 System.out.printf("Multiplication table of %d: ",n).println();
		 for(int i=1;i<=10;i++) {
			 System.out.printf("%d * %d = %d ",i,n,i*n).println();
		 }
	 }
	 void multiplicationTable() {
		 int n=5;
		 System.out.printf("Multiplication table of %d: ",n).println();
		 for(int i=1;i<=10;i++) {
			 System.out.printf("%d * %d = %d ",i,n,i*n).println();
		 }
	 }
	 int sumOfThreeNums(int a,int b,int c) {
		 int sum = a+b+c;
		 System.out.print("Sum of 3 numbers: ");
		 return sum;
	 }
	 
}
	
	


