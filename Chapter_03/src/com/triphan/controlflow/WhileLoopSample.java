package com.triphan.controlflow;

import java.util.Scanner;

/**
 * This program demonstrate a while loop
 * @version 1.00 2021-10-08
 * @author Tri Phan
 *
 */

public class WhileLoopSample {

	public static void main(String[] args) {
//		Read inputs
		Scanner in = new Scanner(System.in);
		System.out.print("How much money do you need to retire? ");
		double goal = in.nextDouble();
		System.out.print("How much money will you contribute every year? ");
		double payment = in.nextDouble();
		System.out.print("Interest rate in %: ");
		double interestRate = in.nextDouble();
		
//		Close the scanner
		in.close();
		
//		Declare and initialize balance and years variables
		double balance = 0;
		int years = 0;
		
//		Update account balance while goal isn't reached
		while (balance < goal) {
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			years++;
		}
		
//		Display the message
		System.out.printf("You can retire in %d years with the balance is %,.2f", years, balance);
	}

}





















