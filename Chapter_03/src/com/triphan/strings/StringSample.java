package com.triphan.strings;

public class StringSample {

	public static void main(String[] args) {
		
		/* The String class*/
		
//		String e = ""; // An empty string
		
//		String greeting = "Hello";
//		System.out.println(greeting.getClass().getSimpleName()); // String
//		System.out.printf("%s", greeting); // Hello
		
		/* 1. Substrings */
		
//		(Use the substring(int beginIndex, int endIndex) method)
		
//		Extract a substring from a larger string by using the substring method of the String class
//		String greeting = "hello";
//		
//		String s1 = greeting.substring(2); // "llo"
//		System.out.println(s1);
//		
//		System.out.println(greeting.substring(1, 4)); // "ell"
		
//		-----------------------------------------------------------------------------------------------------------
		
		/* 2. Concatenation */
		
//		(Use + (plus))
		
//		Java allows you to use + to join (concatenate) two strings.
//		String s1 = "Hello";
//		String s2 = "World";
//		System.out.println(s1 + " " + s2); // Hello World
		
//		When you concatenate a string with a value that is not a string, the latter is converted to a string
//		(every Java object can be converted to a string)
//		int age = 13;
//		String rating = "PG" + age;
//		System.out.println(rating); // PG13
		
//		If you need to put multiple strings together, seperated by a delimiter, use the static join method:
//		String all = String.join("/", "S", "M", "L", "XL");
//		System.out.println(all); // S/M/L/XL
		
//		As of Java 11, there is a repeat method
//		System.out.println("Hello".repeat(3)); // HelloHelloHello
		
//		-----------------------------------------------------------------------------------------------------------
		
		/* 3. Strings Are Immutable */
		
//		(Since you cannot change the individual characters in a Java string, the documentation refers to 
//		the objects of the String class as immutable.)
		
//		String greeting = "Hello";
//		greeting = greeting.substring(0, 3) + "p!";
//		System.out.println(greeting); // Help!
		
//		Access to a specific character in a string
//		String greeting = "Aloha";
//		System.out.println(greeting.substring(3, 4)); // h
				
//		-----------------------------------------------------------------------------------------------------------
		
		/* 4. Testing Strings For Equality */
		
//		(equals and equalsIgnoreCase methods)
		
//		To test whether two strings are equal, use the equals method.
//		String s1 =  "Hello";
//		String s2 = "Hello";
//		
//		if (s1.equals(s2)) {
//			System.out.println("Equal!");
//		}
		
//		if ("Aloha".equals(s1)) {
//			System.out.println("Equal");
//		} else {
//			System.out.println("Not equal!");
//		}
		
//		To test whether two strings are identical except for the upper/lowercase letter distinction,
//		use the equalsIgnoreCase method
//		if ("hello".equalsIgnoreCase("HElLo")) {
//			System.out.println("Equal!");
//		}
		
//		NOTE: Do not use the == operator to test whether two strings are equal!
//		It only determine whether or not the strings are stored in the same location.
//		Sure, if string are in the same location, they must be equal. But it is entirely possible
//		to store multiple copies of identical strings in different places.
		
//		-----------------------------------------------------------------------------------------------------------
		
		/* 5. Empty and Null Strings */
		
//		(str.length() == 0 or str.equals(""))
//		(str == null)		
		
//		The empty string "" is a string of length 0. 
//		You can test whether a string is empty by calling:
//			if (str.length() == 0)
//		or:
//			if (str.equals(""))
		
//		An empty string is a Java object which holds the string length (namely, 0) and an emty contents.
//		However, a String variable can also hold a special value, called null, that indicates that 
//		no objects is currently associated with the variable.
//		To test whether a string is null, use:
//			if (str == null)
		
//		Sometimes, you need to test that a string is neither null nor empty. Then use:
//			if (str != null || str.length() != 0)
		
//		NOTE: You need to test that str is not null first because it is an error to invoke a method on
//		a null value.
		
//		String s1 = "";
//		if (s1.length() == 0) {
//			System.out.println("It is an empty string.");
//		} else {
//			System.out.println("It is not an empty string.");
//		}
		
//		String s2 = null;
//		if (s2 == null) {
//			System.out.println("It is null");
//		} else {
//			if (s2.length() == 0) {
//				System.out.println("It is an empty string");
//			} else {
//				System.out.println("It is neither null nor empty.");
//			}
//		}
		
//		-----------------------------------------------------------------------------------------------------------
		
		/* 6. Code Points and Code Units*/
		
//		Java strings are a sequences of char values. And the char data type is a code unit for
//		representing Unicode points in the UTF-16 encoding.
//		The most commonly used Unicode characters can be represented with a single code unit.
//		The supplementary characters require a pair of code units.
		
//		The length method yields the number of code units required for a string in the UTF-16 encoding.
//		For exmaple:
		
//		String greeting = "Hello";
//		System.out.println(greeting.length()); // 5
//		
////		To get the true length - that is, the number of code points - call
//		int cpCount = greeting.codePointCount(0, greeting.length());
//		System.out.println(cpCount); // 5
		
//		The call s.charAt(n) returns the code unit at the position n, where n between 0 and s.length() - 1.
//		For example:
		
//		String greeting = "Hello";
//		char first = greeting.charAt(0); // H
//		char last = greeting.charAt(greeting.length() - 1); // o
//		
//		char ch = greeting.charAt(-1); // Raise an exception:  java.lang.StringIndexOutOfBoundsException
//		char ch2 = greeting.charAt(greeting.length()); // Raise an exception:  java.lang.StringIndexOutOfBoundsException
		
//		-----------------------------------------------------------------------------------------------------------
		
		/* 7. The String API */
		
		
////		char charAt(int index) : returns the code unit at the specified location.
////		Example:
//		String greeting = "Hello";
//		System.out.println(greeting.charAt(1)); // e
		
////		int compareTo(String other) : returns a negative value if the string comes before "other" in dictionary order,
////		a positive value if the string comes after "other" in dictionary order,
////		or 0 if the strings are equal.
////		Example:
//		String s1 = "b";
//		String s2 = "d";
//		System.out.println(s1.compareTo(s2)); // -2
//		s2 = "b";
//		System.out.println(s1.compareTo(s2)); // 0
//		s2 = "a";
//		System.out.println(s1.compareTo(s2)); // 1
		
////		boolean isEmpty() : returns true if the string is empty
////		Example:
//		String s = "";
//		if (s.isEmpty()) {
//			System.out.println("Empty!");
//		}
		
////		boolean isBlank() : returns true if the string is empty or consists of whitespace. (version 11)
////		returns true if the string is empty or consists of whitespace.
////		Example:
//		String s = "";
//		if (s.isBlank()) {
//			System.out.println("Empty or Blank");
//		}
//		s = " ";
//		if (s.isBlank()) {
//			System.out.println("Empty or Blank");
//		}
		
////		boolean equals(Object other) : returns true is the string equals "other". 
////		Example:
//		String s1 = "hello";
//		String s2 = "hello";
//		if (s1.equals(s2)) {
//			System.out.println("Equal");
//		}
//		s2 = "aloha";
//		if (!s1.equals(s2)) {
//			System.out.println("Not equal.");
//		}
		
////		boolean equalsIgnoreCase(String other) : returns true if the string equals "other", except for upper/lowercase distinction.
////		Example:
//		if ("hello".equalsIgnoreCase("HELLO")) {
//			System.out.println("Equal");
//		}
		
////		boolean startsWith(String prefix) : returns true if the string starts with "prefix"
////		Example:
////		if ("Hello".startsWith("He")) {
//			System.out.println("Yes");
//		}
		
////		boolean startsWith(String prefix, int toffset)
////		Example:
//		if ("Hello".startsWith("He", 1)) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

////		boolean endsWith(String suffix) : returns true if the string ends with "suffix"
//		if ("Hello".endsWith("lo")) {
//			System.out.println("Yes");
//		}
		
////		int indexOf(String str)
////		Example:
//		String s = "Hello, world";
//		System.out.println(s.indexOf("l")); // 2
//		System.out.println(s.indexOf("lo")); // 3
//		System.out.println(s.indexOf("z")); // -1
		
////		int indexOf(String s, int fromIndex)
////		Exampe:
//		String s = "Hello, world";
//		System.out.println(s.indexOf("o", 2)); // 4
//		System.out.println(s.indexOf("o", 4)); // 4
//		System.out.println(s.indexOf("o", 5)); // 8
		
////		int indexOf(int ch) : Returns the index within this string of the first occurence of the specified character
////		Example:
//		String s = "Hello, world";
//		System.out.println(s.indexOf('e')); // 1
//		System.out.println(s.indexOf('z')); // -1
		
////		Another example:
//		String s = "Alibaba";
//		System.out.println(s.indexOf(65)); // 0 (A -> 65)
//		System.out.println(s.indexOf(98)); // 3 (b -> 98)

////		int indexOf(int ch, int fromIndex) : Returns the index within this string of the first occurence of the specified character, 
////			starting the serach at the specified index.
////		Example:
//		String s = "Hello, world";
//		System.out.println(s.indexOf('o', 5)); // 8
		
////		int lastIndexOf(String str)
////		Example:
//		String s = "Hello, world";
//		System.out.println(s.lastIndexOf("o")); // 8
//		System.out.println(s.lastIndexOf("l")); // 10
		
//		int lastIndexOf(String str, int fromIndex): Returns the index within this string of the last occurence of the specified substring,
//			searching backward starting at the specified index.
//		Example:
//		String s = "Hello, world";
//		System.out.println(s.lastIndexOf("o", 9)); // 8
		
////		int lastIndexOf(int ch)
////		Example:
//		String s = "Hello, world";
//		System.out.println(s.lastIndexOf('l')); // 10
		
////		int lastIndexOf(int ch, int fromIndex)
////		Example:
//		String s = "Hello, world";
//		System.out.println(s.lastIndexOf('l', 11)); // 10
		
////		String toUpperCase()
////		Example:
//		String s = "aloha";
//		String s2 = s.toUpperCase();
//		System.out.println(s); // aloha
//		System.out.println(s2); // ALOHA

////		String toLowerCase
////		Example:
//		String s = "Aloha";
//		String s2 = s.toLowerCase();
//		System.out.println(s); // Aloha
//		System.out.println(s2); // aloha
		
////		String trim()
////		Example:
//		String s = "	Hello, world ";
//		System.out.println(s);
//		s = s.trim();
//		System.out.println(s);
//		
////		String strip() (version 11)
////		Example:
//		String s = "	Hello, world ";
//		System.out.println(s);
//		s = s.strip();
//		System.out.println(s);
		
////		String join(CharSequence delimiter, CharSequence... elements)
////		Example:
//		String all = String.join("-", "Java", "is", "cool");
//		System.out.println(all); // Java-is-cool
		
////		String repeat(int count)
////		Example:
//		String s = "Hello";
//		s = s.repeat(3);
//		System.out.println(s); // HelloHelloHello
		
		
		
		
		
	}
	
}































