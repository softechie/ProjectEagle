package com.pe.l1.javasecurity;

import java.util.*;

import com.pe.l1.javasecurity.algorithms.AlgorithmsMenu;
import com.pe.l1.javasecurity.basicterminology.BasicTerminology;
import com.pe.l1.javasecurity.crypto.Crypto;

public class SecurityMenu {

	public static void menu(){
        int selection;  //IDIOM:Item-0008: Use descriptive identifiers
		Scanner input = new Scanner(System.in);

        display: while(true) {
            System.out.println("-------Java Security------");
            System.out.println(
                    "Select an option: \n" +
                            "  1) Introduction to java security\n" +
                            "  2) Cryptography\n" +
                            "  3) Basic terminology\n" +
                            "  4) Crytpgraphic algorithms\n" +                           
                            "  5) Back to Main Menu"
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
                    Security.intro();
                    break;
                case 2:
                	Crypto.intro();
                    break;
                case 3:
                   BasicTerminology.intro();
                    break;
                case 4:
                	AlgorithmsMenu.menu();
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
