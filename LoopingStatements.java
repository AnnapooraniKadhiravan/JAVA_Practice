package com.assignments;

public class LoopingStatements {
	
	public void loopingOfFor() {
		int n= 10;
		int i = 0;
		
	
		System.out.println("For Loop");
		System.out.println();
		
		for(int j= 1;j<=n;j++) {
			
			System.out.println("I am the best");
			
		}
		System.out.println();
		
		System.out.println("The Values are: ");
		for(int j=0;j<n;j++) {
			System.out.println(j);
		}
		
		System.out.println();
		System.out.println("While Loop");
		while(i<=n) {
			System.out.println("The value is positive");
			i++;
		}
		
		System.out.println();
		System.out.println("Do-While Loop");
		
		do {
			System.out.println("Have a Nice Day!");
			i++;
		}while(i<=n);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoopingStatements ls = new LoopingStatements();
		ls.loopingOfFor();
		
		//Pre And post Increment
		int i = 5;
		System.out.println();
		System.out.println("Increment");
		System.out.println();
		System.out.println("Preincrement value is "+ (++i)); //i=i+1
		System.out.println("Preincrement value is "+ (i++));  // i = i+1
		System.out.println("i value is after increment "+ i);
		//i = 5;
		System.out.println();
		System.out.println("Decrement");
		System.out.println();
		System.out.println("Predecrement value is "+ (--i));
		System.out.println("Predecrement value is "+ (i--));
		System.out.println("i value is after decrement "+ i);


				

	}

}
