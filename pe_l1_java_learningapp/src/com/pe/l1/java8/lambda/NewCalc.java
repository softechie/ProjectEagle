package com.pe.l1.java8.lambda;

/**
 * A calculator using Lambdas
 */
public class NewCalc {

	public static void main(String[] args) {
		/**
		 * lambda operator -> interface var = parameters -> method body; NumOperation
		 * add = int operation(a,b){return a+b;}
		 **/
		//IDIOM:Item-0451: inline unnecessary variables
		NumOperation add = (a, b) -> a + b;
		NumOperation subtract = (a, b) -> a - b;
		NumOperation divide = (a, b) -> a / b;
		NumOperation multiply = (a, b) -> a * b;

		System.out.println(multiply.operation(9, 10 ));
		System.out.println(multiply.operation(3, 2));
	}
}

// Functional interface - interface with only one abstract method
@FunctionalInterface // Annotation makes sure no one can add additional abstract methods
interface NumOperation {
	int operation(int a, int b);
}
