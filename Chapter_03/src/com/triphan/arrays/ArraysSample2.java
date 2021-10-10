package com.triphan.arrays;


/**
 * This program demonstrates the arrays
 * 2021-10-10
 * @author Tri Phan
 *
 */
public class ArraysSample2 {

	public static void main(String[] args) {
		
////		Creates an array of integers
//		int[] numbers = new int[10];
//		
////		Insert data into the numbers array
//		for (int i = 0; i < numbers.length; i++) {
//			numbers[i] = i*2;
//		}
//		
////		Display the content of the numbers array
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.printf("%d ", numbers[i]);
//		}
////		-> 0 2 4 6 8 10 12 14 16 18 
//		
////		Reinitialize the numbers array
//		numbers = new int[] { 10, 20, 30, 40, 50 };
//		
////		Display the content of the numbers array
//		System.out.println();
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.printf("%d ", numbers[i]);
//		}		
		
//		----------------------------------------------------------------------------------------------------------
		
////		Create an array of double numbers
//		double[] numbers = new double[] { 1.1123, 2.5622, 3.37783,  4.3355, 6.77 };
//		
////		Display the data in the numbers array
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.printf("%.2f ", numbers[i]);
//		}
////		-> 1.11 2.56 3.38 4.34 6.77 
		
//		----------------------------------------------------------------------------------------------------------

////		Create an array of strings
//		String[] singers = new String[] {
//				"Michael Jackson",
//				"Britney Spears",
//				"Hillary Duff",
//				"Elvis Presley",
//				"Robie Williams",
//		};
//		
////		Display the data in the names array
//		for (String name : singers) {
//			System.out.printf("%s\n", name);
//		}
////		-> 	Michael Jackson
////		->	Britney Spears
////		->	Hillary Duff
////		->	Elvis Presley
////		->	Robie Williams
//		
////		Change content of the third element in the names array
//		singers[2] = "Black Heart";
//		
////		Display again the content of the names array
//		System.out.println("\nAfter changing:");
//		for (String singer : singers) {
//			System.out.printf("%s\n", singer);
//		}
////		-> 	Michael Jackson
////		->	Britney Spears
////		->	Black Heart
////		->	Elvis Presley
////		->	Robie Williams
		
//		----------------------------------------------------------------------------------------------------------
		
////		Finds the maximum number in an array of integers
//		var numbers = new int[] { 100, 2, 4, 1, 230, 95, 7, 30, 99 };
//		System.out.printf("The maximum number is: %d", getMax(numbers));
////		-> The maximum number is: 230
		
//		----------------------------------------------------------------------------------------------------------
		
////		Display the even numbers in an array
//		var numbers = new int[] { 100, 2, 4, 1, 230, 95, 7, 30, 99 };
//		System.out.printf("Even numbers in the array:\n%s", displayEven(numbers));
	}
	
	/* Method: Get the maximum number in an array of integers */
	
	public static int getMax(int[] numbers) {
		int max = 0;
		if (numbers.length != 0) {
			max = numbers[0];
			for (int num : numbers) {
				if (num > max) {
					max = num;
				}
			}
		}
		return max;
	}

	/* Method: Display the even numbers in an array */
	
	public static String displayEven(int[] numbers) {
		String out = "";
		for (int num : numbers) {
			if (num % 2 == 0) {
				out += num + " ";
			}
		}
		return out;
				
	}

}



























