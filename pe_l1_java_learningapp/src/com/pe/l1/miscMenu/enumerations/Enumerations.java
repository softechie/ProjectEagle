
package com.pe.l1.miscMenu.enumerations;

/**
 * Created by Harshitha on 18/7/2018.
 */

import com.pe.l1.utility.ExitModule;



public class Enumerations {
	
	public static void intro() {
	
		System.out.println(
				"Enumerations serve the purpose of representing a group of named constants in a programming language.\n"
						+ "Constructor of enum type is private. If you don't declare private,"
						+ " compiler internally creates private constructor."
						+ "\nThe following is the example for enum " + "\n\npublic class Enumerations {\n"
						+ "enum Season{   \n" + "WINTER(5), SPRING(10), SUMMER(15), FALL(20);   \n"
						+ "			  \n" + "private int value;  \n" + "private Season(int value){  \n"
						+ "this.value=value;  \n" + "  }  \n" + " }  \n"
						+ "	public static void main(String args[]){  \n" + "for (Season s : Season.values())  \n"
						+ "System.out.println(s+\" \"+s.value);  \n" + "  }\n"
						+ "	} \n");
		
		ExitModule.pressEnterToExit();
	}
	
	
	
	
	
}