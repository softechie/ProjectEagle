package com.pe.l1.oop.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		PolyExample a; 
		
		//point the parent reference to child class .  
        a = new PolyChild1(); 
        a.print(); 
  
        a = new PolyChild2(); 
        a.print(); 
	}

}
