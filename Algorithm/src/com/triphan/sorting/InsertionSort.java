/**
 * 
 */
package com.triphan.sorting;

/**
 * This program demonstrate the insertion sort algorithm.
 * 2021-10-13
 * @author Tri Phan
 *
 */
public class InsertionSort 
{
	public static void main(String[] args) 
	{
//		Creates an unsorted array of integers
		var numbers = new int[] { 5, 8, 1, 3, 9, 6 };
		
//		Display the unsorted array
		System.out.println("Unsorted array:");
		displayNumbers(numbers);
		
//		Calls the selectionSort method to sort the numbers array
		insertionSort(numbers);
//		insertionSort2(numbers);
		
//		Display the sorted array
		System.out.println("\nAfter sorting:");
		displayNumbers(numbers);
	}
	
//	-----------------------------------------------------------------------------------------------
	
	/* Method: insertionSort - Implement the insertion sort algorithm */
//	Link: https://www.youtube.com/watch?v=lCDZ0IprFw4&list=PLj8W7XIvO93qVnnXxyeWmCSvMFqRBP4Jw
	public static void insertionSort(int numbers[])
	{
		int i, j, key, temp;
		for (i = 1; i < numbers.length; i++) {
			key = numbers[i];
			j = i - 1;
			while (j >= 0 && key < numbers[j]) {
				temp = numbers[j];
				numbers[j] = numbers[j + 1];
				numbers[j + 1] = temp;
				j--;
			}
		}
	}
	
	/* Method: insertionSort2 - Implement the insertion sort algorithm */
	public static void insertionSort2(int numbers[])
	{
		for (int i = 1; i < numbers.length; i++) 
		{
			boolean sorted = false;
			int j = i;
			int k = numbers[j];
			while (!sorted && j > 0) 
			{
				if (k >= numbers[j - 1]) {
					sorted = true;
				} else {
					numbers[j] = numbers[j - 1];
					numbers[j - 1] = k;
					j--;
				}
			}
		}
	}
	
	/* Method: displayNumbers - Display the content of an array of integers */
	public static void displayNumbers(int numbers[])
	{
		for (int value : numbers) {
			System.out.printf("%d ", value);
		}
	}

}





























