package com.assignments;

public class SwitchCaseStatements {
	
	public void choices() {
		int cutOffMarks = 80;
		
		switch(cutOffMarks) {
		default:
			System.out.println("Not eligible for any Concession");
		case 95:
			System.out.println("Free Seats are available");
		//break;
		case 90:
			System.out.println("95% concession available");
		//break;
		case 80:
			System.out.println("90% Concession available");
		//break;
		case 70:
			System.out.println("80% Concession available");
		//break;
		case 60:
			System.out.println("50% Concession available");
		//break;
		case 50:
			System.out.println("30% Concession available");
		//break;
		/*default:
			System.out.println("Not eligible for any Concession");*/
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchCaseStatements sc = new SwitchCaseStatements();
		sc.choices();

	}

}
