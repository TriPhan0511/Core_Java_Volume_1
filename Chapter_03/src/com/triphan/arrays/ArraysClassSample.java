package com.triphan.arrays;

import java.util.Arrays;


/**
 * This program demonstrates the java.util.Arrays
 * 2021-10-09
 * @author Tri Phan
 *
 */
public class ArraysClassSample {

	public static void main(String[] args) {

		/* static String toString(xxx[] a) */
		
////		Example
//		var numbers = new int[] {12, 3, 56, 34, 1};
//		System.out.printf("The content of the array: %s", Arrays.toString(numbers));
////		-> The content of the array: [12, 3, 56, 34, 1]
		
//		--------------------------------------------------------------------------------------------------
		
		/*
		 * static xxx[] copyOf(xxx[] a, int end)
		 * static xxx[] copyOfRange(xxx[] a, int start, int end)
		 * 
		 * returns an array of the same type as a, of length either en or end - start,
		 * filled with the values of a.
		 * If end is larger than a.length, the result is padded with 0 or false value.
		 * 
		 * */
		
////		Example
//		var numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, };
		
//		var numbers2 = Arrays.copyOf(numbers, numbers.length);
//		System.out.println(Arrays.toString(numbers2));
////		-> [1, 2, 3, 4, 5, 6, 7]
		
//		var numbers3 = Arrays.copyOf(numbers, numbers.length + 4);
//		System.out.println(Arrays.toString(numbers3));
////		-> [1, 2, 3, 4, 5, 6, 7, 0, 0, 0, 0]
		
//		var numbers4 = Arrays.copyOfRange(numbers, 2, 5);
//		System.out.println(Arrays.toString(numbers4));
////		-> [3, 4, 5]
		
//		--------------------------------------------------------------------------------------------------
		
		/*
		 * static sort(xxx[] a)
		 * 
		 * sorts the array, using a tuned QuickSort algorithm.
		 * 
		 * */
		
////		Example
//		var names = new String[] { "Alex", "Abel", "Cindy", "Henry", "Bob" };
//		System.out.println(Arrays.toString(names));
//		
//		Arrays.sort(names);
//		System.out.printf("\nAfter sort:\n %s", Arrays.toString(names));
		
//		--------------------------------------------------------------------------------------------------
		
		/*
		 * static int binarySearch(xxx[] a, xxx v)
		 * 
		 * static int binarySearch(xxx[] a, int start, int end, xxx v)
		 * 
		 *  Uses the binary search algorithm to search for the value v in the sorted array a.
		 *  If v is found, its index is returned. Otherwise, a negative value r is returned;
		 *  -r-1 is the spot at which v should be inserted to keep a sorted.
		 * 
		 * */
		
////		Example
//		var sortedNumbers = new int[] { 1, 3, 4, 7, 10, 34 };
//		
//		System.out.println(Arrays.binarySearch(sortedNumbers, 1));
////		-> 0
//		System.out.println(Arrays.binarySearch(sortedNumbers, 34));
////		-> 5
//		System.out.println(Arrays.binarySearch(sortedNumbers, 7));
////		-> 3
//		System.out.println(Arrays.binarySearch(sortedNumbers, 0));
////		-> -1
//		System.out.println(Arrays.binarySearch(sortedNumbers, 35));
////		-> -7
//		System.out.println(Arrays.binarySearch(sortedNumbers, 5));
////		-> -4
		
////		Example
//		var unsortedNumbers = new int[] { 100, 45, 23, 56, 12 };
//		
////		System.out.println(Arrays.binarySearch(unsortedNumbers, 100));
//////		-> -6 <- WRONG
//		
////		We should sort an array before using binarySearch on it.
//		Arrays.sort(unsortedNumbers);
//		System.out.printf("After sorting:\n%s", Arrays.toString(unsortedNumbers));
//		
//		System.out.println(Arrays.binarySearch(unsortedNumbers, 100));
////		-> 4
		
////		Example
//		var names = new String[] { "Alex", "Bell", "Cindy", "David", "Frank" };
//		
//		System.out.println(Arrays.binarySearch(names, "Frank"));
////		-> 4
//		System.out.println(Arrays.binarySearch(names, "Josh"));
////		-> -6
		
//		--------------------------------------------------------------------------------------------------
		
		/*
		 * static void fill(xxx[] a, xxx v)
		 * 
		 * Sets all elements of the array.
		 * 
		 * */
		
////		Example
//		var names = new String[5];
//		System.out.println(Arrays.toString(names));
////		-> [null, null, null, null, null]
//		
//		Arrays.fill(names, "No name");
//		System.out.println(Arrays.toString(names));
////		-> [No name, No name, No name, No name, No name]
		
////		Example
//		var numbers = new double[7]; 
//		Arrays.fill(numbers, 1.11);
//		System.out.println(Arrays.toString(numbers));
////		-> [1.11, 1.11, 1.11, 1.11, 1.11, 1.11, 1.11]
		
//		--------------------------------------------------------------------------------------------------
		
		/*
		 * static boolean equals(xxx[] a, xxx[] b)
		 * 
		 * Returns true if the arrays have the same length and if the elements at corresponding indexes match.
		 * 
		 * */
		
////		Examples
//		var numbers1 = new int[] { 5, 3, 1, 4, 6 };
//		var numbers2 = new int[] { 5, 3, 1, 4, 6 };
//		
//		if (Arrays.equals(numbers1, numbers2)) {
//			System.out.println("Equal.");
//		} else {
//			System.out.println("Not equal!");
//		}
////		-> Equal.
//		
//		
//		var numbers3 = new int[] { 1, 2, 3, 4, 5 };
//		var numbers4 = new int[] { 99, 2, 3, 4, 5 };
//		
//		if (Arrays.equals(numbers3, numbers4)) {
//			System.out.println("Equal.");
//		} else {
//			System.out.println("Not equal!");
//		}
////		-> Not equal!
		
//		var numbers5 = new int[] { 1, 2, 3, 4, 5 };
//		var numbers6 = new int[] { 1, 2, 3, 4, 5, 6 };
//		
//		if (Arrays.equals(numbers5, numbers6)) {
//			System.out.println("Equal.");
//		} else {
//			System.out.println("Not equal!");
//		}
////		-> Not equal!
	}

}


































