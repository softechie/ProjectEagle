package com.pe.l1.java8.interfaceChanges;

public class MyClass implements MyInterface {
	
	public static void main(String[] args){
		MyClass m = new MyClass();
		m.myMethod();
		m.otherMethod();
		MyInterface.staticMethod();
	}
	
	@Override
	public void myMethod() {
		System.out.println("This is from overridden method");
	}
}

interface MyInterface {
	// all methods public by default, needs to be overridden
	void myMethod();
	
	// does not need to be overridden
	default void otherMethod(){
		System.out.println("This is from default interface method");
	}
	
	// static, does not need to be overridden
	static void staticMethod(){
		System.out.println("This is from static interface method");
	}
}