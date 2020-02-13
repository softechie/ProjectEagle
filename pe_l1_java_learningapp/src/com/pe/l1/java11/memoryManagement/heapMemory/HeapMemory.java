package com.pe.l1.java11.memoryManagement.heapMemory;


import com.pe.l1.utility.ExitModule;

public class HeapMemory {

	public static void intro(){
		System.out.println("This part of memory stores the actual object in memory. Those are referenced by the " +
				"variables from the stack. When\ncreating an object in Java, the new keyword is responsible for ensuring " +
				"that there is enough free space on heap to store the object.");
		System.out.println("You can view the amount of memory allocated for the heap with \"Runtime.getRuntime().totalMemory();\"");
		new HeapMemory().readHeap();
		ExitModule.pressEnterToExit();
	}
	public void readHeap(){
	
		//Print Heap Size
	  	System.out.println("Example:\n\tThis heapSize is " +Runtime.getRuntime().totalMemory()+" bytes\n");


	}
}
