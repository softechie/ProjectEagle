package com.pe.l1.java8.Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		
		
		//IDIOM:Item-0367: Avoid Optionals in general
		Optional<Integer> value1 = Optional.ofNullable(10); 
		Optional<Integer> value2 = Optional.ofNullable(null); 
		System.out.println("-----Example1: Optional.isPresent----");
		System.out.println("The isPresent() function in Optional Class is used to evaluate "
				+ "\nwhether the value if assigned to variable is present or not.\n");
		System.out.println("Here is the example of how not to use optional with isPresent()");
		System.out.println("import java.util.Optional; \r\n" + 
				"public class present { \r\n" + 
				"public static void main(String args[]) { \r\n" + 
				"  \r\n" + 
				"    // Optional.ofNullable - allows passed \r\n" + 
				"    // parameter to be not null. \r\n" + 
				"    Optional<Integer> value1 = Optional.ofNullable(10); \r\n" + 
				"  \r\n" + 
				"    // Optional.ofNullable - allows passed \r\n" + 
				"    // parameter to be null. \r\n" + 
				"    Optional<Integer> value2 = Optional.ofNullable(null); \r\n" + 
				"    System.out.println(\"First parameter is present:\" + \r\n" + 
				"                        value1.isPresent()); \r\n" + 
				"    System.out.println(\"Second parameter is present:\" + \r\n" + 
				"                        value2.isPresent()); \r\n" + 
				"} \r\n" + 
				"} ");
		System.out.println("---OUTPUT---");
		
		//IDIOM:Item-0366: Remove any usages of use Optional.isPresent
		System.out.println("First parameter is present:" + 
							value1.isPresent()); 
		System.out.println("Second parameter is present:" + 
							value2.isPresent()+"\n"); 
		
		System.out.println("-----Example2:  Objects.isNull----");
		System.out.println("Objects.isNull-Returns true if the provided reference is null otherwise returns false."
				+ "\n Useful if used as a java.util.function.Predicate.");
		System.out.println("Here is an example:\n");
		System.out.println(" String str = \"testString\";\r\n" + 
				"        //equivalent to obj == null;\r\n" + 
				"        boolean b = Objects.isNull(str);\r\n" + 
				"        System.out.println(b);");
		 String str = "testString";
	        //equivalent to obj == null;
		 
		//IDIOM: Item-9000: Remove any usages of Objects.isNull
	        boolean b = Objects.isNull(str);
	        
        System.out.println("--OUTPUT---");

        System.out.println(b);

	}

}

