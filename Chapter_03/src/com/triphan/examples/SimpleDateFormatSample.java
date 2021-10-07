package com.triphan.examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatSample {

	public static void main(String[] args) {
		
		/* 3. Formatting dates using SimpleDateFormat class */
		
//		Formats a date
		SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
		String str = ft.format(new Date());
		System.out.println("Fortmatted date: " + str);
		
//		Parses a string to date 
		String str2 = "02/18/1995";
		ft = new SimpleDateFormat("MM/dd/yyyy");
		try {
			Date date = ft.parse(str2);
			System.out.println("Parsed date: " + date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
			

	}

}
