package com.pe.l1.javasecurity.algorithms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AsymmetricKeyAlgorithmsMenu {

	public static void menu()
	{
		 int selection;  //IDIOM:Item-0008: Use descriptive identifiers
			Scanner input = new Scanner(System.in);

	        display: while(true) {
	            System.out.println("-------Asymmetric key encryption Algorithms------");
	            System.out.println(
	                    "Select an option: \n" +
	                            "  1) RSA\n" +
	                            "  2) Diffe-Hellman\n" +
	                            "  3) Elgamal\n" +
	                            "  4) DSA\n" +	                            
	                            "  5) Back to Main Menu \n"
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
	                    RSA.intro();
	                    break;
	                case 2:
	                	DiffeHellman.intro();
	                    break;
	                case 3:
	                    Elgamal.intro();
	                    break;
	                case 4:
	                	DSA.intro();
	                    break;
	             
	                case 5:
	                    System.out.println("Going back to main menu.\n");
	                    break display;
	                default:
	                    System.out.println("That was not a valid number. Select a number from the list.\n");
	                    break;
	            }
	           
	        }
	}
}
