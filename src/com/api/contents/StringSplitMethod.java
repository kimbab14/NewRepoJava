package com.api.contents;

/**
 * The String class contains a method named split that takes in a regular expression and
 * splits the String object into an array of String objects. The signature of the split method
 * is public String [] split(String regex).
 * 
 * The split method is useful for parsing character sequences where the delimiter is
 * defined as a regular expression
 */
public class StringSplitMethod {
	
	/*
	 * this method will split the string using the regex "\\s" (whitespace) 
	 * which will create a new line of string. 
	 * 
	 */
	public void splitString(){
		String split = "Split this string for me please";
		String [] splitStrings = split.split("\\s");
		
		for (String splits : splitStrings){
			System.out.println(splits);
		}
	}
	
	public static void main(String[] args){
		StringSplitMethod obj = new StringSplitMethod();
		obj.splitString();
	}
}
