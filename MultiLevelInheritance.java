package com.assignments;

class vehicle{
	void engine() {
		System.out.println("Vehicles usually will have engine in it");
	}
}
class fourWheelers extends vehicle {
	void storage() {
		System.out.println("Provides more storage");
	}
}
class car extends fourWheelers {
	void speed() {
		System.out.println("Cars are high Speed Vehicles");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car cc = new car();
		cc.engine();
		cc.storage();
		cc.speed();

	}

}
