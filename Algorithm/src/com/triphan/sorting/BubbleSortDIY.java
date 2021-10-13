package com.triphan.sorting;

public class BubbleSortDIY {

	/**
	 * This program implements the bubble sort algorithm.
	 * 2021-10-13
	 * @author Tri Phan
	 *
	 */
	public static void main(String[] args) 
	{
//		Create an array of intergers and display it. 
		var numbers = new int[] { 5, 3, 4, 1, 2, 6 };
		System.out.println("Initial numbers:");
		displayNumbers(numbers);
		
////		Sort the array and display the sorted array.
//		bubbleSort(numbers);
//		System.out.println("\nAfter sorting:");
//		displayNumbers(numbers);
//		
//		Calls the bubbleSort2 to sort the array and display the processing of sorting
		bubbleSort2(numbers);
	}
	
//	--------------------------------------------------------------------------------------
	
	/*
	 * Method: bubbleSort
	 * 		Implements the bubble sort algorithm.
	 * */
	
	public static void bubbleSort(int[] numbers)
	{
//		Get the size of the array
		int size = numbers.length;
		
		for (int i = 0; i < size - 1; i++) 
		{
			for (int j = 0; j < size - 1 - i; j++) 
			{
				if (numbers[j] > numbers[j + 1]) 
				{
					int temp;
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
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

	/*
	 * Method: bubleSort2
	 * 		Sort an array and display the processing of sorting.
	 * */
	
	public static void bubbleSort2(int[] numbers)
	{
//		Get the size of the array
		int size = numbers.length;
		
//		Declare and initialize a variable named step
		int step = 1;
		
		for (int i = 0; i < size - 1; i++) 
		{
			for (int j = 0; j < size - 1 - i; j++) 
			{
				if (numbers[j] > numbers[j + 1]) 
				{
					int temp;
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
			
			System.out.printf("\nStep %d:\n", step);
			displayNumbers(numbers);
			step++;
		}
	}
	
}


























