package com.xworkz.staticmembers.fields;

public class LaptopTester {

	public static void main(String[] args) {
		Laptop dell = new Laptop("dell", 20.0, 4);
		dell.displayDetails(); // calling object
		Laptop.setcolor("grey"); // calling static method
		Laptop hp = new Laptop("hp", 28.0, 3);
		hp.displayDetails();
		Laptop apple = new Laptop("Apple", 50.0, 4);
		apple.displayDetails();
		Laptop apple1 = new Laptop("Apple1", 70.0, 5);
		apple1.displayDetails();

	}

}
//output:
/*
 * varities of laptop brand:dell cost:20.0 rating:4 color:grey varities of
 * laptop brand:hp cost:28.0 rating:3 color:grey varities of laptop brand:Apple
 * cost:50.0 rating:4 color:grey varities of laptop brand:Apple1 cost:70.0
 * rating:5 color:grey
 */