package com.triphan.strings;

public class StringSample2 {

	public static void main(String[] args) {
		
//		String s = "hello, world. i am tri.";
		String s = "hello, world. i am tri. abad swdjs;fj sfsff     sff";
		
//		Calls the toCapitalize() method to capitalize the string
		s = toCapitalize(s);
		System.out.println(s);
	}
	
//	Method: Capitalize an input string
	public static String toCapitalize(String s) {
//		Split the input string into an array consists of some smaller strings
		String[] words = s.split(" ");
		s = "";
		for (int i = 0; i < words.length; i++) {
			String w = words[i];
			if (w.length() > 0) {
//				Capitalize the first character of each word
				words[i] = w.substring(0, 1).toUpperCase() + w.substring(1);
				s += words[i] + " ";
			}
			
		}
		
		return s;
	}

}







































