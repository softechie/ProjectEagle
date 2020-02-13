package com.pe.l1.java8.lambda;

public class Explaination implements MyInterface{

	@Override
	public void salutation(String s){
		System.out.println("Hello "+s);	
	}
		
	public static void main(String[] args){
		// Java 7
		Explaination explaination= new Explaination();
		explaination.salutation("Bob");
	
		// Java 8
		// no need to implement MyInterface or create an object of this class
		MyInterface goodMorning = s -> System.out.println("Good Morning "+s);
		MyInterface goodAfternoon = s -> System.out.println("Good Afternoon "+s);
		MyInterface goodNight = s -> System.out.println("Goodnight "+s);
		goodMorning.salutation("Jim");
		goodMorning.salutation("Bill");
		goodAfternoon.salutation("Frank");
	}
}
interface MyInterface {
	void salutation(String s);
}

