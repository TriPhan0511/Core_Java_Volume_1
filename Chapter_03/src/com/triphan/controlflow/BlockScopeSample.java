package com.triphan.controlflow;

public class BlockScopeSample {

	public static void main(String[] args) {

		/*
		 * Block scope
		 * 
		 * A block, or compound statement, consists of a number of Java statements,
		 * surrounded by a pair of braces. Blocks define the scope o your variables.
		 * A block can be nested inside another block
		 * 
		 * */
		
		int n = 1;
		{
			
			int k = 2;
			System.out.printf("n = %d", n); // n =1
			System.out.printf("\nk = %d", k); // k = 2
			
//			int n = 100; // Error: Duplicate local variable n
		}
		
		System.out.printf("\nn = %d", n); // n = 1
//		System.out.printf("\nk = %d", k); // Error: k cannot be resolved to a variable
		
	}

}
