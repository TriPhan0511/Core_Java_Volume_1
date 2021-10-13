/**
 * 
 */
package com.triphan.arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 2021-10-13
 * @author Tri Phan
 *
 */
public class LotteryDrawingDIY 
{
	public static void main(String[] args) 
	{
////		Dummy data
////		Create two variables n and k
//		int n = 49;
//		int k = 6;
		
//		Get n and k from the user's inputs.
		int n;
		int k;
		try (Scanner in = new Scanner(System.in)) 
		{
			System.out.print("Highest number ? ");
			n = in.nextInt();
			System.out.print("Quantity ? ");
			k = in.nextInt();
		}
		
//		Display the result
		System.out.println("Bet the following combination. It'll make you rich!");
		displayNumbers(drawNumbers(k, n));
	}
	
//	-------------------------------------------------------------------------------------
	
	/*
	 * Method: drawNumbers
	 * */
	public  static int[] drawNumbers(int k, int n)
	{
//		Create an array for containing the numbers from 1 to n
		var source = new int[n];
		for (int i = 0; i < source.length; i++) {
			source[i] = i + 1;
		}
		
//		Get a random number fron the source array. 
//		And put this number to the an array which will be returned.
		var numbers = new int[k];
		for (int i = 0; i < numbers.length; i++) {
//			Create a random from 0 to n - 1
			int rand = (int) (Math.random() * n);
			
//			Get a random element in the source array.
//			And set it as a element in the numbers array.
			numbers[i] = source[rand];
			
//			Overwrite the element in the source array at the location rand with the element at location (n - 1).
//			And decrease by 1.
			source[rand ] = source[n - 1];
			n--;
			
			
		}
		
//		Sort the numbers array and return it.
		Arrays.sort(numbers);
		return numbers;
		
	}
	
	/*
	 * Method: displayNumbers
	 * 		Display the content of an array of integers
	 * */
	public static void displayNumbers(int[] numbers)
	{
		for (int num : numbers) {
			System.out.printf("%d ", num);
		}
	}
	

}



































