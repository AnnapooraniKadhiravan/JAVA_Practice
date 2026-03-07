package practice;

public class MotorBike {
	private int speed; // member variable

	void start() { //method
		System.out.println("Bike Strated");
	}

	public int getSpeed() { //method
		return speed;
	}
	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
		
	}
	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	public void setSpeed(int speed) { // speed here is local variable
		if(speed>0)
		this.speed = speed; // to call and pass value in member variable, we use this
	}//method
	
}
