package com.assignments;

class House {
	public void rent() {
		System.out.println("The rent of 2BHK is 20K per month");
	}
}
class Kitchen {
	
	public void space() {
		System.out.println("The Kitchen looks spacious");
	}
	
}

class Garden {
	public void water() {
		System.out.println("The water facility in garden also seems to be good");
	}
}

public class MemoryStorageWithOthers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House hh = new House();
		hh.rent();
		Kitchen kk = new Kitchen();
		kk.space();
		Garden gg = new Garden();
		gg.water();
	

	}

}
