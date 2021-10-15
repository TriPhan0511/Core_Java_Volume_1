/**
 * 
 */
package com.triphan.numberformatting;

import java.text.DecimalFormat;
import java.util.Formatter;

/**
 * This sample demonstrates how to format float or double to String in Java.
 * In this sample, the floating number will be displayed up to 2 or 3 decimal places.
 * 
 * Reference link: https://www.java67.com/2014/06/how-to-format-float-or-double-number-java-example.html
 * 
 * 2021-10-15
 * 
 * @author Tri Phan
 *
 */
public class FormatFloatInJava 
{
	public static void main(String[] args) 
	{
//		First task - format a floating number up-to 2 decimal places
		float pi = 3.1428733f;
		
//		From Java 5, String class has a format method
		String str = String.format("%.2f", pi);
		System.out.println("Formatted float up to 2 decimal places: " + str); // 3.14
		
//		Use System.out.printf method
		System.out.printf("%.03f", pi); // 3.143
		System.out.printf("\n%.03f", 3.1); // 3.100
		
//		----------------------------------------------------------------------
		
//		Alternatively you can also use Formatter class to
//		format floating point numbers.
//		Allocate a Formatter on the StringBuilder
		StringBuilder sb = new StringBuilder();
		Formatter formatter = new Formatter(sb);
		
		formatter.format("%.4f", pi); // format() has the same syntax as printf()
		System.out.println("\nFormatted float up to 4 decimal places: " + formatter.toString()); // 3.1429
		
//		----------------------------------------------------------------------
		
//		BEST WAY to format floating point numbers in Java: Use DecimalFormat class
//		Beware it also rounds the numbers
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(df.format(123.456)); // 123.46
		
		df = new DecimalFormat("#.###");
		System.out.println(df.format(123.456)); // 123.456
		
		df = new DecimalFormat("#,###.##");
		System.out.println(df.format(12345.678)); // 12,345.68
		
		System.out.println(df.format(12345.678)); // 12,345.68
	}

}































