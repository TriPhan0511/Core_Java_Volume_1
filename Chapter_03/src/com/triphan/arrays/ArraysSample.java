/**
 * 
 */
package com.triphan.arrays;

import java.util.Arrays;


/**
 * This program demonstrates the arrays
 * 2021-10-09
 * @author Tri Phan
 *
 */
public class ArraysSample {

	public static void main(String[] args) {
		
		/* 1. Declaring Arrays */

		/* Declares an array of integers */
		
//		int[] arr;
		
		/* Create an array of integers */
		
//		int[] arr = new int[100]; 
//		
////		or
		
//		var arr = new int[100]; 
		
		/* This statement declares and initializes an array of 100 integers. */
		
		/* The array length need not be a constant: new int[n] creates an array of length n.*/
		
		/* 
		 * Once you create an array, you cannot change its length (although you can, of course,
		 * change an individual element). If you frequently need to expand the length of arrays
		 * while your program is running, you should use array lists, which is covered in Chapter 5. 
		 *  
		 * */
		
		/* Java has a shortcut for creating an array object and supplying initial values: */
		
//		int[] arr = {2, 3, 5, 8, 10, 11};
		
		/* Note that you do not use the new keyword with this syntax, and you don't specify the length. */
		
		/* 
		 * A comma after the last value is allowed, which can be convenient for an array to which 
		 * you keep adding values over time:
		 * 
		 **/
		
//		String[] authors = {
//				"James Gosling",
//				"Bill Joy",
//				"Guy Steele",
////				add more names here and put a comma after each name
//				
//		};
		
		/* You can declare an anonymous array: */
		
//		new int[] {17, 18, 23, 29, 31, 37};
		
		/*
		 * This expression allocates a new array and fills it with the values inside the braces.
		 * It counts the number of initial values and sets the array size accordingly.
		 * 
		 * You can use this syntax to reinitialize an array without creating a new variable.
		 * For example,
		 * 
		 * */
		
//		int[] smallPrimes = {1, 2, 3, 4, 5, 6};
//		smallPrimes = new int[] {17, 19, 23, 29, 31, 37};
//		
		/* is shorthand for: */
		
//		int[] smallPrimes = {1, 2, 3, 4, 5, 6};
//		int[] anonymous = {17, 19, 23, 31, 37};
//		smallPrimes = anonymous;
		
		/*
		 * NOTE:
		 * It is legal to have arrays of length 0. Such an array can be useful if you write a method
		 * that computes an array result and the result happens to be empty. Construct an array of 
		 * length 0 as:
		 * 
		 *  	new elementType[0]
		 *  
		 *  or:
		 *  
		 *  	new elementType[] {}
		 *  
		 *  Note that an array of length 0 is not the same as null.
		 * 
		 * */
		
//		-------------------------------------------------------------------------------------------------------
		
		/* 2. Accessing Array Elements */
		
//		int[] numbers = new int[] {1, 5, 3, 5, 8};
		
//		System.out.printf("First element: %d", numbers[0]);
//		System.out.printf("\nLast element: %d", numbers[numbers.length - 1]);
//		System.out.printf("\nLast element: %d", numbers[numbers.length - 1]);
		
//		String[] names = new String[] {
//				"Alex Ferguson",
//				"Jenifer Lopez",
//				"Brad Pitt",
//				"Harry Kewell"
//		};
		
//		System.out.printf("The first person is %s", names[0]);
//		System.out.printf("\nThe last person is %s", names[names.length - 1]);
//		System.out.printf("\nThe third person is %s", names[2]);
		
//		Use a for loop to iterate the array:
		
//		for (int i = 0; i < names.length; i++) {
//			String person = names[i];
//			String order = "next";
//			switch (i) {
//				case 0:
//					order = "first";
//					break;
//				case 1:
//					order = "second";
//					break;
//				case 2:
//					order = "third";
//					break;
//
//				default:
//					order = "next";
//					break;
//			}
//			
//			System.out.printf("The %s person is %s\n", order, person);
//		}
		
//		-------------------------------------------------------------------------------------------------------
		
		/*
		 * The array elements are numbered from 0 to 9 (and not 1 to 10). Once the array is created,
		 * you can fill the elements in an array, for example, by using a loop:
		 * 
		 * */
		
//		int[] numbers = new int[10];
//		for (int i = 0; i < 10; i++) {
//			numbers[i] = i; // fills the array with numbers 0 to 9.
//		}
//		
//		
////		Displays the content of the array
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.printf("%d ", numbers[i]);
//		}
		
		/*
		 * When you create an array of numbers, all elements are initialized with zero.
		 * Arrays of boolean are initialized with false.
		 * Arrays of objects are initialized with the special value null, which indicates
		 * that they do not (yet) hold any objects. For example,
		 * 
		 * */
		
//		String[] names = new String[10];
		
		/*
		 * creates an array of ten strings, all of which are null. If you want the array to
		 * hold empty strings, you must supply them:
		 * 
		 * */
		
//		for (int i = 0; i < names.length; i++) {
//			names[i] = "";
//		}

		/*
		 * CAUTION:
		 * If you construct an array with 100 elements and then try to access 
		 * the element arr[100] (or any other index outside the range from 0 to 99),
		 * an "array index out of bounds" exception will be occur.
		 * 
		 * */
		
		/* To find the number of elements of an array named arr, use: arr.length. For example, */
		
//		int[] numbers = new int[] {34,21, 67,34};
//		System.out.printf("The length of numbers array: %d", numbers.length); // 4
		
//		--------------------------------------------------------------------------------------------------------------
		
		/* 3. The "for each" Loop */
		
////		Example
//		var numbers = new int[] { 2, 5, 1, 67, 32 };
		
//		for (int num : numbers) {
//			System.out.printf("%d ", num);
//		}

////		Example
//		var singers = new String[] {
//				"Kelly",
//				"Elvis Presley",
//				"MLTR"
//		};
//		
//		for (String singer : singers) {
//			System.out.printf("%s\n", singer);
//		}
		
		/* Tip: Using Arrays.toString(arr) method to return a string containing the array elements */
		
////		Example
//		var numbers = new int[] { 3, 5, 1, 4, 7 };
//		System.out.printf("%s", Arrays.toString(numbers));
////		-> [3, 5, 1, 4, 7]
		
//		--------------------------------------------------------------------------------------------------------------
		
		/* 4. Array Copying */
		
		/* You can copy one array variable into another, but then both variables refer to the same array. */
		
////		Example
//		var numbers1 = new int[] { 1, 3, 5, 7, 9 };
//		var numbers2 = numbers1;
//		
//		System.out.println(Arrays.toString(numbers1));
////		-> [1, 3, 5, 7, 9]
//		System.out.println(Arrays.toString(numbers2));
////		-> [1, 3, 5, 7, 9]
//		
////		Side effect ?
////		Change the value of the first element in numbers1 array
//		numbers1[0] = 1000;
//		System.out.println(Arrays.toString(numbers1));
////		-> [1000, 3, 5, 7, 9]
//
////		The first element in numbers2 element also changed. 
////		This is because both numbers1 and numbers2 variables refer to the same array.
//		System.out.println(Arrays.toString(numbers2));
////		-> [1000, 3, 5, 7, 9]
		
//		-----------------------------------------------------------------------------------
		
		/* If you actually qant to copy all values of one array into a new array, use the Arrays.copyOf method */
		
//		Example
		var numbers1 = new int[] { 1, 2, 3, 4, 5 };
		var numbers2 = Arrays.copyOf(numbers1, numbers1.length);
		
//		System.out.printf("Content of numbers1: %s", Arrays.toString(numbers1));
////		-> Content of numbers: [1, 2, 3, 4, 5]
		
//		System.out.printf("\nContent of numbers2: %s", Arrays.toString(numbers2));
////		-> Content of numbers: [1, 2, 3, 4, 5]
//		
////		Change the value of the first element in numbers1
//		numbers1[0] = 10000;
//		System.out.printf("\nContent of numbers1: %s", Arrays.toString(numbers1));
//		
////		But the first element in the numbers2 is not changed.
//		System.out.println(numbers2[0]);
////		-> 1
		
		/* 
		 * The second parameter of Arrays.copyOf method is the length of the new array.
		 * 
		 * A common use of this method is to increase the size of an array.
		 * The additional elements are filled with 0 if the array contains number,
		 * false if the array contains boolean values. 
		 * 
		 * Conversely, if the length is less than the length of the original array,
		 * only the initial values are copied.
		 *  
		 * */
		
////		Example
//		var numbers3 = Arrays.copyOf(numbers1, 2 * numbers1.length);
//		System.out.printf("\nContent of the numbers3: %s", Arrays.toString(numbers3));
////		-> Content of the numbers3: [10000, 2, 3, 4, 5, 0, 0, 0, 0, 0]
		
////		Example
//		var numbers4 = Arrays.copyOf(numbers1, numbers1.length - 2);
//		
//		System.out.printf("Content of the numbers1: %s", Arrays.toString(numbers1));
//		System.out.printf("\nContent of the numbers4: %s", Arrays.toString(numbers4));
		
		/* Arrays.copyOfRange */
		
//		Example
		var numbers5 = Arrays.copyOfRange(numbers1, 1, numbers1.length);
		System.out.printf("Content of the numbers1: %s", Arrays.toString(numbers1));
//		-> Content of the numbers1: [1, 2, 3, 4, 5]
		
		System.out.printf("\nContent of the numbers: %s", Arrays.toString(numbers5));
//		-> Content of the numbers: [2, 3, 4, 5]
		
	}

}
































