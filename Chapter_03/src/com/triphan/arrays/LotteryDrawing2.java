package com.triphan.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a method to do lottery drawing.
 * 2021-10-11
 * @author Tri Phan
 *
 */
public class LotteryDrawing2 {

	public static void main(String[] args) {
		
//		Declare quantity and highestNumber variable
		int quantity;
		int highestNumber;
		
//		Get input
		try (Scanner in = new Scanner(System.in)) {
//			Check for ensuring quantity is less than or equal to the highest number.
			while (true) {
				System.out.print("Quantity ? ");
				quantity = in.nextInt();
				System.out.print("Highest number ? ");
				highestNumber = in.nextInt();
				
				if (quantity <= highestNumber) {
					break;
				} else {
					System.out.println("Quantity must less than or equal to highest number. Try again!");
				}
			}
		}
		
//		Calls the drawNumbers method
		System.out.println("Bet the following combination. It'll make you rich!");
		for (int num : drawNumbers(quantity, highestNumber)) {
			System.out.println(num);
		}
	}
	
//	----------------------------------------------------------------------------------------------------------
	
	/*
	 * Method: drawNumbers(int k, int n)
	 * Draw k numbers from 1 to the highest number n, and all numbers in k numbers are distinct.
	 * 
	 * Note: When calling this method, you must to ensure that k is less than or equal to n. 
	 * 
	 * */
	
	public static int[] drawNumbers(int k, int n) {
		
//		Declare an array to contain numbers from 1 to n.
		var numbers = new int[n];
		
//		Insert numbers from 1 to n to the numbers array.
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		
//		Declare an array to contain k numbers which drawn from the numbers.
		var result = new int[k];

//		Draw number from the numbers and insert it into the result.
		for (int i = 0; i < result.length; i++) {
//			Create a random number from 0 to n - 1.
			var rand = (int) (Math.random() * n);
			
//			Set the value of result's ith element is the value of numbers' value at the rand location.
//			Then overwrite the element at the rand location by the last element, and decrease n by 1.
//			So we never get a specific number twice.
			result[i] = numbers[rand];
			numbers[rand] = numbers[n - 1];
			n--;
		}
		
//		Sort the result array and return it.
		Arrays.sort(result);
		return result;
	}

}




































