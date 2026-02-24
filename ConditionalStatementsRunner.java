package practice;
import java.util.Scanner;

public class ConditionalStatementsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get user input, choose operation, publish result
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter number2: ");
		int num2 = sc.nextInt();
		ConditionalStatement maths = new ConditionalStatement();
		
		System.out.println("Choices Available are ");
		System.out.println("1- Add: ");
		System.out.println("2- Subtract ");
		System.out.println("3- Divide ");
		System.out.println("4- Multiply ");
		
		System.out.println("Enter the choice: ");
		int choice = sc.nextInt();
		
		System.out.println("Your Choice are ");
		System.out.println("Number1 " + num1);
		System.out.println("Number2 " + num2);
		System.out.println("Choice: " + choice);
		
		if(choice == 1) {
			System.out.println("Result: "+ (num1 + num1));
		}else if(choice ==2) {
			System.out.println("Result: "+ (num1 - num1));
		}else if(choice ==3) {
			System.out.println("Result: "+ (num1 / num1));
		}else if(choice==4) {
			System.out.println("Result: "+ (num1 * num1));
		}else {
			System.out.println("Invalid Operation");
		}
		
		
		

	}
	
}
