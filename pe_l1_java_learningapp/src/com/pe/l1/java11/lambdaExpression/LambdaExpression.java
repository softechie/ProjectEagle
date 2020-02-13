package com.pe.l1.java11.lambdaExpression;

import java.util.function.Function;
import java.util.stream.Stream;

import org.eclipse.jdt.annotation.NonNull;

public class LambdaExpression {
	public static void main(String[] args) {
	Function<String, String> append = (@NonNull var string) -> string + " World";
	String appendedString = append.apply("Hello");
	System.out.println(appendedString);

	
}
}