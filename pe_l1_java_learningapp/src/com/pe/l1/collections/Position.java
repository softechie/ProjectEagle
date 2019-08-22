package com.pe.l1.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Position {
	final static int SIZE = 10;

	public static void main(String[] args) {
		frequency();
		frequencyIdiom();
	}
	//Method to find the position of an element With using idioms
	public static void frequencyIdiom() {

		// setup
		long start = System.currentTimeMillis(); //IDIOM:Item-0142: Inject a clock instead of hard-coding time
		ArrayList<Integer> mylist = new ArrayList(SIZE);
		int count = 0;
		while (count < SIZE) {
			mylist.add(new Integer(count + 1));
			++count;
		}
		// Collections.shuffle(mylist);
		System.out.println(mylist);

		// search
		Integer value = new Integer(5);

		if (Collections.frequency(mylist, value) == 0)//IDIOM:Item-0013: Prefer Collections over Array
			System.out.println("5 is not in the list");
		else
			System.out.println("5 is in the list");

		ArrayList<Integer> target = new ArrayList<Integer>(1);
		target.add(value);

		int index = Collections.indexOfSubList(mylist, target);
		if (index == -1)
			System.out.println("5 is not in the list");
		else
			System.out.println("5 is in the list at index" +  index);
		long end = System.currentTimeMillis();
		System.out.println("Elapsed time using idioms is" + (end - start) + "ms");
	}

	//Method to find the position of an element Without using idioms
	public static void frequency() {

		long start = System.currentTimeMillis();
		int n, x, flag = 0, i = 0;
		int[] array = { 1, 2, 3, 4, 4, 6, 5, 8, 9, 8 };
		for (int element : array) {
			System.out.println(element);
		}
		System.out.println("element to be searched in the array is 5");
		for (i = 0; i < 10; i++) {
			if (array[i] == 5) {
				flag = 1;
				break;
			} else {
				flag = 0;
			}
		}
		if (flag == 1) {
			System.out.println("Element is found in the list and at index position" +  i);
		} else {
			System.out.println("Element not found");

		}
		long end = System.currentTimeMillis();
		System.out.println("Elapsed time without using idioms is" + (end - start) + "ms");
	}
}
