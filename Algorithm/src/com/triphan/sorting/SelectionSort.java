package com.triphan.sorting;

import java.util.Arrays;

/**
 * This program demonstrates the selection sort algorithm.
 * 2021-10-11
 * Link: https://www.youtube.com/watch?v=kZH0vWXs_Bk&list=PLwvrYc43l1MxWkLv4PbkFso0pbKvaML_L&index=2
 * Link 2: https://www.geeksforgeeks.org/selection-sort/?ref=leftbar-rightbar
 * 
 * @version 1.00
 * @author TriPhan
 * 
 * 
 * */
public class SelectionSort {

	public static void main(String[] args) {
		int[] numbers = { 4, 9, 3, 6, 2 };
//		int[] numbers = { 1, 9, 3, 6, 2 };
//		int[] numbers = { 4, 9, 3, 6, 1 };
		System.out.printf("Initial:\n%s", Arrays.toString(numbers));
		
//		Calls the sort method:
		sort(numbers);
		
		System.out.printf("\nAfter sorting:\n%s", Arrays.toString(numbers));
	}
	
//	-------------------------------------------------------------------------------------------------------
	
	/*
	 * Method: sort
	 * 
	 * Implement the selection sort algorithm.
	 * 
	 * */	
	
	public static void sort(int[] numbers) {
//		Get the length of the array.
		int size = numbers.length;
		
//		One by one move boundary of unsorted subarray.
		for (int i = 0; i < size - 1; i++) {
//			Find the index of the minimum element in unsorted array.
			int min_index = i;
			for (int j = i + 1; j < size; j++) {
				if (numbers[j] < numbers[min_index]) {
					min_index = j;
				}
			}
			
//			Swap two numbers if the ith number is not the minimum element. 
			if (min_index != i) {
				int temp =  numbers[i];
				numbers[i] = numbers[min_index];
				numbers[min_index] = temp;
			}
		}
			
	}

}




















