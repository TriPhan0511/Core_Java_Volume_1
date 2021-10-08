package com.phutri.inputandoutput;

import java.util.Date;

public class FormattingOutputSample {

	public static void main(String[] args) {
		
		/* Use System.out.printf */
		
////		Print x with a field width of 8 characters and a precision of 2 characters.
////		That is, the printout contains a leading space and the seven characters.
//		double x = 10000.0 / 3.0;
//		System.out.printf("%8.2f", x); // 3333.33
		
////		You can supply multiple parameters to prtinf method:
//		String name = "Alex Ferguson";
//		int age = 70;
//		System.out.printf("Hello, %s. Next year, you'll be %d", name, age + 1);
		
//		-----------------------------------------------------------------------------------------------------
		
		/* Use the static String.format method to created a formatted string without printing it */
		
//		String name = "Jenifer Lopez";
//		int age = 50;
//		String greeting = String.format("Hello, my name's %s. And i'm %d years old.", name, age);
//		System.out.println(greeting);
		
//		-----------------------------------------------------------------------------------------------------
		
		/* Date and time formatting
		 *  
		 * 	Use the prtinf method and java.util.Date class,
		 * 	For new code, you should use the methods of the java.time package described in Chapter 6 of Volume II.
		 * 
		 * */
		
//		The format consists of two letters, starting with t and ending in one of the following letters:
		/*
		 * c: Complete date and time - Fri Oct 08 10:37:01 ICT 2021
		 * F: ISO 8601 date - Ex: 2021-10-08
		 * D: U.S. formatted date (month/day/year) - 10/08/2021
		 * T: 24-hour time - 18:05:19
		 * r: 12-hour time - 06:05:19 PM
		 * ...
		 * 
		 * */
		
//		System.out.printf("%tc", new Date()); // Fri Oct 08 10:37:01 ICT 2021
//		System.out.printf("%tF", new Date()); // 2021-10-08
//		System.out.printf("%tD", new Date()); // 10/08/1
//		System.out.printf("%tT", new Date()); // 18:05:19
//		System.out.printf("%tr", new Date()); // 06:05:19 PM
		
		
//		System.out.printf("%1$s %2$tB %2$te, %2$tY", "Due date:", new Date());
//		-> Due date: October 8, 2021
		
//		---------------------------------------------------------------------------------
		
		/*
		 * You can print a number x to the console with the statement System.out.print(x).
		 * That command will print x with the maximum number of nonzero digits for that type.
		 * 
		 * */
		
//		double x = 10000.0 / 3.0;
//		System.out.print(x);
////		->3333.3333333333335
		
		/*
		 * Use the printf to prints x with a field width of 8 chacracters and a precision of 2 characters.
		 * That is, the printout contains a leading space and the seven characters 
		 * 
		 * */
		
//		double x = 10000.0 / 3.0;
//		System.out.printf("%8.2f", x);
////		->  3333.33
		
		/*
		 * You can supply multiple parameters to printf. For example,
		 * */
		
//		String name = "Harry Kewel";
//		int age = 50;
//		System.out.printf("Hello, my name' %s. And I'm %d years old.", name, age);
////		->Hello, my name' Harry Kewel. And I'm 50 years old.
		
		
		/*
		 * Each of the format specifiers that start with a % character is replaced with the
		 * corresponding argument. The conversion character that ends a format specifier
		 * indicates the type of the value to be formatted:
		 * 		f is a floating-point number,
		 * 		s a string,
		 * 		d a decimal integer.
		 * 
		 * */
		
////		Example:
//		System.out.printf("%s", "Hello");
//		System.out.printf("%d", 123);
//		System.out.printf("%.2f", 12.34567);
//		System.out.printf("%,.2f", 12345.6789); // 12,345.68
		
		/*
		 * You can use the static String.format method to create a formated string 
		 * without printing it:
		 * 
		 * */
		
//		String name = "Alex";
//		int age = 30; 
//		String message = String.format("Hello, my name's %s. And I'm %d years old", name, age);
		
//		----------------------------------------------------------------------------------------------
		
		/*
		 * Date and time formatting options of the printf method.
		 * For new code, you should use the methods of the java.time package 
		 * described in the chapter 6 of Volume II. But you may encounter the Date class and
		 * the associated formatting options in legacy code.
		 * 
		 * The format consists of two letters, starting with t and ending in one of the letters
		 * of the following table:
		 * 
		 * */
		
//		Examples:
		
//		System.out.printf("%tc", new Date()); // Fri Oc 08 13:52:41 ICT 2021 (Complete date and time)
//		System.out.printf("%tF", new Date()); // 2021-10-08 (ISO 8601 date)
//		System.out.printf("%tD", new Date()); // 10/08/21 (U.S. formatted date (month/day/year) )
//		System.out.printf("%tT", new Date()); // 13:55:37 (24-hour time)
//		System.out.printf("%tr", new Date()); // 01:56:10 PM (12-hour time)
//		System.out.printf("%tR", new Date()); // 13:56 (24-hour time, no second)
//		System.out.printf("%tY", new Date()); // 2021 (Four-digit year (with leading zeroes) )
//		System.out.printf("%ty", new Date()); // 21 (Last two digits of the year (with leading zeroes) )
//		System.out.printf("%tC", new Date()); // 20 (Fisrt two digits of the year (with leading zeroes) )
//		System.out.printf("%tB", new Date()); // October (Full month name)
//		System.out.printf("%tb", new Date()); // Oct (Abbreviated month name)
//		System.out.printf("%th", new Date()); // Oct (Abbreviated month name)
//		System.out.printf("%tm", new Date()); // 10 (Two-digit month (with leading zeroes) )
//		System.out.printf("%td", new Date()); // 08 (Two-digit day (with leading zeroes) )
//		System.out.printf("%te", new Date()); // 8 (Two-digit day (without leading zeroes) )
//		System.out.printf("%tA", new Date()); // Friday (Full weekday name)
//		System.out.printf("%ta", new Date()); // Fri (Abbreviated weekday name)
//		System.out.printf("%tj", new Date()); // 281 (Three-digit day of year (with leading zeroes), between 001 and 366)
//		System.out.printf("%tH", new Date()); // 14 (Two-digit hour (with leading zeroes), between 00 and 23)
//		System.out.printf("%tk", new Date()); // 14 (Two-digit hour (without leading zeroes), between 0 and 23)
//		System.out.printf("%tI", new Date()); // 02 (Two-digit hour (with leading zeroes), between 01 and 12)
//		System.out.printf("%tl", new Date()); // 2 (Two-digit hour (without leading zeroes), between 1 and 12)
//		System.out.printf("%tM", new Date()); // 17 (Two-digit minutes (with leading zeroes) )
//		System.out.printf("%tS", new Date()); // 53 (Two-digit second (with leading zeroes) )
//		System.out.printf("%tL", new Date()); // 265 (Three-digit milliseconds (with leading zeroes) )
//		System.out.printf("%tN", new Date()); // 972000000 (Nine-digit nanoseconds (with leading zeroes))
//		System.out.printf("%tp", new Date()); // pm (Morning or afternoon marker)
//		System.out.printf("%tz", new Date()); // +0700 (RFC 822 numeric offset from GMT)
//		System.out.printf("%tZ", new Date()); // ICT (Time zone)
//		System.out.printf("%ts", new Date()); // 1633677803 (Seconds since 1970-01-01 00:00:00 GMT)
//		System.out.printf("%tQ", new Date()); // 1633677828553 (Milliseconds from since 1970-01-01 00:00:00 GMT)
		
		/*
		 * As you can see in the above examples, some of the formats yield only a part of a given date
		 * - for example, just the day or just the month
		 * 
		 * */
		
	}

}





























