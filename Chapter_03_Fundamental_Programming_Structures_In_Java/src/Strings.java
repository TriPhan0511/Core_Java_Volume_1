
public class Strings {

	public static void main(String[] args) {

		/*
		 * Conceptually, Java strings are sequences of Unicode characters. 
		 * Java does not have a built-in string type. Instead, the standard Java library contains
		 * a predefined class called, naturally enough, String. Each quoted string is an instance
		 * of the String class.
		 * 
		 * */
		
//		String e = ""; // an empty string
//		String greeting = "Hello";
//		
//		System.out.println(e);
//		System.out.println(greeting);
		
		/*
		 * 1. Substrings
		 * 
		 * You can extract a substring from a larger string with the substring method of
		 * the String class. 
		 * 
		 * */
		
//		String greeting = "Hello";
//		
//		String s = greeting.substring(0, 3); // Hel
//		System.out.println(s);
//		
//		System.out.println(greeting.substring(2));
		
		/*
		 * There is one advantage to the way substring works: Computing the length of the substring is easy.
		 * The string s.substring(a, b) always has length b - a. For example, the substring "Hel" has length 3 - 0 = 3.
		 * 
		 * */
//		-------------------------------------------------------------------------------------------------------------------------
		
		/*
		 * 2. Concatenation
		 * 
		 * Java, like the most programming languages, allows you to use + to join (concatenate) two strings.
		 * 
		 * */
		
//		String expletive = "Expletive";
//		String PG13 = "deleted";
//		
//		String message = expletive + PG13; // "Expletivedeleted"
//		System.out.println(message);
//		
//		String message2 = expletive + " " + PG13; // "Expletive deleted"
//		System.out.println(message2);
		
		/*
		 * When you concatenate a string with a value that is not a string, the latter is converted to a string.
		 * (As you can see in tha Chapter 5, every Java object can be converted to a string.)
		 * 
		 * */
		
//		int age = 13;
//		String rating = "PG" + 13; // "PG13"
//		System.out.println(rating);
		
		/*
		 * If you need to put multiple strings together, separated by a delimeter, use the static join method: 
		 * 
		 * */
		
//		String all = String.join(" / ", "S", "M", "L", "XL"); // "S / M / L / XL"
//		System.out.println(all);
		
		/*
		 * As of Java 11, there is a repeat method:
		 * */
		
//		String repeated = "Java".repeat(3); // JavaJavaJava
//		System.out.println(repeated);
//		-------------------------------------------------------------------------------------------------------------------------
		
		/*
		 * 3. Strings Are Immutable
		 * 
		 * The String class gives no methods that let you change a character in an existing string.
		 * If you want to turn greeting from "Hello" to "Help!", you cannot directly change the last positions 
		 * of greeting into 'p' and '!'. The solution is concatenating the substring that you want to keep with
		 * the characters that you want to replace.  
		 * 
		 * 
		 * 
		 * */
		
//		String greeting = "Hello";
//		
//		greeting = greeting.substring(0, 3) + "p!"; // "Help!"
//		System.out.println(greeting);
		
		/*
		 * Since you cannot change the individual characters in a Java string, the documentation refers to the
		 * objects of the String class as immutable. Just as the numer 3 is always 3, the string "Hello" will
		 * always contain the code-unit sequence for the characters H, e, l, l, o. You cannot change these values.
		 * Yet you can, as you just saw, change the contents of the string variable greeting and make it refer to
		 * a different string, just as you can make a numeric variable currently holding the value 3 hold the value 4.
		 * 
		 * */
		
//		----------------------------------------------------------------------------------------------------------------------------------------
		
		/* 4. Testing Strings for Equality */
		
		/*
		 * To test whether two strings are equal, use the equals method. The expression:
		 * 
		 *  	s.equals(t)
		 *  
		 *  returns true of the string s and t are equal, false otherwise. Note that s and t can be string valriables or
		 *  string literals
		 * 
		 * */
		
//		String greeting = "Hello";
//		System.out.println("Hello".equals(greeting)); // true
//		System.out.println(greeting.equals("hello")); // false
		
		/*
		 * To test 
		 * 
		 * 
		 * */
		
	}

}




























