package com.triphan.dateclasssamples;

import java.time.LocalDate;

/**
 * This sample demonstrates the LocalDate class.
 * 2021-10-14
 * @author Tri Phan
 *
 */
public class LocalDateSample 
{
	/*
	 * You do not use a constructor to construct objects of the LocalDate class.
	 * Instead, use static factory methods that call constructors on your behalf.
	 * The expression:
	 * 
	 * 		LocalDate.now()
	 * 
	 *	constructs a new object that represents the date at which the object was constructed. 
	 *
	 * You can construct an object for a specific date by supplying year, month, and day:
	 * 
	 * 		LocalDate birthday = LocalDate.of(1984, 11, 5);
	 * 
	 * Once you have a LocalDate object, you can find out the day, month, and year with the 
	 * methods getDayOfMonth, getMonthValue, getYear:
	 * 
	 * 		int day = birthday.getDayOfMonth();
	 *		int month = birthday.getMonthValue();
	 *		int year = birthday.getYear();
	 *		System.out.printf("Day: %d, Month: %d, Year: %d", day, month, year); 
	 *		//-> Day: 5, Month: 11, Year: 1984
	 * 
	 * */
	
	/*
	 * The LocalDate class has encapsulated instance fields to maintain the date to which it is set.
	 * Without looking at the source code, it is impossible to know the representation that the class
	 * uses internally. But, of course, the point of encapsulation is that this doesn't matter. 
	 * What matters are the methods that class exposes. 
	 * 
	 * */
	
	public static void main(String[] args) 
	{
//		Example 1:
		
//		LocalDate current = LocalDate.now();
//		System.out.println(current.toString());
////		-> 2021-10-14
		
//		---------------------------------------------

//		Example 2:
		
//		LocalDate birthday = LocalDate.of(1984, 11, 5);
//		
//		int day = birthday.getDayOfMonth();
//		int month = birthday.getMonthValue();
//		int year = birthday.getYear();
//		System.out.printf("Day: %d, Month: %d, Year: %d", day, month, year); 
////		-> Day: 5, Month: 11, Year: 1984
		
//		---------------------------------------------
		
////		Example 3: 
////		The plusDay method yields a new LocalDate that is a given number of days from the object 
////		to which you apply it:
//		
//		LocalDate current = LocalDate.now(); // -> 2021-10-14
//		LocalDate aThousandDaysLater = current.plusDays(1000); // -> 2024-07-10
//		
//		int year = aThousandDaysLater.getYear(); // -> 2024
//		int month = aThousandDaysLater.getMonthValue(); // -> 7
//		int day = aThousandDaysLater.getDayOfMonth(); // -> 10
		
//		---------------------------------------------
		
//		Example 4: Mutator and Accessor
		
		LocalDate newYearsEve = LocalDate.of(1999, 12, 31); 
		System.out.println(newYearsEve.toString());  
//		-> 1999-12-31
		
//		Call the method plusDays on newYearsEve
		LocalDate aThousandDaysLater = newYearsEve.plusDays(1000); 
		System.out.println(aThousandDaysLater.toString());
//		-> 2002-09-26
		
		/*
		 * What happens to newYearsEve after the call? Has it been changed to be a thousand days later?
		 * As it turns out, it has not. The plusDays yields a new LocalDate object, which is then assigned
		 * to the aThousandDaysLater variable. The original object remains unchanged. We say that the
		 * plusDays method does not mutate the object on which it is invoked.
		 * 
		 * A mutator method is a method which after invoking on an object, the state of that object has changed.
		 * 
		 * In constrast, methods that only access the objects without modifying them are sometimes called
		 * accessor methods. For example, LocalDate.plusDays and LocalDate.getYear are accessor methods.
		 * 
		 * */
//		System.out.println(newYearsEve.toString());
//		-> 1999-12-31
		
		
		
	}
}

















































