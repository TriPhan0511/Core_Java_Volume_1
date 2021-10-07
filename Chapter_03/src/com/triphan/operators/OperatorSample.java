package com.triphan.operators;

import static java.lang.Math.*;

public class OperatorSample {

	public static void main(String[] args) {
		
		/* 1. Arithmetic Operators*/
		
//		Integer division (if both arguments are integers)
//		System.out.println(15 / 2); // 7
		
//		Floating-point division otherwise
//		System.out.println(15 / 2.0); // 7.5
		
//		Modulus (integer remainder)
//		System.out.println(15 % 2);  // 1
		
		
		
//		Integer division by 0 raises an exception
//		System.out.println(1 / 0); // Raises an exception
		
//		try {
//			System.out.println(1 / 0);
//		} catch (Exception e) {
//			 e.printStackTrace();
//		}

//		Whereas, floating-point division by 0 yields an Infinity or NaN result.
//		System.out.println(1.2 / 0); // Infinity
		
//		--------------------------------------------------------------------------------------------------------
		
		/* 2. Mathematical Functions and Constants*/
		
//		Take the square root of a number
//		System.out.println(Math.sqrt(4)); // 2.0
//		System.out.println(Math.sqrt(-4.0)); // NaN
		
//		Raise a quantity to a power
//		System.out.println(Math.pow(4, 2)); // 16.0
	
//		Constants
//		System.out.println(Math.PI); // 3.141592653589793
//		System.out.printf("%.3f", Math.PI); // 3.142
		
//		System.out.println(Math.E); // 2.718281828459045
	
//		To avoid the Math prefix for the mathematical methods and constants, 
//		adding the line: import static java.lang.Math.*; to the top of your source file.
	
//		System.out.println(PI); // 3.141592653589793
	
//	--------------------------------------------------------------------------------------------------------
	
		/* 3. Conversions between Numeric Types */
		
//		int n = 123456789;
//		float f = n; // f is 1.23456792E8
//		System.out.println(f); // 1.23456792E8
	
//		When two values are combined with a binary operator (such as n + f where n is an integer and f is a floating-point value),
//		both operands are converted to a common type before the operation is carried out.
		
//		_ If either of the operands is of type double, the other one will be converted to a double.
//		int n = 10;
//		double f = 5.5;
//		double result = n + f;
//		System.out.println(result); // 15.5
//		
//		_ Otherwise, if either of the operands is of type float, the other one will be converted to a float.
//		int n = 15;
//		float f = 6.7f;
//		float result = n + f;
//		System.out.println(result); // 21.7
		
//		_ Otherwise, if either of the operands is of type long, the other one will be converted to a long.
//		int n1 = 45;
//		long n2 = 50;
//		long result = n1 + n2;
//		System.out.println(result); // 95
		
//		_ Otherwise, both operands will be converted to an int.
//		byte n1 = 1;
//		short n2 = 4;
//		int result = n1 + n2;
//		System.out.println(result); // 5
		
//		--------------------------------------------------------------------------------------------------------
		
		/* 4. Casts*/
		
//		double x = 9.997;
//		int nx = (int) x; // 9
//		System.out.println(nx);
		
//		Use the Math.round method to round a floating-point number to the nearest integer.
//		double x = 9.997;
//		int nx = (int)Math.round(x); // 10
//		System.out.println(nx);
//		
//		--------------------------------------------------------------------------------------------------------
		
		/* 5. Combining Assigments with Operators */
		
//		int x = 10;
//		x += 4; // equivalent to x = x + 4;
//		System.out.println(x); // 14

//		If the operator yields a value whose type is different from that of the left-hand side,
//		then it is coerced to fit.
//		int x = 5;
//		x += 3.5; // equivalent to x = (int) (x + 3.5);
//		System.out.println(x); // 8
		
//		--------------------------------------------------------------------------------------------------------
		
		/* 6. Increment and Decrement Operators*/
		
//		int n = 12;
//		n++;
//		System.out.println(n); // 13
		
//		int n = 12;
//		n--;
//		System.out.println(n); // 11
		
//		There are two form of these operators: postfix form (n++) and prefix form (++n).
//		Both change the value of the variable by 1.
//		The difference between the two appears only when they are used inside expressions.
//		The prefix form does the addition first; the postfix form evaluates to the old value of the variable.
		
//		(We recommend against using ++ inside expressions because this often leads to confusing code and annoying bugs.)
		
//		int n = 12;
//		int result = ++n + 1; 
//		System.out.println(result); // 14
//		System.out.println(n); // 13
		
//		int n = 12;
//		int result = n++ + 1;
//		System.out.println(result); // 13
//		System.out.println(n); // 13
		
//		int m = 7;
//		int n = 7;
//		int a = 2 * ++m; // now a is 16, m is 8
//		int b = 2 * n++; // now b is 14, n is 8
//		
//		System.out.println(a); // 16
//		System.out.println(m); // 8
//		System.out.println(b); // 14
//		System.out.println(n); // 8
		
//		--------------------------------------------------------------------------------------------------------
		
		/* 7. Relational and boolean Operators */
		
//		To test for equality, use a double equal sign (==)
//		int x = 7;
//		int y = 7;
//		if (x == y) {
//			System.out.println("Equal");
//		}
		
//		Use a != for inequality
//		int x = 6;
//		int y = 7;
//		if (x != y) {
//			System.out.println("Not equal");
//		}
		
//		Finally, you have the usual < (less than), > (greater than), <= (less than or equal to), >= (greater than or equal to) operators.
		
//		Java uses && for the logical "and" operator
//		and || for the logical "or" operator,
//		the exclamation point ! is the logical negation operator.
		
//		int x = 1;
//		int y = 2;
//		
//		if (x < y && x > 0) {
//			System.out.printf("x is greater than zero but less than %d.", y);
//		}
//		
//		if (y > 0 || y > x) {
//			System.out.println();
//		}
		
//		The && and || operators are evaluated in "short circuit" fashion: The second argument is not evaluated
//		if the first argument already determines the value.
//		If you combine two expressions with the && operator, expression1 && expression2, and the truth value of 
//		the first expression (expression1) has been determined to be false, then it is impossible for the result
//		to be true. Thus, the value for the second expression is not calculated. This behavior can be exploited
//		to avoid errors. For example:
		
//		x != 0 && 1 / x > x + y (no division by 0)
		
//		The second part is never evaluated if x equals zero. Thus, 1 / x is not computed if x is zero,
//		 and no divide-by-zero error can occur.
		
//		Similarly, the value of expression1 || expression2 is automatically true if the first expression is true,
//		without evaluating the second expression.
		
//		Finally, Java supports the tenary operator (?:) that is occasionally useful. The expression:
		
//		condition ? expression1 : expression2
		
//		evaluates to the first expression if the condition is true, to the second expression otherwise.
		
//		int x = 4;
//		int y = 5;
//		int maxNumber = x > y ? x : y;
//		System.out.println(maxNumber); // 5
//		
	
	}

}






















