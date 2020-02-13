package com.pe.l1.java8.interfaceChanges;

//IDIOM:Item-0250: Don't reinvent the wheel
public class MyClass implements MyInterface {
	//IDIOM:Item-0032: Add a useful javadoc comment to each Class, Interface, Enum declaration
	/**
	 * MyClass implements MyInterface that explains how default interface method,
	 * static interface method and over ridden method works.
	 * @param args accepts arguments from command prompt
	 */
	public static void main(String[] args){
		MyClass myclass = new MyClass();
		myclass.myMethod();
		myclass.otherMethod();
		MyInterface.staticMethod();
	}
	
	
	@Override
	public void myMethod() {
		System.out.println("This is from overridden method");
	}
}

interface MyInterface {
	//IDIOM:Item-0251: Remove redundant "public" from your interface methods
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