package com.triphan.strings;

// Methods:
// 1. Using naive approach
// 2. Using String.toCharArray() method
// 3. Using CharacterIterator
// 4. Using StringTokenizer
// 5. Using String.split() method
// 6. Using Guava library
// 7. Using String.chars() method
// 8. Using Code Points

public class StringTraversing {

	public static void main(String[] args) {
		
//		String s = "Hello, world!";
//		
////		Calls the method name toCapitalize
//		System.out.println(toCapitalize(s));
		
////		Calls the method named traverseString
//		traverseString(s); // H e l l o , w o r l d !
		
//		String s = "H    ello";
//		System.out.println("0123456789");
//		System.out.println(s);
//		s = s.strip();
//		System.out.println(s);
		
//		for (int i = 0; i < s.length(); i++) {
//			if ( i + 2 <= s.length()) {
//				String current = s.substring(i, i + 1);
//				String next = s.substring(i + 1, i + 2);
//				
//				if (current.equals(" ") && next.equals(" ")) {
//					s = s.substring(0, i) + s.substring(i + 1);
//				}
//			}
//			
//		}
//		System.out.println("0123456789");
//		System.out.println(s);
		
//		String s = "Hello";
//		int i = 0;
//		while (i < 5) {
//			System.out.print(s.substring(i, i + 1) + " ");
//			i++;
//		}
		
		String s = "H    el			lo";
		s = s.strip();
		System.out.println("0123456789");
		System.out.println(s);
		
		int i = 0;
		while ((i + 2) <= s.length() && i < s.length()) {
			String current = s.substring(i, i + 1);
			String next = s.substring(i + 1, i + 2);
			if (current.equals(" ") && next.equals(" ")) {
				s = s.substring(0, i) + s.substring(i + 1);
			} else {
				i++;
			}
		}
		
		System.out.println("0123456789");
		System.out.println(s);
		
		
	}
	
//	Method 1: Using naive approach
	static void traverseString(String str) {
//		Traverse the string
		for (int i = 0; i < str.length(); i++) {
//			Print current character
			System.out.print(str.charAt(i) + " ");
		}
	}
	
//	Method: Capitalize an input string
	static String toCapitalize(String str) {
		for (int i = 0; i < str.length(); i++) {
			String ch = str.substring(i, i + 1);
			if (ch.equals(" ")) {
				String upperChar = str.substring(i + 1, i + 2).toUpperCase();
				str = str.substring(0, i + 1) + upperChar + str.substring(i + 2);
			}
		}
		return str;
	}

////	Method: Reduce the white space
//	static String reduceWhiteSpace(String str) {
//		str = str.strip();
////		Traverse the string
//		for (int i = 0; i < str.length(); i++) {
//			String current = str.substring(i, i + 1);
//			String next = str.substring(i + 1, i + 2);
//			
//		}
//	}
}






















