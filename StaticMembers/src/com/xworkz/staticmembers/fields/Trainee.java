package com.xworkz.staticmembers.fields;

public class Trainee {
	int id;
	String name;
	String emailid;
	static String institution = "xworkz"; // static variable is used if we have common value

	Trainee() {
		System.out.println("no-arg constructor");
	}

	Trainee(int inid, String inname, String inemailid) {
		id = inid;
		name = inname;
		emailid = inemailid;
		// institution=ininstitution;
	}

	void displayDetails() {
		System.out.println(
				"id:" + id + ", " + "name:" + name + " ," + "emailid:" + emailid + ", " + "institution:" + institution);
	}
}
