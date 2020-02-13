package com.pe.l1.oop.polymorphism;

import com.pe.l1.utility.ExitModule;

/**
 * Created by rlawtonj on 5/10/2018.
 */
public class Polymorphism {

	public static void intro() {
		System.out.println(" Polymorphism is the ability of an object to take on many forms. The most common use of "
				+ "polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.");
		System.out.println("Example:\n\tpublic class Car extends Vehicle implements Convertible\n");
		System.out.println(" The Car \"is a\" Car but the Car also \"is a\" Convertible and \"is a\" Vehicle. So if we "
				+ "refer to a Car object as Vehicle v = new Car() or Car c = new Car(), the object will take different "
				+ "forms.\n");
		ExitModule.pressEnterToExit();
	}
}
