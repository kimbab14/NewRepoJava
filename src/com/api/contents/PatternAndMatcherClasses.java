package com.api.contents;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A regular expression is a sequence of characters that describes a pattern of characters.
 * The pattern describes a set of strings based on common characteristics. 
 * Java uses the Pattern and Matcher classes in the java.util.regex package for
 * using regular expressions in your Java applications.
 * 
 * A special set of characters called metacharacters is used to specify wildcards, 
 * repetition, ranges, and more.
 * 
 * Metacharacters of Regular Expressions:
 * . (dot) Any character -  Match the preceding character any number of times
 * + - Match the previous character one or more times
 * ? - Match the previous character 0 or 1 times only
 * \d - A digit 0–9
 * \s - A whitespace character
 * \w - A word character (any lowercase or uppercase letter, the underscore character, or any digit)
 * [ ] - Match anything inside the square brackets for one character position once
 * ( ) - Use parentheses for grouping together search expressions
 * and many more...
 */
public class PatternAndMatcherClasses {
	
	/*
	 * The Pattern class represents a compiled regular expression. You do not instantiate a Pattern
	 * object; instances are obtained from the static compile method defi ned in the Pattern
	 * class public static Pattern compile(String regex).
	 * 
	 * A Matcher object represents the engine that performs
	 * the actual parsing on the character sequence to see if it matches the pattern.
	 * 
	 * This method matches the matcher string to the patter. 
	 * will print match if the matcher finds a pattern.
	 */
	public void patternMethod() throws IOException{
		//string to be scanned..
		String regex = "hello";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("hello");
		
		if (matcher.matches()){
			System.out.println("Match");
		}else{
			System.out.println("Not Match");
		}
	}
	
	/*
	 * another example of the pattern and matcher which uses the metacharacters 
	 */
	public void patternMethod1(){
		//string to be scanned
		String scanned = "Hello! please find a match in this pattern 1 ";
		//the metacharacter pattern
		String pattern = "(.*)(\\d)(.*)";
		
		//Create a pattern object
		Pattern pt = Pattern.compile(pattern);
		
		//Create matcher object
		Matcher m = pt.matcher(scanned);
		if (m.find()){
			 System.out.println(m.group(0));
			 System.out.println("Found value: " + m.group(1) );
			 System.out.println("Found value: " + m.group(2) );
		}else{
			System.out.println("No matches found");
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		PatternAndMatcherClasses obj = new PatternAndMatcherClasses();
		//obj.patternMethod();
		obj.patternMethod1();
	}		

}
