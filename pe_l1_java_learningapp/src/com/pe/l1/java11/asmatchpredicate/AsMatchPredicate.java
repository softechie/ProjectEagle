package com.pe.l1.java11.asmatchpredicate;

import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class AsMatchPredicate {
	
	public static void main(String[] args) {
		
		Predicate <String> chracterPredicate = Pattern.compile("ah").asPredicate();
		Stream.of("coding","ahsan","infinite")
		       .filter(chracterPredicate)
		       .forEach(System.out::println);
		

}
}