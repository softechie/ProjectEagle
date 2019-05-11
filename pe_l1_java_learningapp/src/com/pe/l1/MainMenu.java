package com.pe.l1;

import com.pe.l1.designPatterns.DesignPattMenu;
import com.pe.l1.exceptionHandling.ExceptionMenu;
import com.pe.l1.java8.Java8Menu;
import com.pe.l1.memoryManagment.MemoryMenu;
import com.pe.l1.oop.OopMenu;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Created by rlawtonj on 5/9/2018.
 */
public class MainMenu {

    public static void mainMenu(){
        int selection;
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("-- Java Tutorial --");
            System.out.println(
                    "Select an option: \n" +
                            "  1) OOP Principles\n" +
                            "  2) Memory Management\n" +
                            "  3) Exception Handling\n" +
                            "  4) Java 8 \n" +
                            "  5) Design Pattern Examples \n" +
                            "  6) Misc \n" +
                            "  7) Exit"  
                              
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
                    OopMenu.subMenu();
                    break;
                case 2:
                    MemoryMenu.subMenu();
                    break;
                case 3:
                    ExceptionMenu.subMenu();
                    break;
                case 4:
                    Java8Menu.subMenu();
                    break;
                case 5:
                    DesignPattMenu.subMenu();
                    break;
                case 6:
                    DesignPattMenu.subMenu();
                    break;
                case 7:
                    System.out.println("Exiting system.");
                    System.exit(1);
                    break;
                default:
                    System.out.println("That was not a valid number. Select a number from the list.\n");
                    break;
            }
        }
    }
}
