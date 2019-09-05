package com.pe.l1.java8.methodReferences;

public class Person {

	public static void main(String[] args){
	// lambda
		Printer zero = s -> System.out.println(s);
		zero.print("Hey Bill");
		
	// Method reference
		Printer one = System.out::println;
		one.print("Hey Jim");
		one.print("Hey Joe");
	}
	
}

interface Printer {
	void print(String s);
}
