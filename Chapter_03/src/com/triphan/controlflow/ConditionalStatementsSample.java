package com.triphan.controlflow;

public class ConditionalStatementsSample {

	public static void main(String[] args) {

		/* Example 1: if...else... */
		
//		double target = 199.99;
////		double yourSales = 199.99;
//		double yourSales = 99.99;
//		String performance;
//		int bonus;
//		
//		if (yourSales >= target) {
//			performance = "Satisfactory";
//			bonus = 100;
//		} else {
//			performance = "Unsatisfactory";
//			bonus = 0;
//		}
//		
//		System.out.printf("Your performance is %s, \nand your bonus will be %d.", performance, bonus);
		
//		------------------------------------------------------------------------------------------------------
		
		/* Example 2 */
		
		double target = 199.99;
		double yourSales = 99.99; 
//		double yourSales = 399.98; 
//		double yourSales = 299.985; 
//		double yourSales = 199.99; 
		
		String performance;
		int bonus;
		
		if (yourSales >= target*2) {
			performance = "Excellent";
			bonus = 1000;
		} else if (yourSales >= target*1.5) {
			performance = "Fine";
			bonus = 500;
		} else if (yourSales >= target) {
			performance = "Satisfactory";
			bonus = 100;
		} else {
			performance = "";
			bonus = 0;
		}
		
//		Display the result
		if (bonus == 0) {
			System.out.println("You're fired!");
		} else {
			System.out.printf("Your performance is %s, and your bonus will be %d.", performance, bonus);
		}
		
		
	}

}



























