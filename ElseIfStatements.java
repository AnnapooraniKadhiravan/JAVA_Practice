package com.assignments;

public class ElseIfStatements {
	
	public void checkCond() {
		int projectSubmitDays = 5;
		if(projectSubmitDays > 50) {
			System.out.println("Due Time Exceeded, cannot submit!!");
		}else if(projectSubmitDays >= 35) {
			System.out.println("Due Time is nearing to Submit");
		}else if(projectSubmitDays >= 20) {
			System.out.println("You have Enough of Time to Submit!!");
		}
		else System.out.println("Start your project as soon as possible !");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElseIfStatements cc = new ElseIfStatements();
		cc.checkCond();

	}

}
