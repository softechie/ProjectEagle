package com.pe.l1.collections;

import java.util.ArrayList;
import java.util.Collections;

public class minMax {

	final static int SIZE = 10;

	public static void main(String[] args) {

		minMax();
		minMaxIdioms();

	}
//Method to find the Minimum and maximum Without using idioms
	public static void minMax() {

		long start = System.nanoTime(); //IDIOM:Item-0142: Inject a clock instead of hard-coding time
		int a[] = new int[] { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };

		int min = a[0]; // assume first element as smallest number
		int max = a[0]; // assume first element as largest number

		for (int i = 1; i < a.length; i++) // iterate for loop from arrays 1st index (second element)
		{
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		for (int element: a) {
			System. out. println(element);
			}
		System.out.println("Maximum in a given array is : " + max);
		System.out.println("Minimum in a given array is : " + min);
		long end = System.nanoTime();
		System.out.println("Elapsed time without using idioms is" + (end - start) + "ns");
	}
	//Method to find the Minimum and maximum With using idioms
	public static void minMaxIdioms() {
    //IDIOM:Item-0130: Use the correct data structure 
		long start = System.nanoTime();
		ArrayList<Integer> mylist = new ArrayList(SIZE);//Item-0013: Prefer Collections over Array
		int count = 0;
		while (count < SIZE) {
			mylist.add(new Integer(count + 1));
			++count;
		}
		Collections.shuffle(mylist);
		System.out.println(mylist);

		System.out.println(" The minimum is " + Collections.min(mylist));
		System.out.println(" The maximum is " + Collections.max(mylist));
		long end = System.nanoTime();
		System.out.println("Elapsed time using idioms is" + (end - start) + "ns");
	}

}
