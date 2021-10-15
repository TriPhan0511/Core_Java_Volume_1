package com.triphan.exercises;

import java.util.Scanner;

/**
 * 2021-10-15
 * 
 * @author Tri Phann
 * 
 */

/*
 * Bài 1.2:
 * Viết một chương trình cho kế toán của một ngân hàng để tính lãi suất (interest) mà khách hàng có
 * được dựa trên số tiền (amount) và thời gian gửi (month).
 * Chú ý: Lãi suất (rate) được khai báo là hằng số ( ví dụ final double RATE = 0.1).
 * */

public class Exercise02Simple 
{
//	Declare and initial a constant
	public static final double INTEREST_RATE = 0.1;

	public static void main(String[] args) 
	{
		double amount;
		int month;
		
		try (Scanner in = new Scanner(System.in))
		{
			System.out.print("How much money will you charge at the beginning (amount)? ");
			amount = in.nextDouble();
			System.out.print("How long will you withdraw (month) ? ");
			month = in.nextInt();
		}
		
//		Calls the calcAmount to calculate amount
		System.out.printf("With $%,.2f at the beginning, after %d months, your amount will be $%,.2f.",
				amount,
				month,
				calcAmount(INTEREST_RATE, amount,  month));
	}
	
//	-------------------------------------------- End of main method --------------------------------------------
	
	/*
	 * Method: calcAmount method
	 * 		Calculate the interest rate
	 * */
	public static double calcAmount(double interestRate, double amount, int month)
	{
		for (int i = 0; i < month; i++) {
			double interest = amount * interestRate;
			amount += interest;
		}
		
		return amount;
	}
	
//	-------------------------------------------- End of calcAmount method --------------------------------------------

}
































