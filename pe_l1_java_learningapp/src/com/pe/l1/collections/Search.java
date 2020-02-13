package com.pe.l1.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Search {

	final static int SIZE = 10;

	public static void main(String args[]) {

		binarySearch();
		binarySearchIdiom();

	}
	//Method to search element Without using idioms
	public static void binarySearch() {
		
		long start = System.nanoTime();//IDIOM:Item-0142: Inject a clock instead of hard-coding time
		int  item, first, last, middle;
	      //To capture user input
	      
		 int[] a = { 1, 2, 3, 4, 4, 6, 5, 8, 9, 10};
	      item = 8;
	      first = 0;
	      last = SIZE - 1;
	      middle = (first + last)/2;
	      
	      for (int element: a) {
				System. out. println(element);
				}

	      while( first <= last )
	      {
	         if ( a[middle] < item )
	           first = middle + 1;
	         else if ( a[middle] == item )
	         {
	           System.out.println(item + " found at location " + (middle + 1) + ".");
	           break;
	         }
	         else
	         {
	             last = middle - 1;
	         }
	         middle = (first + last)/2;
	      }
	      if ( first > last )
	          System.out.println(item + " is not found.\n");
	      
	      long end = System.nanoTime();
			System.out.println("Elapsed time without using idioms is" + (end - start) + "ns");
	   }
      
	//Method to print elements With using idioms
	public static void binarySearchIdiom() {
		
		long start = System.nanoTime();
		ArrayList<Integer> mylist = new ArrayList(SIZE);//IDIOM:Item-0013: Prefer Collections over Array
		int count = 0;
		while (count < SIZE) {
			mylist.add(new Integer(count + 1));
			++count;
		}
		//Collections.shuffle(mylist);
		//System.out.println(mylist);

		Collections.sort(mylist);
		System.out.println(mylist);

		Integer value = new Integer(8);
		System.out.println("Element 8 is found at position" +Collections.binarySearch(mylist, value));
		long end = System.nanoTime();
		System.out.println("Elapsed time using idioms is" + (end - start) + "ns");
	}

}
