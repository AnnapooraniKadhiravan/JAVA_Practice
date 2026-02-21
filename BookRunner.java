package practice;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book tamil = new Book();
		Book english = new Book();
		
		tamil.start();
		english.start();
		
		tamil.setNoOfCopies(100);
		System.out.println(tamil.getNoOfCopies());
		english.setNoOfCopies(10);
		System.out.println(english.getNoOfCopies());
		
		tamil.increaseNoOfCopies(100);
		System.out.println("Tamil after increase: " + tamil.getNoOfCopies());
		english.increaseNoOfCopies(80);
		System.out.println("English after increase: " + english.getNoOfCopies());
		tamil.decreaseNoOfCopies(0);
		System.out.println("Tamil after decrease: " + tamil.getNoOfCopies());
		english.decreaseNoOfCopies(50);
		System.out.println("English after decrease: " + english.getNoOfCopies());
		
		//System.out.println(noOfCopies);

	}

}
