package com.triphan.sorting;

import java.util.Arrays;

/**
 * This program demonstrates the bubble sort algorithm.
 * 2021-10-11
 * Link: https://www.youtube.com/watch?v=RS_UaHn6-8E&list=PLwvrYc43l1MxWkLv4PbkFso0pbKvaML_L
 * Link 2: https://www.geeksforgeeks.org/bubble-sort/
 * 
 * @version 1.00
 * @author TriPhan
 * 
 * 
 * */
public class BubbleSort {

	public static void main(String[] args) {
		int[] numbers =  { 6, 4, 5, 3, 2, 1 };
		System.out.printf("Initial:\n%s", Arrays.toString(numbers));
		
//		Sorts the array: Calls the sort method
		sort(numbers); // Use the while loop
		
		System.out.printf("\nAfter:\n%s", Arrays.toString(numbers));
	}
	
//--------------------------------------------------------------------------------------------
	
	/* Method: sort */
	
	public static void sort(int[] numbers) {
		int size = numbers.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 -i; j++) {
				if (numbers[j] > numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
	}
}




























