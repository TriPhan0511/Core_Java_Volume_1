import static java.lang.Math.*;

public class Operators 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		/*
		 * Operators are used to combine values. Java has a rich set of arithmetic and logical operators
		 * and mathematical functions.
		 * */
		
		/*
		 * 1. Arithmetic operators
		 * The usual arithmetic +, -, *, / are used in Java for addition, subtraction, multiplication, and division.
		 * The / operator denotes integer division if both arguments are integers, and floating-pint division otherwise.
		 * Integer remainder (sometimes called modulus) is denoted by %. For example, 15 / 2 is 7, 15 % 2 is 1, 
		 * and 15.0 / 2 is 7.5	 
		 * */
		
//		System.out.println(15 / 2);
//		System.out.println(15 % 2);
//		System.out.println(15.0 / 2);
		
		/*
		 * Note that integer division zero by raises an exception, whereas floating-point division by zero yields an infinite 
		 * or NaN result.
		 * */
		
//		Integer division by zero
//		try {
//			System.out.println(4 / 0);
//		} catch (ArithmeticException e) {
//			System.out.println("Integer division by 0.");	 
//		}
		
//		Floating-point division by zero
//		double x = 15.2;
//		if (Double.isInfinite(x / 0)) {
//			System.out.println("Floating-point division by zero.");
//		}
//		------------------------------------------------------------------------------------------------------------------
		
		/*
		 * 2. Mathematical Functions and Constants
		 * */
		
//		Takes the square root of a number, use the sqrt method in the Math class:
//		double x = 4;
//		double y = Math.sqrt(x);
//		System.out.println(y); // 2.0
		
//		Raises a quantity to a power: use the pow method in the Math class:
//		double x = 5;
//		double y = Math.pow(5, 2);
//		System.out.println(y); // 25.0
		
//		Two constants: denote the closet possible approximations
//		System.out.println(Math.PI);
//		System.out.println(Math.E);
		
//		You can avoid the Math prefix for the mathematical methods and constants 
//		by adding the following line to the top of your source code:
//		import static java.lang.Math.*;
//		System.out.println(pow(4, 2)); // 16.0
//		------------------------------------------------------------------------------------------------------------------
		
		/*
		 * 3. Conversion between Numeric Types
		 * When two values are combined with a binary operator (such as n + f where n
		 * is an integer and f is a floating-point value), both operands are converted to a
		 * common type before the operation is carried out.
		 * 
		 * 	_ If either of these operands is of type double, the other one will be converted 
		 * 		to a double.
		 * 
		 * 	_ Otherwise, if either of the operands is of type float, the other one will be 
		 * 		converted to a float.
		 * 
		 * 	_ Otherwise, if either of the operand is of long, the other one will be converted
		 * 		to a long.
		 * 
		 * 	_ Otherwise, both operands will be converted to an int.
		 * 
		 * */
//		------------------------------------------------------------------------------------------------------------------
		
		/*
		 * 4. Casts
		 * In the preceding section, you saw that int values are automatically converted to 
		 * double values when necessary. On the other hand, there are obviously times when
		 * you want to consider a double as an integer.
		 * 
		 * Numeric conversions are possible in Java, but of course information may be lost.
		 * Conversions in which loss of information is possible are done by means of casts.
		 * The syntax for casting is to give the target type in parentheses, followed by the
		 * variable name.
		 * 
		 * */
		
//		double x  = 9.997;
//		int nx = (int) x;
//		System.out.println(nx); // 9
		
		/*
		 * Now, the variable nx has the value 9 because casting a floating-point value to
		 * an integer discards the fractional part.
		 * 
		 * */
		
		/*
		 * If you want to round a floating-point number to the nearest integer (which in 
		 * most cases is a more useful operation), use the Math.round method:
		 * 
		 * */
		
//		double x = 9.997;
//		int nx = (int) Math.round(x);
//		System.out.println(nx);  // 10
		
		/*
		 * Now the variable nx has the value 10. You still need to use the cast (int) when
		 * you call round method. The reason is that the return value of the round method
		 * is a long, and a long can only be assigned to int with an explicit cast because
		 * there is possibility of information loss.
		 * 
		 * */
//		------------------------------------------------------------------------------------------------------------------
		
		/*
		 * 5. Combining Assigment with Operators
		 * 
		 * */

//		int x = 10;
//		x += 4;
//		System.out.println(x); // 14
//		
//		double y = 5.;
//		y *= 2;
//		System.out.println(y); // 10.0
//		
//		int z = 5;
//		z += 1.4;
//		System.out.println(z); // 6
//		------------------------------------------------------------------------------------------------------------------
		
		/*
		 * 6. Increment and Decrement Operators
		 * n++ adds 1 to the current value of the variable n, and
		 * n-- subtracts 1 from it.
		 * */
		
//		int n = 11;
//		n++;
//		System.out.println(n); // 12
//		
//		n--;
//		System.out.println(n); // 11
//		
		/*
		 * There are two forms of these operators: postfix (n++) and prefix (++n). Both change the value of the variable by 1.
		 * The difference between the two appears only when they are used inside exnpressions. The prefix form does the addition
		 * first; the postfix form evaluates to the old value of the variable.
		 * 
		 * */
		
//		int m = 7;
//		int n = 7;
//		int a = 2 * ++m; // now a is 16, m is 8
//		int b = 2 * n++; // now b is 14, n is 8
//		
		/*
		 * We recommend against using ++ inside expressions because this often lead to confusing code and annoying bugs.
		 * 
		 * */
//		------------------------------------------------------------------------------------------------------------------
		
		/*
		 * 7. Relational and boolean operators
		 * 
		 * Test for equality, use a double equal sign (==),
		 * Use != for inequality.
		 * Finally, you have the usual < (less than), > (greater than), <= (less than or equal),
		 * and >= (greater than or equal) operators.
		 * 
		 * Use && for the logical "and" operator and || for the logical "or" operator.
		 * 
		 * As you can easily remember from the != operator, the exclamation point ! is the logical negation operator.
		 * 
		 * */
		
//		System.out.println(7 == 3); // false
//		System.out.println(7 != 3); // true
		
//		int x = 3;
//		int y = 7;
		
//		if (x > 0 && y > 0) {
//			System.out.println("Both x and y are greater than zero.");
//		}
		
//		if (x > 5 || y > 5) {
//			System.out.println("Either x or y is greater than five.");
//		}
		
//		if (x != y) {
//			System.out.println("x is not equal to y.");
//		}
		
		/*
		 * The && and || operators are evaluated in "short circuit" fashion: Then second argument
		 * is not evaluated if the first argument already determines the value. If you combine two
		 * expressions with the && operator, 
		 * 
		 * 		expression_1 && expression_2
		 * 
		 * and the truth value of the first expression has been determines to be false, then it is 
		 * impossible for the result to be true. Thus, the value for the second expression is not 
		 * calculated.This behavior can be exploited to avoid errors. For example, in the expression
		 * 
		 * 		x != 0 && 1 / x > x + y // no division by zero.
		 * 
		 * the second part is never evaluated if x equals zero. Thus, 1 / x is not computed if x is zero,
		 * and no divide-by-zero error can occur.
		 * 
		 * Similarly, the value of expression_1 || expression_2 is automatically true if the first 
		 * expression is true, without evaluating the second expression.
		 * 
		 * */
		
		/*
		 * Finally, Java supports the ternary ?: operator that is occasionally useful. The expression
		 * 
		 * 		condition ? expression_1 : expression_2
		 * 
		 * evaluates to the first expression if the condition is true, to the second expression otherwise.
		 * For example:
		 * 	
		 * 		x < y ? x : y
		 * 
		 * gives the smaller of x and y.
		 * 
		 */
		
//		int x = 15;
//		int y = 10;
//		int min = x < y ? x :  y;
//		System.out.println("Min = " + min);
		
		
	}
}




































