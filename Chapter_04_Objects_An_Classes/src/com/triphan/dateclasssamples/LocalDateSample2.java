package com.triphan.dateclasssamples;

import java.time.LocalDate;


/**
 * This sample demonstrates the LocalDate class.
 * 2021-10-14
 * @author Tri Phan
 *
 */
public class LocalDateSample2 
{
	public static void main(String[] args) 
	{
		LocalDate current = LocalDate.now();
		int day = current.getDayOfMonth(); // 14
		int lengthOfMon = current.lengthOfMonth(); // 31
		
		
		String dayOfWeek = current.getDayOfWeek().toString(); // THURSDAY
		int offset;
		switch (dayOfWeek) {
		case "MONDAY":
			offset = 0;
			break;
		case "TUESDAY":
			offset = 1;
			break;
		case "WEDNESDAY":
			offset = 2;
			break;
		case "THURSDAY":
			offset = 3;
			break;
		case "FRIDAY":
			offset = 4;
			break;
		case "SATURDAY":
			offset = 5;
			break;

		default:
			offset = 6;
			break;
		}
		
//		String[] names = new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
////		Display the heading
//		for (String n : names) {
//			System.out.printf("%s\t", n);
//		}
//		System.out.println();
//		
////		Display the dayOfMonth
//		for (int i = 0; i < offset; i++) {
//			System.out.printf("\t");
//		}
//		System.out.printf("%d", day);
		
		
		
	}
	
}

























