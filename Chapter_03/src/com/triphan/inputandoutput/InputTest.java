package com.triphan.inputandoutput;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		
		/* 1. Reading Input */
		
////		Construct a Scanner
//		Scanner in = new Scanner(System.in);
		
////		Use the nextLine method to read a line of input
//		System.out.print("What is your name? ");
//		String name = in.nextLine();
//		System.out.println("Hello, " + name);
		
////		We used the nextLine method because the input might be contain spaces. To read
////		a single word (delimited by whitespace), call the next method:
//		System.out.print("What is your name? "); // Peter Pan
//		String firstName = in.next();
//		System.out.println("The first name is " + firstName); // Peter
		
////		To read an integer, use the nextInt method
//		System.out.print("How old are you? ");
//		int age = in.nextInt();
//		System.out.println("You age " + age);
		
////		Similarly, the nextDouble method reads the next floating-point number.
//		System.out.print("Enter a double number: ");
//		double num = in.nextDouble();
//		System.out.println("The double number you have just entered is " + num);
		
//		------------------------------------------------------------------------------------
		
//		Calls the greeting method
		System.out.println(greeting());
	}
	
//	Method: Asks for the user's name and age and then prints a message like : 
//		"Hello, Cay. Next year, you'll be 57"
	public static String greeting() {
//		Get information from the user
		String name;
		int age;
		try (Scanner in = new Scanner(System.in)){
			System.out.print("What's your name? ");
			name = in.nextLine();
			System.out.print("How old are you? ");
			age = in.nextInt();
		}
		return "Hello, " + name + ". Next year, you'll be " + (age + 1);
	}

}





































