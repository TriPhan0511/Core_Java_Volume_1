/**
 * 
 */
package com.triphan.sorting;


/**
 * This program implements the selection sort algorithm.
 * 2021-10-13
 * @author Tri Phan
 *
 */
public class SelectionSortDIY 
{
	public static void main(String[] args) 
	{
//		Create an array of intergers and display it. 
		var numbers = new int[] { 5, 3, 4, 1, 2, 6 };
		System.out.println("Initial numbers:");
		displayNumbers(numbers);
		 
//		 Sort that array and display the sorted array.
		selectionSort(numbers); 
		System.out.println("\nAfter sorting:");
		displayNumbers(numbers);
		
//	-----------------------------------------------------

////		Calls the selectionSort2 to sort and display the processing
//		selectionSort2(numbers);
		 
	}
		
	
//	-----------------------------------------------------------------------------------------------------
	
	/*
	 * Method: selectionSort
	 * 		Implements the selection sort algirithm.
	 * */
	
	public static void selectionSort(int[] numbers)
	{
//		Get the size of the numbers array.
		int size = numbers.length;
		
		for (int i = 0; i < size - 1; i++) 
		{
			int min_idx = i;
			for (int j = i; j < size; j++) 
			{
				if (numbers[min_idx] > numbers[j]) 
				{
					min_idx = j;
				}
			}
			if (min_idx != i) 
			{
				int temp = numbers[i];
				numbers[i] = numbers[min_idx];
				numbers[min_idx] = temp;
			}
		}
	}

	/*
	 * Method: displayNumbers 
	 * 		display an array of integers.
	 * */
	
	public static void displayNumbers(int[] numbers)
	{
		for (int num : numbers) {
			System.out.printf("%d ", num);
		}
	}

	/*
	 * Method: selectionSort2
	 * 		Sort an array of integers and display the processing of sorting
	 * */
	
	public static void selectionSort2(int[] numbers)
	{
//		Get the size of the numbers array.
		int size = numbers.length;
		
//		Declare a variable named step
		int step = 1;
		
//		Sort
		for (int i = 0; i < size - 1; i++) 
		{
			int min_idx = i;
			for (int j = i; j < size; j++) 
			{
				if (numbers[min_idx] > numbers[j]) 
				{
					min_idx = j;
				}
			}
			if (min_idx != i) 
			{
				int temp = numbers[i];
				numbers[i] = numbers[min_idx];
				numbers[min_idx] = temp;
			}
			
			System.out.printf("\nStep %d:\n", step);
			displayNumbers(numbers);
			step++;
		}
	}
}







































