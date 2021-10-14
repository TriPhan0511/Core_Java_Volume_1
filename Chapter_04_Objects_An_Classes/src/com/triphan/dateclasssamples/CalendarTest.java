package com.triphan.dateclasssamples;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * This program demonstrates the LocalDate class.
 * 2021-10-14
 * @author Tri Phan
 * 
 */
public class CalendarTest {

	public static void main(String[] args) 
	{
		/* Some useful methods in java.time.LocalDate class: */
		
//		1. static LocalDate now()
//			constructs an object that represents the current date.
		
//		2. static LocalDate of(int year, int month, int day)
//			constructs an object that represents the given date.
		
//		3. int getYear()
		
//		4. int getMonthValue()
		
//		5. int getDayOfMonth()
//			gets the year, month, and day of this date.
		
//		6. DayOfWeek getDayOfWeek
//			gets the weekday of this date as an instance of the DayOfWeek class.
//			Call getValue to get a weekday between 1 (Monday) and 7 (Sunday).
		
//		7. LocalDate plusDays(int n)

//		8. LocalDate minusDay(int n)
//			yields the date that is n days after or before this date.
		
		
//		------------------------------------------------------------------------------
		
//		Result:
		
		/*
				Mon Tue Wed Thu Fri Sat Sun
				                  1   2   3 
				  4   5   6   7   8   9  10 
				 11  12  13  14* 15  16  17 
				 18  19  20  21  22  23  24 
				 25  26  27  28  29  30  31 

		 * */
		
//		------------------------------------------------------------------------------
		
//		Construct an LocalDate object that is initialized with the current date
		LocalDate date = LocalDate.now();
		
//		Get the current month and day
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		
//		Set the date to the first of the month and get the weekday of that date
		date = date.minusDays(today - 1);
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue(); // 1 = Monday, ..., 7 = Sunday
		
//		Print the header and the indentation for the first line
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		for (int i = 1; i < value; i++) {
			System.out.print("    ");
		}

//		Print the body of the calendar:
//		We enter a loop in which date traverses the days of month.
//		In each iteration, we print the date value. 
//		If date is today, the date is mark with an *.
//		The we advance date to the next day. When we reach the
//		beginning of each new week, we print a new line.
		
//		When do we stop? We keep iterating while date is still in the current month.
		while (date.getMonthValue() == month) {
			System.out.printf("%3d", date.getDayOfMonth());
			if (date.getDayOfMonth() ==  today) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			date = date.plusDays(1);
			if (date.getDayOfWeek().getValue() == 1) {
				System.out.println();
			}
		}
		
	}

}





































