package com.pe.l1.collections;

import java.util.InputMismatchException;

import java.util.Scanner;
public class CollectionMenu {

	public static void subMenu(){
        int selection;  //IDIOM:Item-0008: Use descriptive identifiers
		Scanner input = new Scanner(System.in);

        display: while(true) {
            System.out.println("--  Collection Examples --");
            System.out.println(
                    "Select an option: \n" +
                            "  1) minMax\n" +
                            "  2) Position\n" +
                            "  3) PrintElement\n" +
                            "  4) Search\n" +
                            "  5) Shuffle\n" +
                            "  6) Sort\n" +
                            "  7) Back to Main Menu"
            );
           try {
                selection = input.nextInt();
            }catch(InputMismatchException ime){
                System.out.println("Please enter a numerical value.");
                selection = 9_999; //IDIOM:item:0360: Use underscores for thousands separator
            }
            input.nextLine();
          //IDIOM:Item-0007: Sort things logically
            switch (selection) {
                case 1:
                    minMax.main(null);
                    break;
                case 2:
                	 Position.main(null);
                    break;
                case 3:
                    PrintElement.main(null);
                    break;
                case 4:
                	Search.main(null);
                    break;
                case 5:
                	Shuffle.main(null);
                    break;
                case 6:
                	sort.main(null);
                    break;
                case 7:
                    System.out.println("Going back to main menu.\n");
                    break display;
                default:
                    System.out.println("That was not a valid number. Select a number from the list.\n");
                    break;
            }
        }
    }
}
