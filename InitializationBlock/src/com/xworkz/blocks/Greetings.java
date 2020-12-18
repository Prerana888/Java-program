package com.xworkz.blocks;

public class Greetings {
	String morning; 
	String afternoon;
	String evening;
	// initialization block
	{
		System.out.println("Greeting of the day");
	}

	Greetings(String m, String a) {
		morning = m;
        afternoon=a;
	}
   Greetings(String e){
	   System.out.println("greeting after 4pm");
			evening=e;
		}
        	
	}
