package com.triphan.controlflow;

import java.util.Scanner;

public class LoopsSample {

	public static void main(String[] args) {

		/* The while loop*/
		
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
		
//		Example 1:
		String answer;
		try (Scanner in = new Scanner(System.in);){
			
			do {
				System.out.print("Enter your name (enter \"e\" to escape the program): ");
				answer = in.nextLine();
				if (!answer.equalsIgnoreCase("e")) {
					System.out.printf("Hello, %s!\n", answer);
				}
			} while (!answer.equalsIgnoreCase("e"));
		}
		System.out.println("End of the program.");
		
		
		
		
	}

}






























