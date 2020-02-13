package com.pe.l1.java8.methodReferences;

import java.util.function.BiFunction;

/*
 * This class uses an existing functional interface in the Java library
 */
public class StaticReference {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;
		System.out.println("Product of given number is: " + product.apply(11, 5));
	}
}

class Multiplication {
	public static int multiply(int a, int b) {
		return a * b;
	}
}
