package com.pe.l1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.io.*;

public class Shuffle {
	
	final static int SIZE=10;

	public static void main(String[] args) {
	    shuffleIdiom();
	    RandomizeArray(1,10);

	}
	//Method to shuffle the elements With using idioms
      public static void shuffleIdiom() 
      {
    	  long start = System.nanoTime(); 
    	  ArrayList<Integer> mylist=new ArrayList(SIZE);
    	  int count = 0;
    	  while(count< 10)
          {
    	    mylist.add(new Integer(count+1));
    	    ++count;
          }
    	  Collections.shuffle(mylist);
    	  System.out.println(mylist);
    	  long end = System.nanoTime(); 
    	  System.out.println("Elapsed time using idioms is"  + ( end - start) + "ns");
    	   
      }
    //Method to shuffle the elements Without using idioms
      public static void RandomizeArray(int a, int b){
    	  
    	long start = System.nanoTime();  
  		Random rgen = new Random();  // Random number generator		
  		int size = b-a+1;
  		int[] array = new int[size];
   
  		for(int i=0; i< size; i++){
  			array[i] = a+i;
  		}
   
  		for (int i=0; i<array.length; i++) {
  		    int randomPosition = rgen.nextInt(array.length);
  		    int temp = array[i];
  		    array[i] = array[randomPosition];
  		    array[randomPosition] = temp;
  		}
   
  		for(int s: array)
  			System.out.println(s);
   

  		
  		long end = System.nanoTime(); 
    	  System.out.println("Elapsed time without using idioms is"  + ( end - start) + "ns");
  		
  	}
      
      
}
