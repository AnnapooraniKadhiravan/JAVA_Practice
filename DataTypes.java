package com.assignments;

public class DataTypes {
	
	public void TypesOfData() {
		
		char ch = 'A';
		Boolean bool = true;
		byte bt = 5;
		short st = 100;
		int num = 1032284;
		long lo = 1028739272;
		float ft = 4325.83f;
		double db = 23671.2836482;
		
		System.out.println("PRIMITIVE DATA TYPES :");
		System.out.println();
		System.out.println("Boolean : "+ bool);
		System.out.println("Byte : " + bt);
		System.out.println("short : " + st);
		System.out.println("integer : " + num);
		System.out.println("Long : " + lo);
		System.out.println("Float : " + ft);
		System.out.println("double : " + db);
		System.out.println();
		System.out.println("SIZES OF DATA TYPES :");
		System.out.println();
		System.out.println("Size of Byte : " + Byte.BYTES + " Bytes ("+ Byte.SIZE + " bits)");
		System.out.println("Size of Short : " + Short.BYTES + " Bytes ("+ Short.SIZE + " bits)");
		System.out.println("Size of Integer : " + Integer.BYTES + " Bytes ("+ Integer.SIZE + " bits)");
		System.out.println("Size of Long : " + Long.BYTES + " Bytes ("+ Long.SIZE + " bits)");
		System.out.println("Size of Float : " + Float.BYTES + " Bytes ("+ Float.SIZE + " bits)");
		System.out.println("Size of Double : " + Double.BYTES + " Bytes ("+ Double.SIZE + " bits)");
		System.out.println("Size of Character : " + Character.BYTES + " Bytes ("+ Character.SIZE + " bits)");
		//System.out.println("Size of Boolean : " + Boolean.BYTES + "Bytes ("+ Boolean.SIZE + "bits)");

		
	}
	
	public static void main (String args[]) {
		DataTypes dt = new DataTypes();
		dt.TypesOfData();
	}

}
