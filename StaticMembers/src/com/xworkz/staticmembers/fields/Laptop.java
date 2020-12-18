package com.xworkz.staticmembers.fields;

public class Laptop {
	String brand;
	double cost;
	int rating;
	static String color="grey";
	{ //initialization block
		System.out.println("varities of laptop");
	}

	Laptop(String inbrand, double incost, int inrating) { //constructor
		brand = inbrand;
		cost = incost;
		rating = inrating;
		//color = incolor;
	}
	static void setcolor(String color) {  //static method
		color="grey";
	}
	

	void displayDetails() { 
		
		System.out.println(
				"brand:" + brand + "  " + "cost:" + cost + "  " + "rating:" + rating + "  " + "color:" + color);
	}

}
