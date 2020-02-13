package com.pe.l1.utility;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by rlawtonj on 5/9/2018.
 */
public class SubMenu_Template {

    public static void subMenu(){
       
        Scanner input = new Scanner(System.in);

        display: while(true) {
            System.out.println("-- Java Tutorial --");
            System.out.println(
                    "Select an option: \n" +
                            "  1) OOP Principles\n" +
                            "  2) Inheritance\n" +
                            "  3) Inheritance\n" +
                            "  4) Java 8 \n" +
                            "  5) Back to Main Menu"
            );
            int selection;
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

                    break;
                case 4:

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
