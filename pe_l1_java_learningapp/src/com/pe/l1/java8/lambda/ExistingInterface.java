package com.pe.l1.java8.lambda;

import java.util.function.Consumer;

public class ExistingInterface {

	public static void main(String[] args) {
		/**
		 *  Consumer<> is one of many existing functional interfaces
		 *  in the Java library
		 *  accept (T t) is a method in the Consumer interface     */
		Consumer<String> c = s -> System.out.println(s);
		c.accept("lambda");
		// OR
		Consumer<String> c2 = System.out::println;  // using method reference
		c2.accept("Method reference");

		Person p = new Person("Dean", "Franks", 42);  // using method reference
		Consumer<Person> po = System.out::println;    // lambda would be
		po.accept(p);								  // Consumer<Person> po = p -> System.out.println(p);
	}
}

class Person {
	//IDIOM:Item-0007: Sort things logically
	private String fName;
	private String lName;
	private int age;
	
	public Person(String fName, String lName, int age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}
	public String getfName() {
		return fName;
	}
	
	public String getlName() {
		return lName;
	}
	
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return ("First name: " + fName + ", Last name: " + lName + ", Age: " + age );
	}
	
}
