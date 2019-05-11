package com.pe.l1.java8;

import com.pe.l1.java8.interfaceChanges.InterfaceChanges;
import com.pe.l1.java8.ioBasicOpern.ioBasicOpern;
import com.pe.l1.java8.lambda.Lambda;
import com.pe.l1.java8.methodReference.MethodReference;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by rlawtonj on 5/9/2018.
 */
public class Java8Menu {

    public static void subMenu(){
        int selection;
        Scanner input = new Scanner(System.in);

        display: while(true) {
            System.out.println("-- Java 8 Features --");
            System.out.println(
                    "Select an option: \n" +
                            "  1) Lambda Expressions\n" +
                            "  2) Method References\n" +
                            "  3) Interface Changes\n" +
                            "  4) Java IO Basic \n" +
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
                    Lambda.intro();
                    break;
                case 2:
                    MethodReference.intro();
                    break;
                case 3:
                    InterfaceChanges.intro();
                    break;
                case 4:
                    ioBasicOpern.subMenu();
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
