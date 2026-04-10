package com.assignments;

public class NestedIfStatements {

	public void checkCond() {
		int age = 21;
		int cibilScore = 600;

		if (age > 25) {
			if (cibilScore > 500) {
				System.out.println("You are eligibile for Loan");
			}
			/*else {
				System.out.println("Your Cibil Score is Less");
			}*/
		} else {
			System.out.println("You are not eligible for Loan");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedIfStatements cc = new NestedIfStatements();
		cc.checkCond();

	}

}
