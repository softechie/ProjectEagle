package com.pe.l1.java11.isEmpty;

import java.util.*;
public class IsEmpty {

	  public static void intro() {
	        // Your code here!
	       System.out.println("This instance method returns a boolean value. Empty Strings and Strings with only white spaces are treated as blank.\n");
	       
	       System.out.println("".isEmpty()); //true
	        
	        String s = "Anupam";
	        System.out.println(s.isEmpty()); //false
	        String s1 = "";
	        System.out.println(s1.isEmpty()); //true
	        
	    }

}	
