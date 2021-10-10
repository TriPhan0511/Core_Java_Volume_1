package com.triphan.bignumbers;

import java.math.BigInteger;

/**
 * This program demonstrates how to use java.math.BigInteger and java.math.
 * @version 1.00 2021-10-09
 * @author Tri Phan
 *
 */
public class BigNumbersSample {

	public static void main(String[] args) {

		/*
		 * If the precision of the basic integer and floating-point types is not sufficient,
		 * you can turn to a couple of handy classes in the java.math package:
		 * BigInteger and BigDecimal. These are classes for manipulating numbers with an
		 * arbitrarily long sequence of digits. The BigInteger class implements arbitrary-precision
		 * integer arithmetic, and BigDecimal does the same for floating-point numbers.
		 * 
		 * */
		
		/* Use the static valueOf method to turn an ordinary number into a big number: */
//		BigInteger a = BigInteger.valueOf(100);
		
		/* For a long numbers, use a constructor with a string parameter */
//		BigInteger reallyBig = new BigInteger("2345774322457677543324577764222");
		
		/* There are also constants BigInteger.ZERO, BigInteger.ONE, BigInteger.TEN, and,
		 * since Java 9, BigInteger.TWO. 
		 * */
		
		/*
		 * Unfortunately, you cannot use the familiar operators such as + and * to combine big numbers.
		 * Instead, you must use methods such as add and multiply in the big number classes.
		 * */
		
//		Example:
		BigInteger a = BigInteger.valueOf(123);
		BigInteger b = BigInteger.valueOf(12);
		
		BigInteger c = a.add(b);
		System.out.println(c); // 135
		
		c = a.multiply(b); 
		System.out.println(c); // 1476
		
		c = b.subtract(a);
		System.out.println(c); // -111
		
		c = a.divide(b);
		System.out.println(c); // 10
		
	}

}
































