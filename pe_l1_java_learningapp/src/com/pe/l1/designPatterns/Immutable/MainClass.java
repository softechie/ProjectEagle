package com.pe.l1.designPatterns.Immutable;

public class MainClass {

	public static void main(String[] args) {
		Immutable user = new Immutable.UserBuilder("ABCD", "password").build();
		System.out.println("Builder Pattern says that \"construct a complex object from simple objects using step-by-step approach\"\r\n" + 
				 
				"It is mostly used when object can't be created in single step like in the de-serialization of a complex object.\n");
		
	}
}	