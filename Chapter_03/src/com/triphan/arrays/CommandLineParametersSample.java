package com.triphan.arrays;


/**
 * This program demonstrates the command-line parameters
 * 2021-10-09
 * @author Tri Phan
 *
 */
public class CommandLineParametersSample {

	public static void main(String[] args) {

		/* 5. Command-Line Parameters */
		
		/*
		 * Every Java program has a main method with a String[] args parameter.
		 * This parameter indicates that the main method receives an array of strings - 
		 * namely, the arguments specified on the command line.
		 * 
//		 * For example, consider this program:
		 * 
		 * */
		
		
		if (args.length == 0 || args[0].equals("-h")) {
			System.out.print("Hello,");
		} else if (args[0].equals("-g")) {
			System.out.print("Goodbye,");
		}
		
//		Print the other command-line arguments
		for (int i = 1; i < args.length; i++) {
			System.out.print(" " + args[i]);
		}
		System.out.println("!");

		
		/*
		 * If the program is called as:
		 * 
		 * 		java CommandLineParametersSample -g cruel world
		 * 
		 * the the args array has the following content:
		 * 
		 * 		args[0]: "-g"
		 * 		args[1]: "cruel"
		 * 		args[2]: "world"
		 * 
		 * Then the program print the message:
		 * 
		 * 		Goodbye, cruel world!
		 * 
		 * */
		

		
	}

}
































