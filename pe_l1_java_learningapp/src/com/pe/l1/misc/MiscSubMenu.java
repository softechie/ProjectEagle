package com.pe.l1.misc;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.pe.l1.miscMenu.InlineExample.InlineConditions;
import com.pe.l1.miscMenu.codeBlocks.CodeBlocks;
import com.pe.l1.miscMenu.enumerations.Enumerations;
import com.pe.l1.miscMenu.enumerations.MainClass1;
import com.pe.l1.miscMenu.overRide.MainClassOverride1;

/**
 * Modified by Harshitha on 18/7/2018.
 */
public class MiscSubMenu {

    public static void subMenu(){
        int selection;
        Scanner input = new Scanner(System.in);

        display: while(true) {
            System.out.println("-- Misc --");
            System.out.println(
                    "Select an option: \n" +
                            "  1) Enumerations\n" +
                            "  2) Initializer block\n" +
                            "  3) Use of Inline Conditions\n" +
                            "  4) OverRide Examples\n"
                          + "  5) Back to Main Menu"
            );

            try {
                selection = input.nextInt();
            }catch(InputMismatchException ime){
                System.out.println("Please enter a numerical value.");
                selection = 9999;
            }
            input.nextLine();

            switch (selection) {
                case 1:
                	Enumerations.intro();
                    break;
                case 2:
                   CodeBlocks.intro();
                    break;
                case 3: 
                	InlineConditions.main(null);
                    break;
                case 4: 
                	MainClassOverride1.main(null);
                	//InlineConditions.main(null);
                    break;  
                case 5:
                	System.out.println("Going back to menu.\n");
                    break display;
                default:
                    System.out.println("That was not a valid number. Select a number from the list.\n");
                    break;
            }
        }
    }
}
