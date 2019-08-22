//IDIOM:Item-0368: Use underscore to separate words in package names
package com.pe.l1.exception_Handling.tryCatch;

import java.util.Scanner;

public class TryCatchProgram {
	void tryExample() {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("-----RUNTIME EXCEPTIONS EXAMPLES-------\n");
			System.out.println("Example1 to demonstrate ArithmeticException:\n");
			System.out.println("ArithmeticException occurs when an integer is divided by zero.\n");
			 int num1=30, num2=0;
	         int output=num1/num2;
			System.out.println("devision of two number is:" + output+"\n");

		} catch (Exception e) {
			System.out.println("---OUTPUT----");
			System.out.println("Cannot divide by zero..\n");
		}
		
		try {
			System.out.println("Example2 to demonstrate NegativeArraySizeException and ArrayIndexOutOfBoundsException:\n");
			System.out.println("ArrayIndexOutOfBoundsException occurs when you try to access the array index which does not exist.\n "
					+ "For example, If array is having only 5 elements and"
					+ " we are trying to display 7th element then it would throw this exception.");
			System.out.println("NegativeArraySizeException occurs when you try to assign negative size to the array\n");
			System.out.println("enter the size of the array");
			int size = input.nextInt();
			int[] array = new int[size];
			System.out.println("enter the elemnt to be stored");
			int elem = input.nextInt();
			System.out.println("enter the position at which element has to be stored");
			int position = input.nextInt();
			array[position] = elem;
			System.out.println("Element stored is:"+array[position]+"\n");
		} catch (NegativeArraySizeException ne) {
			System.out.println("give a positive value");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Index is out of bound\n");
		}
		
		try{
			System.out.println("Example3 to demonstrate NullPointerException:\n");
			System.out.println("NullPointerException occurs when the application try to use an object reference which has a null value.\n"
					+ "In the above example String object str is null due to which NullPointerException occurred.\n");
			String str=null;
			System.out.println (str.length());
		}
	        catch(NullPointerException e){
	        System.out.println("---OUTPUT----");
			System.out.println("Assign a value to String");
		}
		
	}

}
