package com.xworkz.blocks;

public class GreetingTestser {
public static void main(String[] args) {
	Greetings day=new Greetings("goodmorning","goodafternoon");
	System.out.println(day.morning);
	System.out.println(day.afternoon);
	Greetings day1=new Greetings("goodevening");
	System.out.println(day1.evening);
}
}


//output:
/*Greeting of the day
goodmorning
goodafternoon
Greeting of the day
greeting after 4pm
goodevening*/
