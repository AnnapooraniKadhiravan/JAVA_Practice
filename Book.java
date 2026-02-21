package practice;

public class Book {
private int noOfCopies;
public void setNoOfCopies(int noOfCopies) {
	if(noOfCopies > 0)
	this.noOfCopies = noOfCopies;
 }
public void increaseNoOfCopies(int howMany) {
	setNoOfCopies(this.noOfCopies + howMany);
	
}
public void decreaseNoOfCopies(int howMany) {
	setNoOfCopies(this.noOfCopies - howMany);
}
void start()
{
	System.out.println("Reading book");
}
public int getNoOfCopies() {
	return noOfCopies;
}


}
