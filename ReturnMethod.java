package practice;

import java.util.Scanner;

public class ReturnMethod {
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		ReturnMethod obj = new ReturnMethod();
		int result = obj.sumOfThreeNums(12, 13, 14);
		System.out.println(result);
		int triangleThirdAngle = obj.triangle(100, 40, 40);
		System.out.println(triangleThirdAngle);
	}
	int  sumOfThreeNums(int firstNum,int secondNum,int thirdNum) {
		 int sum = firstNum + secondNum + thirdNum;
		 //System.out.println("Sum of 3 numbers: ");
		 return firstNum + secondNum + thirdNum;
	 }
	//given 2 angles, write a methods to return the 3rd angle in a triangle
	//total = 180, 1st and 2nd given find 3rd angles
	//so 1st+2nd+3rd = 180, 3rd = 180 - 1st + 2nd
	int triangle(int firstAngle,int secondAngle, int thirdAngle) {
		int total = 180;
		//total = firstAngle + secondAngle + thirdAngle;
		return thirdAngle = total - (firstAngle + secondAngle);
		
		
		
	}

}
