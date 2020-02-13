package com.pe.l1.java11.lines;

import java.util.stream.Stream;
import java.lang.*;
public class Lines
{
	
	public static void main(String[] args) {
	
		
		var multiline = "My\nname is\nahsen saeed";
		Stream<String> stream = multiline.lines();
		stream.map(String::toUpperCase)
		      .forEach(System.out::println);
		
		
		
//		//New line seperator \n
//		String s = "Line 1\nLine2\nLine 3\nLine4";
//		Stream<String> lines = s.lines();
//		
//		lines.forEach(System.out::println);
//       lines.close();
//		
//		//New Line Seperator \r\n
//		s = "Line 1\r\nLine2\r\nLine 3\r\nLine4";
//		lines = s.lines();
//		lines.forEach(System.out::println);
//       lines.close();
	}
}



