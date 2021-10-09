package com.triphan.controlflow;

import java.util.Scanner;

/**
 * This program demonstrates the continue statement.
 * @version 1.00 2021-10-09
 * @author Tri Phan
 *
 */
public class ContinueStatementSample {

	public static void main(String[] args) {
		
		/* The continue statement transfer control to the header of the innermost enclosing loop. */

////		Example 1: Using the continue statement in a while loop
//		
//		int goal = 100;
//		int sum = 0;
//		int n;
//		Scanner in = new Scanner(System.in);
//		
//		while (sum < goal) {
//			System.out.print("Enter a number: ");
//			n = in.nextInt();
//			if (n < 0) {
//				continue;
//			}
//			sum += n; // not executed if n < 0
//		}
//		
////		Close the scanner
//		in.close();
//		
//		System.out.printf("Sum = %d", sum);
		
//		---------------------------------------------------------------------------------------------------------
		
//		Example 2: Using the continue statement in a for loop
//		If the continue statement is used in a for loop, it jumps to the "update" part 
//		of the for loop.
		
//		Display: 0 1 2 3 4 6 7 8 9
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.printf("%d ", i);
		}
		
//		-> If n == 5, then the continue statement to the i++ statement. 
	}

}







































