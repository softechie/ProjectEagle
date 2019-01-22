package com.pe.l1.misc;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by rlawtonj on 5/9/2018.
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
                            "  5) Back to Main Menu"
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

                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Going back to com menu.\n");
                    break display;
                default:
                    System.out.println("That was not a valid number. Select a number from the list.\n");
                    break;
            }
        }
    }
}
