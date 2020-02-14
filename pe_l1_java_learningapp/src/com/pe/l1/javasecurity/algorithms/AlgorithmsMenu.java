package com.pe.l1.javasecurity.algorithms;


	import java.util.InputMismatchException;
	import java.util.Scanner;
	public class AlgorithmsMenu {
	
		public static void menu()
		{
			 int selection;  //IDIOM:Item-0008: Use descriptive identifiers
				Scanner input = new Scanner(System.in);

		        display: while(true) {
		            System.out.println("-------Cryptograhic Algorithms------");
		            System.out.println(
		                    "Select an option: \n" +
		                            "  1) Symmetric key cryptographic algorithms\n" +
		                            "  2) Asymmetric key cryptographic algorithms\n" +
		                            "  3) Hash functions or Hash algorithms\n" +
		                            "  4) Message Authentication Codes\n" +                            
		                            "  5) Back to Main Menu \n"
		              );
		                           
		           try {
		                selection = input.nextInt();
		            }catch(InputMismatchException ime){
		                System.out.println("Please enter a numerical value.");
		                selection = 9_999; //IDIOM:item:0360: Use underscores for thousands separator
		          
		          }
		            input.nextLine();
		         
		            switch (selection) {
		                case 1:
		                	SymmetricKeyAlgorithmsMenu.menu();
		                    break;
		                case 2:
		                	AsymmetricKeyAlgorithmsMenu.menu();
		                    break;
		                case 3:
		                	HashFunctionsMenu.menu();
		                    break;
		                case 4:
		                	MessageAuthenticationCode.intro();
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

