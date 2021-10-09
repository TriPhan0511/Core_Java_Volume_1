/**
 * 
 */
package com.triphan.controlflow;

/**
 * This program demonstrates the break statement.
 * @version 1.00 2021-10-09
 * @author Tri Phan
 *
 */
public class BreakStatementSample {

	public static void main(String[] args) {

		/* The break statement can be used to break out of a loop.*/
		
////		Example 1:
//		
//		int count = 10;
//		while (count > 0) {
//			System.out.printf("%d ", count);
//			if (count == 5) {
//				break;
//			}
//			count--;
//		}
		
//		-----------------------------------------------------------------------------------------------------
		
//		Example 2:
		
		double goal = 1000000;
		double balance = 0;
		double payment = 100;
		double interest = 0;
		double interestRate = 80;
		int years = 0;
		
		while (years < 100) {
			balance += payment;
			interest = balance * interestRate / 100;
			balance += interest;
			
			if (balance >= goal) {
				break;
			}
			
			years++;
		}
		
		System.out.printf("After %d year, you can retire. And your balance is %,.2f", years, balance);
	}

}


























