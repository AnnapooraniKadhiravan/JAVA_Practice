package practice;

import java.util.Scanner;

public class SwitchExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		SwitchExercise.determineNameOfDay(choice);
		System.out.println(determineNameOfDay(choice));
		System.out.println("Enter your choice: ");
		int choiceForMonth = sc.nextInt();
		SwitchExercise.determineNameOfMonth(choiceForMonth);
		System.out.println(determineNameOfMonth(choiceForMonth));

	}
	public static String determineNameOfDay(int dayNumber) {
		
		switch(dayNumber) {
		case 1:
			return "Sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tues";
		case 4:
			return "Wed";
		case 5:
			return "Thurs";
		case 6:
			return "Fri";
		case 7:
			return "Sat";
		
		}
		return "Invalid Day";
	}
	
	public static String determineNameOfMonth(int monthNumber) {
		switch(monthNumber) {
		case 1:
			return "Jan";
		case 2:
			return "Feb";
		case 3:
			return "Mar";
		case 4:
			return "Apr";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "Jul";
		case 8:
			return "Aug";
		case 9:
			return "Sep";
		case 10:
			return "Oct";
		case 11:
			return "Nov";
		case 12:
			return "Dec";
		
		}
		return "Invalid Day";
	}

}
