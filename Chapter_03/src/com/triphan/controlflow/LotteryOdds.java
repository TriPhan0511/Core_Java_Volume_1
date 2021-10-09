/**
 * 
 */
package com.triphan.controlflow;

import java.util.Scanner;

/**
 * This program demonstrated the for loop
 * version 1.00 2021-10-09
 * @author OS
 *
 */
public class LotteryOdds {

	public static void main(String[] args) {
//		Calls the calcOdds method
		System.out.printf("Your odds are in 1 in %,d lotterryOdds. Good luck!", calcOdds());
		
	}
	
	/* Method: Calculate the lottery odds */
	public static int calcOdds() {
//		Read inputs
		Scanner in = new Scanner(System.in);
		System.out.print("How many numbers do you need to draw? ");
		int k = in.nextInt();
		System.out.print("What is the highest number you can draw? ");
		int n = in.nextInt();
		
//		Close the scanner
		in.close();

		/*
		 * Compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1) / (1*2*3*...*k)
		 * */
		int lottertyOdds = 1;
		for (int i = 1; i <= k; i++) {
			lottertyOdds = lottertyOdds * (n - i + 1) / i;
		}
		
		return lottertyOdds;
	}
}





























