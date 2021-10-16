package com.triphan.exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) 
	{
//		Scanner in = new Scanner(System.in);
//		System.out.print("Choose the exercise ( 1 - 10 ): ");
//		String choice = in.nextLine();
//		
//		switch (choice) {
//		case "1":
//			System.out.println("\n***** Exercise 01 *****\n");
//			getAndDisplayInfo();
//			break;
//
//		default:
//			System.out.println("\n***** Exercise 02 *****\n");
//			calcAmount();
//			break;
//		}
//		
////		Close the scanner
//		in.close();
		
//		------------------------------------------------------------------------------------------------------------
		
		Scanner in;
		String choice;
		while (true) {
			in = new Scanner(System.in);
			System.out.print("Choose the exercise ( 1 - 10 ), enter e to exit the program: ");
			choice = in.nextLine();
			
			if (choice.equalsIgnoreCase("e")) {
				break;
			}
			
//			---------------------------------------------------------
			
			switch (choice) {
			case "1":
				System.out.println("One");
				break;
			case "2":
				System.out.println("Two");
				break;

			default:
				System.out.println("Default");
				break;
			}
			
//			----------------------------------------------------
			
//			switch (choice) 
//			{
//			case "1":
//				System.out.println("\n***** Exercise 01 *****\n");
//				getAndDisplayInfo();
//				break;
//	
//			default:
//				System.out.println("\n***** Exercise 02 *****\n");
//				calcAmount();
//				break;
//			}			
		}
		
//		Close the scanner
		in.close();		
		System.out.println("Done!");
		

	}
	
	/* Exercise 01 */
	/* Method: getAndDisplayInfo - Get information from user's input and display it to the console. */
	public static void getAndDisplayInfo()
	{
//		Declares some variables
		String fullName;
		String gender;
		String phoneNumber;
		String address;
		float mark;
		Scanner in = new Scanner(System.in);
		
//		Validate fullname: 
		while (true) {
			System.out.print("Your fullname ? ");
			fullName = in.nextLine();
		
//			Check whether input is an empty string or not
			if (fullName.equals("")) 
			{
				System.out.println("*** Warning: Your name should not be empty. Try again !");
				continue;
			}
			break;
		}
		
//		Validate gender:
//		Input is only "m" or "f"
		while (true) 
		{
			System.out.print("Your gender (m or f) ? ");
			gender = in.nextLine();
			if (!gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("f")) {
				System.out.println("*** Warning: Your gender should be \"m\" or \"f\". Try again !");
				continue;
			}
			break;
		}
		
//		Validate phone number: 
//		Check whether input is an empty string or not
		while (true) {
			System.out.print("Your phone number ? ");
			phoneNumber = in.nextLine();
			
			if (phoneNumber.equals("")) 
			{
				System.out.println("*** Warning: Your phone number should not be empty. Try again !");
				continue;
			}
			break;
		}
		
//		Validate address: 
//		Check whether input is an empty string or not
		while (true) {
			System.out.print("Your address ? ");
			address = in.nextLine();
			if (address.equals("")) 
			{
				System.out.println("*** Warning: Your address should not be empty. Try again !");
				continue;
			}
			break;
		}
		
//		Validate mark:
		while (true) 
		{
			in = new Scanner(System.in);
			System.out.print("Your mark ? (between 0 and 10) ");
			
//			Check whether the input is a float or not 
			if (!in.hasNextFloat()) 
			{
				System.out.println("*** Warning: Invalid mark. Try again !");
				continue;
			}
			
			mark = in.nextFloat();
//			Check whether the mark is between 0 and 10 or not
			if (mark < 0 || mark > 10)  
			{
				System.out.println("Invalid mark. Try again !");
				continue;
			}
			break;
		}
		
//		Close the scanner
		in.close();
		
//		Return the information 
		StringBuilder builder = new StringBuilder();
		builder.append("\n-------- Information --------\n");
		builder.append("Full Name: ");
		builder.append(fullName);
		builder.append("\nGender: ");
		builder.append(gender);
		builder.append("\nPhone Number: ");
		builder.append(phoneNumber);
		builder.append("\nAddress: ");
		builder.append(address);
		builder.append("\nMark: ");
		
//		Format the mark: The floating point number up to 1 decimal places.
		DecimalFormat df = new DecimalFormat("#.#"); 
		builder.append(df.format(mark));
		
		System.out.println(builder.toString());
	}
	
//	-------------------------------- End of getAndDisplayInfo method --------------------------------
	
	/* Exercise 02 */
	/* Method: calcAmount method - Calculate the amount after a number of months and diplay it to console */
//	public static double calcAmount(double interestRate, double amount, int month)
	public static void calcAmount()
	{
//		Declare and initial a constant
		final double INTEREST_RATE = 0.1;		
		
//		Declare some variables
		double amount;
		int month;
		Scanner in;
		
//		Validate amount
		while (true) {
			in = new Scanner(System.in);
			System.out.print("How much money will you charge at the beginning (amount)? ");
			
//			Check whether the input is a double or not
			if (!in.hasNextDouble()) {
				System.out.println("*** Warning: Invalid amount. Try again!");
				continue;
			}
			
//			Get amount from user's input
			amount = in.nextDouble();
			
//			Check whether amount is greater than zero.
			if (amount <= 0) {
				System.out.println("*** Warning: Amount must be greater than zero. Try again!");
				continue;
			}
			
			break;
		}
		
//		Validate amount
		while (true) {
			in = new Scanner(System.in);
			System.out.print("How long will you withdraw (month) ? ");
			
//			Check whether the input is a integer or not
			if (!in.hasNextInt()) {
				System.out.println("*** Warning: Invalid month. Try again!");
				continue;
			}
			
//			Get month from user's input
			month = in.nextInt();
			
//			Check whether month is greater than zero.
			if (month <= 0) {
				System.out.println("*** Warning: Month must be greater than zero. Try again!");
				continue;
			}
			
			break;
		}
		
//		Close the scanner
		in.close();
		
//		Calculate the amount after a number of months adn display it to the console
		for (int i = 0; i < month; i++) 
		{
		double interest = amount * INTEREST_RATE;
		amount += interest;
		}
		System.out.printf("\n--------- Result---------\nAfter %d months, your amount will be $%,.2f.", month, amount);
	}
	
//	-------------------------------------------- End of calcAmount method --------------------------------------------

}





























