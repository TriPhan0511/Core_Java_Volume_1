/**
 * 
 */
package com.triphan.inputandoutput;

import java.util.Scanner;

/**
 * Thisa sample demonstrates the java.util.Scanner class.
 * 2021-10-15
 * reference link: http://web.eecs.utk.edu/~bvanderz/teaching/cs365Sp12/examples/datacheck.html
 * @author Tri Phan
 *
 */

/*
 * Input file:
 * 
 	brad 10 true
	nels 10
	nels 10 false
	nels 10 10
	brad
	10 20 30
	10 true 40
	
	brad nels 
 * 
 * */

/*
 * Output file:
 * 
 	line 2: must have a field for singleness
	line 4 - 10: singleness should be a boolean
	line 5: must have fields for age and singleness
	line 6 - 30: singleness should be a boolean
	line 7 - true: age should be an integer
	line 7 - 40: singleness should be a boolean
	Line 8: line must have the format 'name age singleness'
	line 9 - nels: age should be an integer
	line 9: must have a field for singleness
 * 
 * */
public class ScannerSample 
{
	public static void main(String[] args) 
	{
		new ScannerSample(args);
	}
	
	public ScannerSample (String[] args)
	{
		Scanner console = new Scanner(System.in);
		int lineNum = 0;
		
		while (console.hasNextLine()) {
//			The following try is so-called "try block with resources". It automatically
//			close the resource when the try block exists. I have used continue statement
//			in this loop and the try block guarantee that the lineTokenizer will be closed
//			even when a continue statement is executed.
			try (Scanner lineTokenixer = new Scanner(System.in)) 
			{
				lineNum++;
				
			}
		}
	}

}






































