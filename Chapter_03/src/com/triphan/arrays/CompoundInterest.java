package com.triphan.arrays;

public class CompoundInterest {

	/**
	 * This program shows how to tabular data in a 2D array.
	 * @version 1.00 2021-10-12
	 * @author Tri Phan
	 * 
	 */
	public static void main(String[] args) 
	{
		 
//		Declare some constants
		final double STARTRATE = 10;
		final int NRATES = 6;
		final int NYEARS = 10;
		
//		Set interest rate to 10 ... 15%
		double[] interestRate = new double[NRATES];
		for (int i = 0; i < interestRate.length; i++) 
		{
			interestRate[i] = (STARTRATE + i) / 100.0;
		}
		
//		Declare a two-dimesional array of double
		double[][] balances = new double[NYEARS][NRATES];
		
//		Set initial balances to 10000
		for (int j = 0; j < balances[0].length; j++) {
			balances[0][j] = 10000;
		}
		
//		Compute interest for future years
//		for (int i = 1; i < NYEARS; i++) 
		for (int i = 1; i < balances.length; i++) 
		{
//			for (int j = 0; j < NRATES; j++) 
			for (int j = 0; j < balances[i].length; j++) 
			{
//				Get last year's balance from the previous row
				double oldBalance = balances[i - 1][j];
				
//				Compute interest
				double interest = oldBalance * interestRate[j];
				
//				Compute this year's balance
				balances[i][j] = oldBalance + interest;
			}
		}
		
//		Print one row of interest rates
		for (double r : interestRate) {
			System.out.printf("%9.0f%%", 100 * r);
		}
		System.out.println();
		
		
		
//		Print balance table
		for (double[] row : balances) 
		{
			for (double value : row) {
				System.out.printf("%,10.2f ", value);
			}
			System.out.println();
		}
		
		

	}

}















































