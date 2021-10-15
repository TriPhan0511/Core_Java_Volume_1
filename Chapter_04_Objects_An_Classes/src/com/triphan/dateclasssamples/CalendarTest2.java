package com.triphan.dateclasssamples;

import java.time.LocalDate;

public class CalendarTest2 {

	public static void main(String[] args) 
	{
//		Get the current date
		LocalDate date = LocalDate.now();
		
//		Get day of month
		int today = date.getDayOfMonth();
		
//		Set date to the first date of month
		date = date.minusDays(today - 1);
		
//		Get current month 
		int month = date.getMonthValue();
		
//		Get value of day of week
		int value = date.getDayOfWeek().getValue();

//		Print the heading
		String[] str = new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };  
		for (int i = 0; i < str.length; i++) {
			System.out.printf("%s ", str[i]);
		}
		System.out.println();

		for (int i = 1; i < value; i++) {
			System.out.print("    ");
		}
		
		while (date.getMonthValue() == month) 
		{
			System.out.printf("%3d", date.getDayOfMonth());
			if (date.getDayOfMonth() == today) 
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			date = date.plusDays(1);
			if (date.getDayOfWeek().getValue() == 1)
			{
				System.out.println();
			}
			
			
		}
	}

}























