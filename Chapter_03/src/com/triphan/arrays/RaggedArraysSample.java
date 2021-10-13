/**
 * 
 */
package com.triphan.arrays;

import java.util.Scanner;

/**
 * 2021-10-13
 * @author Tri Phan
 *
 */
public class RaggedArraysSample 
{
	public static void main(String[] args) 
	{
//		Create a two-dimensional array
		int rows = 2;
		int cols = 5;
		var numbers = new int[rows][cols];
		
//		Dummy data
		numbers = new int[][] {
				{ 1, 2, 3, 4, 5, },
				{ 6, 7, 8, 9, 10 },
		};
		
////		Calls the insertNumbers for inserting data to the numbers array
//		insertNumbers(numbers);		
		
//		Calls the displayNumbers for displaying the content in the numbers array
		System.out.println("The content in the array:");
		displayNumbers(numbers);
		
//		Swap two rows in the numbers array
		var temp =  numbers[0];
		numbers[0] = numbers[1];
		numbers[1] = temp;
		
//		Display the numbers array after swapping two rows
		System.out.println("\nAfter swapping");
		displayNumbers(numbers);
	}
	


//	--------------------------------------------------------------------------------------------
	
	/*
	 * Method: insertNumbers
	 * 		Insert data into a two-dimensional array of integer			
	 * */
	public static void insertNumbers(int numbers[][])
	{
		try (Scanner in = new Scanner(System.in)) {
			for (int i = 0; i < numbers.length; i++) {
				for (int j = 0; j < numbers[i].length; j++) {
					System.out.printf("Element at row: %d, column: %d ? ", i, j);
					numbers[i][j] = in.nextInt();
				}
			}
		}
		
	}
	
	/*
	 * Method: displayNumbers
	 * 		Display the content of a two-dimensional array of integers
	 * */
	public static void displayNumbers(int numbers[][])
	{
		for (int[] row : numbers) {
			for (int value : row) {
				System.out.printf("%d ", value);
			}
			System.out.println();
		}
	}
}



























