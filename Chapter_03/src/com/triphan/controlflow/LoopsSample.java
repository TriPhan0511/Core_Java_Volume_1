package com.triphan.controlflow;

import java.util.Scanner;

public class LoopsSample {

	public static void main(String[] args) {

		/* 1. The while loop*/
//		
//		double goal = 1000000.00;
//		double balance = 0;
//		double payment = 100.00;
//		int interestRate = 80;
//		int years = 0;
//		
//		while (balance < goal) {
//			balance += payment;
//			double interest = balance * interestRate / 100;
//			balance += interest;
//			years++;
//		}
//		
//		System.out.printf("You will need %d years to earn enough money for retirement."
//				+ "\nAnd your balance at that time is %,.2f", years, balance);
		
//		----------------------------------------------------------------------------------------------
		
		/* The do...while loop */
		
////		Example 1:
////		Enter a name, and the program will say hello.
////		If user enter "e", the program will continue, otherwise the program will be terminated.
//		String answer;
//		try (Scanner in = new Scanner(System.in);){
//			
//			do {
//				System.out.print("Enter your name (enter \"e\" to escape the program): ");
//				answer = in.nextLine();
//				if (!answer.equalsIgnoreCase("e")) {
//					System.out.printf("Hello, %s!\n", answer);
//				}
//			} while (!answer.equalsIgnoreCase("e"));
//		}
//		System.out.println("End of the program.");
//		
//		------------------------------------------------------------------------------------------------
		
//		Example 2:
//		If user type "n" then the program will be continue, otherwise it will be terminated.
		
		try (Scanner in = new Scanner(System.in)){
			String answer = "";
			double balance = 0;
			double payment = 100.00;
			int interestRate = 80;
			double interest;
			int years = 0;
			do {
				balance += payment;
				interest = balance * interestRate / 100;
				balance += interest;
				years++;
				
				System.out.printf("After %s years, your balance is $%,.2f", years, balance);
				System.out.print("\nReady to retire? (Y/N) ");
				answer = in.nextLine();
			} while (answer.equalsIgnoreCase("n"));
		}
		
		System.out.println("End of program");
		
		
		
	}

}






























