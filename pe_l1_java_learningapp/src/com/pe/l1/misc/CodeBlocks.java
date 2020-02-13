package com.pe.l1.misc;

public class CodeBlocks {

	// static block
	static {
		System.out.println("\tIn Static Block");
	}
	// initialize block
	{
		System.out.println("\tIn Initialize Block");
	}
	// constructor
	public CodeBlocks() {
		System.out.println("\tIn Constructor");
	}
	
	public static void intro() {
		System.out.println("One important thing to understand in Java is when certain code blocks are ran during object " +
				"creation. The following example demonstrates the order in which the blocks are executed.\nExample:");
		CodeBlocks a1 = new CodeBlocks();

	}

}
