package com.pe.l1.collections;

import java.util.ArrayList;

public class PrintElement {
	final static int SIZE=10;

	public static void main(String args[]) {
		print();
		print1();
	}
	//Method to print elements Without using idioms
	public static void print() {
		
		long start = System.currentTimeMillis();//Item-0142: Inject a clock instead of hard-coding time
		int[] array = {1, 2, 3, 4, 5,6,7,8,9,8};
		for (int element: array) {
		System. out. println(element);
		}
		long end = System.currentTimeMillis();
	    System.out.println("Elapsed time Without using idioms is" + ( end - start) + "ms");
	}
	//Method to print elements With using idioms
	public static void print1()
	{
		long start = System.currentTimeMillis(); 
		  ArrayList<Integer> mylist=new ArrayList(SIZE);//Item-0013: Prefer Collections over Array
		  int count=0;
		  while(count<SIZE)
	      {
		    mylist.add(new Integer(count+1));
		    ++count;
	      }
		   System.out.println(mylist);
		   long end = System.currentTimeMillis();
	    System.out.println("Elapsed time using idioms is" + ( end - start) + "ms");
	}
}
