package com.pe.l1.java11;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.pe.l1.designPatterns.Immutable.MainClass;
import com.pe.l1.java11.asmatchpredicate.AsMatchPredicate;
import com.pe.l1.java11.files.Files;
import com.pe.l1.java11.flightRecorder.FlightRecorder;
import com.pe.l1.java11.isEmpty.IsEmpty;
import com.pe.l1.java11.lambdaExpression.LambdaExpression;
import com.pe.l1.java11.lines.Lines;
import com.pe.l1.java11.repeate.Repeat;
import com.pe.l1.java11.strip.Strip;
import com.pe.l1.java11.stripleading.StripLeading;
import com.pe.l1.java11.striptrailing.StripTrailing;
import com.pe.l1.java8.DateTime.DateTimeExample;
import com.pe.l1.java8.Optional.OptionalExample;
import com.pe.l1.java8.interfaceChanges.InterfaceChanges;
import com.pe.l1.java8.ioBasicOpern.ioBasicOpern;
import com.pe.l1.java8.lambda.Lambda;
import com.pe.l1.java8.methodReferences.MethodReference;

public class Java11Menu {

public static void subMenu() {
		int selection;
		Scanner input = new Scanner(System.in);

		display: while (true) {
			System.out.println("-- Java 11 Features --");
			System.out.println("Select an option: \n" + "  1) FlightRecorder\n"
				        	                          + "  2)  IsEmpty\n"
					                                  + "  3) Lines\n" 
				        	                          + "  4) Strip\n"
					              		              + "  5) StripLeading \n"
						                              + "  6) StripTrailing\n"
						                              + "  7) LambdaExpression\n"
							                          +  " 8) Repeate \n"
						                              + "  9) AsMatchPredicat\n"
							                          + "  10) Files\n"
						                              + "  11) Back to Main Menu");

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
				FlightRecorder.intro();
				break;
			case 2:
				IsEmpty.intro();
				break;
			case 3:
				Lines.main(null);
				break;
			case 4:
				Strip.intro();
				break;
				
			case 5:
				StripLeading.intro();
				break;
			case 6:
				StripTrailing.intro();
				break;
//			case 5:
//				MainClass.main(null);
//				break;
			case 7:
				LambdaExpression.main(null);
				break;
			case 8:
				Repeat.intro();
				break;
			case 9:
				AsMatchPredicate.main(null);
				break;
			case 10:
				Files.main(null);
				break;
//			case 10:
//				FlightRecorder.main(null);
//				break;
			case 11:
				System.out.println("Going back to main menu.\n");
				break display;
			default:
				System.out.println("That was not a valid number. Select a number from the list.\n");
				break;
			}
		}
	}
}



