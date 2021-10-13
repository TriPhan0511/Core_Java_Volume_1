/**
 * 
 */
package com.triphan.arrays;

import java.util.Iterator;

/**
 * 2021-10-13
 * @author Tri Phan
 *
 */
public class CompoundInterestDIY2 
{
	public static void main(String[] args) 
	{
//		Declare some constants
		final int STARTRATE = 10;
		final int NYEARS = 10;
		final int NRATES = 6;
		
//		Calls the getBalances method
		double[][] balances = getBalances(STARTRATE, NYEARS, NRATES);
		
//		Calls the displayHeading
		displayHeading(STARTRATE, NRATES);
		
//		Calls the displayNumbers
		displayNumbers(balances);
		
	}
	
//	--------------------------------------------------------------------------------
	
	/*
	 * Method: getBalances
	 * 		Return an two-dimesional array
	 * */
	public static double[][] getBalances(int startRate, int years, int rates)
	{
//		Create an array for contaning interest rates
		var interestRates = new double[rates];
		for (int i = 0; i < interestRates.length; i++) {
			interestRates[i] = (startRate + i) / 100.0;
		}
		
//		Declare a two-dimesional array
		double balances[][] = new double[years][rates];
		
//		Insert data into the first row of the balances array
		for (int i = 0; i < balances[0].length; i++) {
			balances[0][i] = 10000;
		}
		
//		Insert data into the remaining rows of the balances array
		for (int i = 1; i < balances.length; i++) {
			for (int j = 0; j < balances[i].length; j++) {
//				Get the old balance fro the previous row
				double oldBalance = balances[i - 1][j];
				
//				Compute the interest
				double interest = oldBalance * interestRates[j];
				
//				Compute the balance of the current year
				balances[i][j] = oldBalance + interest;
			}
		}
		return balances;
	}

	/*
	 * Method: displayNumbers
	 * 		Display the content of a two-dimensional array
	 * */
	public static void displayNumbers (double[][] numbers)
	{
		for (double[] row : numbers) {
			for (double value : row) {
				System.out.printf("%,10.2f", value);
			}
			System.out.println();
		}
	}
	
	/*
	 * Method: displayHeading
	 * 		Display the heading
	 * */
	public static void displayHeading(int startRate, int rates)
	{
		System.out.printf("%-60s\n", "Growth of an Investment at Different interest Rates");
		System.out.println();
		for (int i = 0; i < rates; i++) {
			System.out.printf("%9d%%", startRate + i);
		}
		System.out.println();
	}
}

































