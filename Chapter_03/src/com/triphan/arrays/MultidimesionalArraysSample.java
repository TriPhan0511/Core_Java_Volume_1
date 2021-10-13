package com.triphan.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program demonstrates the multidimensional arrays
 * 2021-10-12
 * @author Tri Phan
 * 
 */
public class MultidimesionalArraysSample {

	public static void main(String[] args) {
		
//		Creates a two-dimensional array
		int[][] magicSquare = {
				{ 16, 3, 2, 13 },
				{ 5, 10, 11, 8 },
				{ 9, 6, 7, 12 },
				{ 4, 15, 14, 1 }
		};
		
////		Display the magicSquare array
//		for (int i = 0; i < 4; i ++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.printf("%d ", magicSquare[i][j]);
//			}
//			System.out.println();
//		}
		
////		Using two "for each" loops
//		for (int[] row : magicSquare) {
//			for (int value : row) {
//				System.out.printf("%d ", value);
//			}
//			System.out.println();
//		}
		
//		Using Arrays.deepToString
		System.out.println(Arrays.deepToString(magicSquare));
//		-> [[16, 3, 2, 13], [5, 10, 11, 8], [9, 6, 7, 12], [4, 15, 14, 1]]
		
	}

	

}




























