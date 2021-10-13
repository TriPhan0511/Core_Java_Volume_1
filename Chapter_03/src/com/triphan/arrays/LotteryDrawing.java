package com.triphan.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2021-10-09
 * @author Tri Phan
 *
 */
public class LotteryDrawing {

	public static void main(String[] args) {

		/*
		 * This program draws a random combination of numbers for a lottery game. For example,
		 * if you play a "choose numbers from 49", the program might print this:
		 * 
		 * 		Bet the following combination. It'll make you rich!
		 * 			4
		 * 			7
		 * 			8
		 * 			19	
		 * 			30
		 * 			40
		 * 
		 * */

		/*
		 * To select such a random set of numbers, we first fill an array numbers
		 * with the value 1, 2, ..., n
		 * 
		 * 		var n = 49;
		 * 		var numbers = new int[n];
		 * 
		 * 		for (int i = 0; i < numbers.length; i++) {
		 * 			numbers[i] = i + 1;
		 * 		}
		 * 
		 * A second array holds the number to be drawn:
		 * 
		 * 		var k = 6;
		 * 		var result = new int[k];
		 * 
		 * 
		 * Now we draw k numbers.
		 * 
		 * The Math.radom method returns a random floating-point number that is 
		 * between 0 (inclusive) and 1 (exclusive). By mutiplying the result with n,
		 * we obtain a random number between 0 and n - 1.
		 * 
		 * 		var r = (int) (Math.random() * n);
		 * 
		 *  We set the ith result to be the number at that index. Initialy, that is just r + 1,
		 *  but as you'll see presently, the contents of the numbers array are changed after 
		 *  each draw.
		 *  
		 *  	result[i] = numbers[r];
		 *  
		 *  Now we must be sure never to draw that number again - all lottery numbers must 
		 *  be distinct. Therefore, we overwrite numbers[r] with the last number in the array
		 *  and reduce n by 1.
		 *  
		 *  	numbers[r] = numbers[numbers.length - 1];
		 *  	n--;
		 *  
		 *  The point is that in each draw we pick an index, bot the actual value. The index
		 *  points into an array that contains the values that have not yet been drawn.
		 *  
		 *  After drawing k lottery numbers, we sort the result array for a more pleasing outphut:
		 *  
		 *  	Arrays.sort(result);
		 *		for (int r : result) {
		 *			System.out.println(r);
		 *		}
		
		 *  	
		 * */
		
//		------------------------------------------------------------------------------------------------------
		
		/* Implementation the algorithm */
		
////		Reads inputs
//		Scanner in = new Scanner(System.in);
//		System.out.print("How many numbers do you need to draw? ");
//		int k = in.nextInt();
//		System.out.print("What is the highest number you can draw? ");
//		int n = in.nextInt();
//		
////		Closes the scanner
//		in.close();
		
//		--------------------------------------------------------------------
		
//		Instead using the Scanner object to get input from user, we can use the dummy data as follow:
		int k = 6;
		int n = 49;
		
//		Creates an array and fill it with the numbers from 1 to n
		var numbers = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		
//		Creates an array to contain the drawn numbers
		var result = new int[k];
		for (int i = 0; i < result.length; i++) {
//			Creates a random number between 0 to n - 1
			var r = (int) (Math.random() * n);
			
//			Picks the element at the random location in the numbers array, and
//			set the value of if to the value of the element ith in the result array.
			result[i] = numbers[r];
			
//			Moves the lat element into the random location
			numbers[r] = numbers[n - 1];
			n--;
		}
		
//		Sort the result array and print it
		Arrays.sort(result);
		System.out.println("Bet the following combination. It'll make you rich!");
		for (int r : result) {
			System.out.println(r);
		}
				
		
	}

}





























