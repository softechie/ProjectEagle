package com.pe.l1.javasecurity.algorithms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HashFunctionsMenu {

	public static void menu()
	{
		 int selection;  //IDIOM:Item-0008: Use descriptive identifiers
			Scanner input = new Scanner(System.in);

	        display: while(true) {
	            System.out.println("-------Hash Fucntions------");
	            System.out.println(
	                    "Select an option: \n" +
	                            "  1) Intoduction to hash functions\n" +
	                            "  2) Message Digest hash algorithm (MD)\n" +
	                            "  3) Secure hash algorithm (SHA)\n" +	                                                      
	                            "  4) Back to Main Menu \n"
	              );
	                           
	           try {
	                selection = input.nextInt();
	            }catch(InputMismatchException ime){
	                System.out.println("Please enter a numerical value.");
	                selection = 9_999; //IDIOM:item:0360: Use underscores for thousands separator
	          
	          }
	            input.nextLine();
	         
	            switch (selection) {
	                case 1:
	                	HashFunctions.intro();
	                    break;
	                case 2:
	                	MessageDigestHashAlgorithm.intro();
	                    break;
	                case 3:
	                	SecureHashAlgorithm.intro();
	                    break;
	               		              
	                case 4:
	                    System.out.println("Going back to main menu.\n");
	                    break display;
	                default:
	                    System.out.println("That was not a valid number. Select a number from the list.\n");
	                    break;
	            }
	           
	        }
	}
}
