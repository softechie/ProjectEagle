package com.pe.l1.java8.ioBasicOpern;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by basantha on 5/9/2019.
 */
public class ioBasicOpern {

	public static void subMenu(){
        int selection;
        Scanner input = new Scanner(System.in);

        display: while(true) {
            System.out.println("-- IO Basics --");
            System.out.println(
                    "Select an option: \n" +
                            "  1) String Reader\n" +
                            "  2) Buffer Reader\n" +
                            "  3) Back to Main Menu\n"  
            );

            try {
                selection = input.nextInt();
            }catch(InputMismatchException ime){
                System.out.println("Please enter a numerical value.");
                selection = 9999;
            }finally {
            	 input.nextLine();
            }
           

            switch (selection) {
                case 1:
                	System.out.println("-- String Reader--");
                    break;
                case 2:
                	System.out.println("-- Buffer Reader--");
                    break;             
                case 3:
                    System.out.println("Going back to main menu.\n");
                    break display;
                default:
                    System.out.println("That was not a valid number. Select a number from the list.\n");
                    break;
            }
        }
    }
}