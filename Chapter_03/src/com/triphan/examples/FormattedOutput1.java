package com.triphan.examples;

public class FormattedOutput1 {

	public static void main(String[] args) {
		
		/* 1. Formatting output using System.out.printf()*/
		
		int integerNumber = 100;
		System.out.printf("An integer: %d", integerNumber);
		
//		This will print it up to two decimal places
		System.out.printf("\nFormatted with precision: %.2f", Math.PI); // 3.14 (Math.PI is a double)
		
//		Appends zero to the rightmost part of the decimal automa
		float floatNumber = 5.2f;
		System.out.printf("\nFormatted to a specific width: %.4f", floatNumber); // 5.2000
		
//		The number is formatted to the right margin and 
//		occupies a width of twenty characters
		floatNumber = 2324435.3f;
		System.out.print("\n123456789012345678901234567890");
		System.out.printf("\n%20.4f", floatNumber);

	}

}
