/**
 * 
 */
package com.triphan.controlflow;

import java.util.Scanner;

/**
 * This program demonstrates the switch statemnet.
 * @version 1.00 2021-10-09
 * @author OS
 *
 */
public class SwitchSample {

	public static void main(String[] args) {
		
		/*
		 * NOTE:
		 * A case label can be:
		 * 		_ A constant expression of type char, byte, short, or int.
		 *  	_ An enumerated constant.
		 *  	_ Starting with Java 7, a string literal.
		 * 
		 * */
		
////		Example 1:
//		
////		Read input
//		int choice;
//		try (Scanner in = new Scanner(System.in)){
//			System.out.print("Your choice ? (1, 2, 3, 4) ");
//			choice = in.nextInt();
//		}
//		
//		switch (choice) {
//		case 1:
//			System.out.println("You chose the first");
//			break;
//		case 2:
//			System.out.println("You chose the second");
//			break;
//		case 3:
//			System.out.println("You chose the third");
//			break;
//		case 4:
//			System.out.println("You chose the fourth");
//			break;
//			
//		default:
//			System.out.println("You chose invalid option");
//			break;
//		}
//		
//		System.out.println("----- End of program -----");
		
//		--------------------------------------------------------------------------------
		
////		Example 2:
//		
//		Scanner in = new Scanner(System.in);
//		int choice;
//		boolean stop = true;
//		
//		while (true) {
//			System.out.print("Your choice ? ");
//			choice = in.nextInt();
//			
//			switch (choice) {
//			case 1:
//				System.out.println("You chose the first option.");
//				break;
//			case 2:
//				System.out.println("You chose the second option.");
//				break;
//			case 3:
//				System.out.println("You chose the third option.");
//				break;
//			case 4:
//				System.out.println("You chose the fourth option.");
//				break;
//
//			default:
//				System.out.println("You chose an invalid option. Try again!");
//				stop = false;
//				break;
//			}
//			
//			if (stop) {
//				break;
//			} else {
//				stop = true;
//				continue;
//			}
//		}
//		
////		Close the scanner
//		in.close();
//		
////		Display a message 
//		System.out.println("----- End of Program -----");
		
//		--------------------------------------------------------------------------------
		
////		Example 3: Using an enumerated constant in case label
////		When you use the switch statement with enumerated constants, you need not
////		supply the name of the enumeration in each label.
//		
////		Define a enumerated type
//		enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}
////		Declare variables of this type
//		Size s = Size.MEDIUM;
//		
//		switch (s) {
//		case EXTRA_LARGE: // no need to use Size.EXTRA_LARGE
//			System.out.println("You chose the extra large size.");
//			break;
//		case LARGE: 
//			System.out.println("You chose the large size.");
//			break;
//		case MEDIUM: 
//			System.out.println("You chose the medium size.");
//			break;
//		case SMALL: 
//			System.out.println("You chose the small size.");
//			break;
//
//		default:
//			break;
//		}
//		
		
//		--------------------------------------------------------------------------------
		
////		Example 4: Using an String literal constant in case label
//		
//		Scanner in = new Scanner(System.in);
//		System.out.print("Enter yes or no: ");
//		String input = in.next();
////		Close the scanner
//		in.close();
//		
//		switch (input) {
//		case "yes":
//			System.out.println("You say \"yes\".");
//			break;
//
//		default:
//			System.out.println("You do not say \"yes\".");
//			break;
//		}
//		
//		System.out.println("----- End of the program -----");
		
	}

}































