package com.triphan.bignumbers;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * This program demonstrated the java.math.BigInteger class.
 * version 1.00 2021-10-09
 * @author Tri Phan
 *
 */
public class BigIntegerTest {

	public static void main(String[] args) {
//		Calls the calcLotteryOdds method
		System.out.printf("\nYour odds are in 1 in " + calcLotteryOdds() + " lotteryOdds. Good luck!");
		
	}
	
	/* Method: Calculate the lottery odds */
	
	public static BigInteger calcLotteryOdds() {
////		Read inputs
//		Scanner in = new Scanner(System.in);
//		System.out.print("How many numbers do you need to draw? ");
//		int k = in.nextInt();
//		System.out.print("What is the highest number you can draw? ");
//		int n = in.nextInt();
//		
////		Close the scanner
//		in.close();
		
//		Dummy data
		int k = 60;
		int n = 490;

//		Compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1) / (1*2*3*...*k)
		BigInteger lottertyOdds = BigInteger.valueOf(1);
		for (int i = 1; i <= k; i++) {
			lottertyOdds = lottertyOdds.multiply(BigInteger.valueOf(n - i +1)).divide(BigInteger.valueOf(i));
		}
		
		return lottertyOdds;
	}

}































