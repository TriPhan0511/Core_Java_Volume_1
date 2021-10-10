package com.triphan.arrays;

import java.util.Arrays;

/**
 * This program demonstrates array sorting
 * 2021-10-09
 * @author Tri Phan
 *
 */
public class ArraySortingSample {

	public static void main(String[] args) {

		var numbers = new int[] { 10, 5, 6, 3, 9, 4, 5, 7 };
		System.out.printf("%s", Arrays.toString(numbers));
		
		Arrays.sort(numbers);
		System.out.printf("\nAfter sorting:\n%s", Arrays.toString(numbers));
		
	}

}
