package com.triphan.examples;

import java.text.DecimalFormat;

public class DecimalFormatSample {

	public static void main(String[] args) {
		
		/* 2. Formatting using DecimalFormat class */
		
		
		double num = 123.4567;
		
//		Not formatted
		System.out.println("num = " + num); //123.4567
		
//		Prints only the numeric part of a floating number (without the fraction part)
		DecimalFormat ft= new DecimalFormat("#");
		System.out.println("num = " + ft.format(num)); // 123
		
		
//		Prints the number up to two decimal places
		ft = new DecimalFormat("#.##");
		System.out.println("num = " + ft.format(num)); // 123.46
		
//		Automatically appends zero to the rightmost part of the number,
//		using the digit 0, instead of #
		ft = new DecimalFormat("#.00000");
		System.out.println("num = " + ft.format(num)); // 123.45670
		
//		Automatically appends zero to the leftmost of the number,
//		by using the digit 0, instead of #
		ft = new DecimalFormat("0000.00");
		System.out.println("num = " + ft.format(num)); // 0123.46
		
//		Formatting money in dollars
		ft = new DecimalFormat("$###,###.##");
		System.out.println(ft.format(num)); // $123.46
		
	}

}














