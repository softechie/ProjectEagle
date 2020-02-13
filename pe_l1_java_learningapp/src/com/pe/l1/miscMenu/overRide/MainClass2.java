package com.pe.l1.miscMenu.overRide;

public final class MainClass2 {

	public static void main(String[] args) {
		Example2 e1 = new Example2(10, 15); 
		System.out.println("Here is an exmaple of Overriding toString()\n");
		System.out.println("The default toString() method in Object prints “class name @ hash code”."
				+ "\nWe can override toString() method in our class to print proper output."
				+ "\nFor example, in the following code toString() is overridden to print “Real + i Imag” form.");
		System.out.println("\n---OUTPUT after Overriding toString()---");
        System.out.println(e1); 
        System.out.println("\n---OUTPUT without Overriding toString()---");
System.out.println("com.pe.l1.miscMenu.overRide.Example2@7852e922");
	}

}
