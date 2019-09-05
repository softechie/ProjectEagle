package com.pe.l1.java8;

import com.pe.l1.java8.Comparator.MainClass;
import com.pe.l1.java8.DateTime.DateTimeExample;
import com.pe.l1.java8.Optional.OptionalExample;
import com.pe.l1.java8.interfaceChanges.InterfaceChanges;
import com.pe.l1.java8.ioBasicOpern.ioBasicOpern;
import com.pe.l1.java8.lambda.Lambda;
import com.pe.l1.java8.methodReferences.MethodReference;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by rlawtonj on 5/9/2018.
 */
public class Java8Menu {

	public static void subMenu() {
		int selection;
		Scanner input = new Scanner(System.in);

		display: while (true) {
			System.out.println("-- Java 8 Features --");
			System.out.println("Select an option: \n" + "  1) Lambda Expressions\n" + "  2) Method References\n"
					+ "  3) Interface Changes\n" + "  4) Java IO Basic \n" + " "
							+ " 5) Comparators\n"
							+ "  6) Date and Time\n"
							+ "  7) Optional \n"
							+ "  8) Back to Main Menu");

			try {
				selection = input.nextInt();
			} catch (InputMismatchException ime) {
				System.out.println("Please enter a numerical value.");
				selection = 9999;
			} finally {

				input.nextLine();
			}

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
				MainClass.main(null);
				break;
			case 6:
				DateTimeExample.main(null);
				break;
			case 7:
				OptionalExample.main(null);
				break;
			case 8:
				System.out.println("Going back to main menu.\n");
				break display;
			default:
				System.out.println("That was not a valid number. Select a number from the list.\n");
				break;
			}
		}
	}
}
