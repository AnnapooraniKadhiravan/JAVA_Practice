package com.inheritance.programs;

// in interface methods are declared only with default / static keyword?

interface LandVehicle {
	default void landInfo() {
		System.out.println("This is Land Vehicle");
	}
}
interface WaterVehicle {
	default void waterInfo() {
		System.out.println("This is water Vehicle");
	}
}
class AmphibiousVehicle implements LandVehicle, WaterVehicle {
	AmphibiousVehicle(){
		System.out.println("This is an AmphibiousVehicle");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		AmphibiousVehicle obj = new AmphibiousVehicle();
		obj.landInfo();
		obj.waterInfo();

	}

}
