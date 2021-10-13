package com.triphan.arrays;

public class CompoundInterestDIY {

	public static void main(String[] args) 
	{
//		 Declare some constants
		final double STARTRATE = 10;
		final int NYEARS = 10;
		final int NRATES = 6;
		
//		Create an array for containing interest rates
		double[] interestRate = new double[NRATES];
		for (int i = 0; i < interestRate.length; i++) 
		{
			interestRate[i] = (STARTRATE + i) / 100.00;
		}
		
//		Declare a two-dimesional array for containing balances
		double[][] balances = new double[NYEARS][NRATES];
		
//		Set the first row of the balances
		for (int j = 0; j < balances[0].length; j++) 
		{
			balances[0][j] = 10000;
		}
		
//		Compute the values for the remaining rows of balances
		for (int i = 1; i < balances.length; i++) 
		{
			for (int j = 0; j < balances[i].length; j++) 
			{
//				Get the old balance of the last row
				double oldBalance = balances[i - 1][j];
				
//				Compute the interest
				double interest = oldBalance * interestRate[j];
				
//				Compute the current balance
				balances[i][j] = oldBalance + interest;
			}
		}
		
//		Display one row of interest rates
		for (double r : interestRate) 
		{
			System.out.printf("%9.0f%%", r * 100);
		}
		System.out.println();
		
//		Display the balances array
		for (double[] row : balances) 
		{
			for (double value : row) {
				System.out.printf("%,10.2f", value);
			}
			System.out.println();
		}
	}

}


































