package com.assignments;

public class IfElseStatements {
	
	public void CheckCond() {
		int budget = 30000;
		if(budget <= 50000) System.out.println("The Expense is within the Budget !");
		else System.out.println("The Expense is exceeding the budget!");			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IfElseStatements cc = new IfElseStatements();
		cc.CheckCond();
		

	}

}
