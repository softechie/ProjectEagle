package com.pe.l1.memoryManagment;

import com.pe.l1.memoryManagment.garbageCollection.GarbageCollection;
import com.pe.l1.memoryManagment.heapMemory.HeapMemory;
import com.pe.l1.memoryManagment.stackMemory.StackMemory;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by rlawtonj on 5/9/2018.
 */
public class MemoryMenu {

    public static void subMenu(){
        int selection;
        Scanner input = new Scanner(System.in);

        display: while(true) {
            System.out.println("-- Memory Management --");
            System.out.println(
                    "Select an option: \n" +
                            "  1) Garbage Collection\n" +
                            "  2) Stack Memory\n" +
                            "  3) Heap Memory\n" +
                            "  4) Back to Main Menu"
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
                    GarbageCollection.intro();
                    break;
                case 2:
                    StackMemory.intro();
                    break;
                case 3:
                    HeapMemory.intro();
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
