package com.pe.l1.miscMenu.codeBlocks;

/**
 * Created by Harshitha on 18/7/2018.
 */
import com.pe.l1.utility.ExitModule;

public class CodeBlocks {
	
	
	public static void intro() {
		
		CodeBlocks a1 = new CodeBlocks();

	}

	// static block
	static {
		System.out.println("The following example demonstrates the order in which the blocks are executed:");
		System.out.println("Static block will be executed only once at time of loading of class\n");
		System.out.println("\tIn Static Block\n");
	}
	// initialize block
	{
		System.out.println("Non static blocks/Initialize Block are executed when object is initialized i.e.\n" 
					+ "when constructor body is executed.\n");
		System.out.println("\tIn Initialize Block\n");
	}
	// constructor
	public CodeBlocks() {
		System.out.println("Constructor is called after object initialization\n");
		System.out.println("\tIn Constructor\n");
	}
	
	
}
