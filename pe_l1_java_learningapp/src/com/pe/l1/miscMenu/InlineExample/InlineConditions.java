package com.pe.l1.miscMenu.InlineExample;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class InlineConditions {

        public static void main(String[] args) {
        	long start = System.currentTimeMillis();
       	Scanner scan = new Scanner(System.in);
		    // variable declaration 
		    int n1 , n2 , max; 
		      System.out.print("Enter Two Number : ");
	        n1 = scan.nextInt();
	        n2= scan.nextInt();
			 
	        
	      //IDIOM:Item-9003: Inline unnecessary conditionals
		    System.out.println("Largest number between " +  
	                   " is " + ((n1 > n2) ? n1 : n2) );
		    long end = System.currentTimeMillis();

			NumberFormat formatter = new DecimalFormat("#0.00000");
			System.out.print("Execution time using idioms is" + formatter.format((end - start) / 1000d) + " miliseconds\n");
		}
}
       /* long start = System.currentTimeMillis();
        int a, b, big = 0;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Two Number : ");
        a = scan.nextInt();
        b = scan.nextInt();
		
        if(a>b)
        {
            big = a;
        }
        else
        {
            big = b;
        }
		
		
        System.out.print("Largest of Two Number is " +big+"\n");
        long end = System.currentTimeMillis();

		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " miliseconds\n");
		//5.51700 
		
    }
	} 
		*/
        

