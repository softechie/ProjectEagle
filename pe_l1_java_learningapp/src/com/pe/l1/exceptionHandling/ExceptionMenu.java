package com.pe.l1.exceptionHandling;

import com.pe.l1.exceptionHandling.exceptions.Exceptions;
import com.pe.l1.exceptionHandling.throwVsThrows.ThrowVsThrows;
import com.pe.l1.exceptionHandling.tryCatch.TryCatchExample;
import com.pe.l1.exceptionHandling.tryWithResources.TryWithResources;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by rlawtonj on 5/9/2018.
 */
public class ExceptionMenu {

    public static void subMenu(){
        int selection;
        Scanner input = new Scanner(System.in);

        display: while(true) {
            System.out.println("-- Exception Handling --");
            System.out.println(
                    "Select an option: \n" +
                            "  1) Exceptions\n" +
                            "  2) Try/Catch Statement\n" +
                            "  3) Try with Resources\n" +
                            "  4) Throw vs Throws\n" +
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
                    Exceptions.intro();
                    break;
                case 2:
                    TryCatchExample.intro();
                    break;
                case 3:
                    TryWithResources.intro();
                    break;
                case 4:
                    ThrowVsThrows.intro();
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
