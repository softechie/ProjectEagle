package com.pe.l1.java8.lambda;

/**
 * A basic calculator built pre Java 8
 */
public class PreJava8Calc {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int divide(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		PreJava8Calc c = new PreJava8Calc();
		System.out.println(c.add(9, 5));
	}
}