package com.pe.l1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class sort {
	
	final static int SIZE=10;
	public static void main(String[] args) {
	     sort();
	     sortIdioms();

	}
	//Method to sort the elements Without using idioms
	public static void sort() {
		
		long start = System.nanoTime();
		  int[] arr = {2,6,8,1,3,7,4,9,5,10};  
	        // Iterating array elements  
	        for (int i : arr) {  
	            System.out.print(i+" ");  
	        }  
	        // Sorting array elements parallel  
	        Arrays.parallelSort(arr);  
	        System.out.println("\nArray elements after sorting");  
	        // Iterating array elements  
	        for (int i : arr) {  
	            System.out.print(i+" ");  
	        }
	        long end = System.nanoTime();
			System.out.println("\nElapsed time without using idioms is" + (end - start) + "ns");
		
		}
	//Method to sort the elements With using idioms
    public static void sortIdioms() { //Item-0032: Add a useful javadoc comment to each Class, Interface, Enum declaration
		
    	long start = System.nanoTime();
		ArrayList<Integer> mylist = new ArrayList(SIZE);
		int count = 0;
		while (count < SIZE) {
			mylist.add(new Integer(count + 1));
			++count;
		}
		Collections.shuffle(mylist);
		System.out.println(mylist);

		Collections.sort(mylist);
		 System.out.println("Array elements after sorting"); 
		System.out.println(mylist);
		long end = System.nanoTime();
		System.out.println("Elapsed time using idioms is" + (end - start) + "ns");
		
		
	}
	
	
	
	
	
	

}
