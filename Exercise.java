package practice;

public class Exercise {

	public static void main(String[] args) {
		/*calculate number of mins in a day
		per day 24 hours, 1 hour = 60 mins
		so 60*24 gives me no.of mins in a day
		no,of seconds in a day
		1 min = 60 seconds, so per day 1440 mins*/
		
		int numOfMinsPerHour = 60;
		int daynumOfHoursInDay = 24;
		int numOfMinsInADay = numOfMinsPerHour * daynumOfHoursInDay;
		System.out.println("Number of Mins in a day is " + numOfMinsInADay);
		System.out.println("Number of seconds in a day is "+ numOfMinsInADay * 60);

	}

}

//METHOD
/*
 * void sayHelloWorldTwice() {
 * System.out.println("Hello World");
	  System.out.println("Hello World");
	}
	
	SYNTAX
	
	ReturnType nameOfTheMethod(){
	//body of the method
	}
 */
	  