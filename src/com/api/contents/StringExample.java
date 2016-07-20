package com.api.contents;

/**
 * This is a String example
 * A string is a sequence of character. 
 * 
 * StringBuffer and StringBuilder class
 * The two classes have the exact same method signatures and constructor parameters. 
 * The only difference between them is that StringBuffer is thread - safe and StringBuilder is not. 
 * 
 * If you are working with arrays of characters in a multithreaded application, use the StringBuffer
 * class. Otherwise, if threads are not an issue for your particular situation, use the String-
 * Builder class. 
 *
 */
public class StringExample {
	String s = "Hello world";
	
	//concatenation
	static String a = "Hi! my name is " + "Name";
	
	public static void main(String[] args) {
		System.out.println(a);
		
		StringBuffer sb = new StringBuffer("Hi");
		sb.append(" hello");
		sb.reverse();
		System.out.println(sb);
	}	
}
