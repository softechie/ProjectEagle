package com.pe.l1.oop;

import com.pe.l1.oop.abstraction.Abstraction;
import com.pe.l1.oop.encapsulation.Encapsulation;
import com.pe.l1.oop.inheritance.Inheritance;
import com.pe.l1.oop.polymorphism.Polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by rlawtonj on 5/9/2018.
 */
public class OopMenu {

	public static void subMenu() {
		int selection;
		Scanner input = new Scanner(System.in);

		display: while (true) {
			System.out.println("-- OOP Principles --");
			System.out.println("Select an option: \n" + "  1) Abstraction\n" + "  2) Polymorphism\n"
					+ "  3) Inheritance\n" + "  4) Encapsulation\n" + "  5) Back to Main Menu");

			try {
				selection = input.nextInt();
			} catch (InputMismatchException ime) {
				System.out.println("Please enter a numerical value.");
				selection = 9999;
			}
			input.nextLine();

			switch (selection) {
			case 1:
				Abstraction.into();
				break;
			case 2:
				Polymorphism.intro();
				break;
			case 3:
				Inheritance.intro();
				break;
			case 4:
				Encapsulation.into();
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
