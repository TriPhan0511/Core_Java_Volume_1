/**
 * 
 */
package com.triphan.controlflow;

import java.util.Scanner;

/**
 * This program demonstrates a do while loop
 * @version 1.00 2021-10-08
 * @author Tri Phan
 *
 */
public class DoWhileLoopSample {

	public static void main(String[] args) {
//		Read inputs
		Scanner in = new Scanner(System.in);
		System.out.print("How much money will you contribute every year? ");
		double payment = in.nextDouble();
		System.out.print("Interest rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		String input;
		
//		Update the account balance while user isn't ready to retire
		do {
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			years++;
			
//			Print current balance
			System.out.printf("After %d years, your balance is %,.2f", years, balance);
			
//			Ask if ready to retire and get input
			System.out.print("\nReady to retire ? (Y/N) ");
			input = in.next();
		} while (input.equalsIgnoreCase("n"));
		
//		Close the scanner
		in.close();
		
		System.out.println("End of the program.");
	}
	

}




























