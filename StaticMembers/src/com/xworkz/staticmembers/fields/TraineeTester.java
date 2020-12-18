package com.xworkz.staticmembers.fields;

public class TraineeTester {
	public static void main(String[] args) {
		Trainee prerana = new Trainee(1, "Prerana", "prerana@gmail.com");
		prerana.displayDetails();

		Trainee suman = new Trainee(2, "suman", "suman@gmail.com");
		suman.displayDetails();
	}

}

//output
/*id:1, name:Prerana ,emailid:prerana@gmail.com, institution:xworkz
id:2, name:suman ,emailid:suman@gmail.com, institution:xworkz */