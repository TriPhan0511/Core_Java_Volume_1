package com.triphan.inputandoutput;

import java.util.Date;

public class FormattingOutputSample {

	public static void main(String[] args) {
		
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
		
		/*
		 * In addition, you can specify flags that control the appearance of the formatted output.
		 * For example, the comma flag adds group separator.
		 * 
		 * */
		
////		Examples:
//		
//		double x = 3333.33333;
//		
////		System.out.printf("%+.2f", x); // +3333.33 (Flag + : Prints sign for positive and negative numbers)
////		System.out.printf("% .2f", x); //  3333.33 (Flag space : Adds a space before positive numbers)
////		System.out.printf("%011.2f", x); // 00003333.33 (Flag 0 : Adds leading zeroes, in this example: the field width is 11 characters.)
////		System.out.printf("%-20.2f", x); //(Flag - : Left-jutifies field) ???
////		System.out.printf("%(.2f", -123.456799); // (-123.456799) (Flag ( : Enclose negative numbers in parentheses)
////		System.out.printf("%,.2f", x); // 3,333.33 (Flag , : Adds group separator)
////		...
		
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
		 * - for example, just the day or just the month. It would be a bit silly if you had to supply
		 * the date multiple times to format each part. For that reason, a format string can indicate
		 * the index of the argument to be formatted. The index must immediately follow the %, and it
		 * must be terminated by a $. 
		 * 
		 * NOTE: Argument index values start with 1, not with 0.
		 * For example,  %1$... formats the first argument.
		 * This avoid confusion with the 0 flag.
		 * 
		 * */
		
//		System.out.printf("%1$s %2$tB %2$te, %2$tY", "Due date:", new Date());
////		-> Due date: October 8, 2021
		
		/*
		 * Alternatively, you can use the < flag. It indicates that the same argument as in the preceding 
		 * format specification should be used again.
		 * 
		 * */
		
//		System.out.printf("%s %tB %<te, %<tY", "Due date:", new Date());
////		-> Due date: October 8, 2021
		
		/*
		 * NOTE: 
		 * The formatting of numbers and dates is locale-specific.
		 * For example, in Germany, the group separator is a period, not a comma, and Monday is
		 * formatted as Montag.
		 * Chapter 7 of Volume II shows how to control the international behavior of your applications.
		 * 
		 * */
	}

}





























