package com.api.contents;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 
 * The Scanner class is a text scanner that can parse primitive data type and strings into
 * tokens. The delimiter for the tokens is either whitespace or a regular expression. The
 * source of the text can be from a String , File , or InputStream object. You can also assign a
 * Locale to a Scanner object.
 *
 * By default, the delimiter for parsing the text is whitespace. To assign a regular expressionc
 * as the delimiter, invoke one of the useDelimiter methods of Scanner :
 * - public Scanner useDelimiter(Pattern pattern)
 * - public Scanner useDelimiter(String pattern)
 * 
 * The Scanner class defines a collection of “ next ” and “ hasNext ” methods for parsing
 * tokens, including a version for strings and each of the primitive types.
 * 
 */
public class ScannerClass {
	
	/*
	 * this method is an example of 
	 * simple scanner class where it
	 * just check if the scanner scan
	 * still has next and then print
	 * the string.
	 */
	public void simpleScanner(){
	
		String a = "this is a simple example";
		Scanner scan = new Scanner(a);
		
		if (scan.hasNext()){
			System.out.println(a);
		}
	}
	
	/*
	 * This method is an example of 
	 * scanner with reg expression where scanner can use th e
	 * useDelimeter() method. 
	 * 
	 */
	public void regexScanner(){
		String b = "The 5 boxing wizards jump quickly.";
		String pattern = "\\s"; //whitespace regex
		
		Pattern p = Pattern.compile(pattern);
		Scanner sc = new Scanner(b).useDelimiter(p);
		
		while(sc.hasNext()) {
			String hasNext = sc.next();
			System.out.println(hasNext);
		}
	}
	
	/*
	 * UserInput is an example of 
	 * scanner for user input in the console.
	 * 
	 * A common use of the Scanner class is for keyboard input. Use System.in as the source
	 * of the text and the “ next ” methods wait for the user to input data.
	 * 
	 */
	public void userInput(){
		Scanner scn  = new Scanner (System.in);
		
		System.out.println("Please enter your full name:" );
		String fullName = scn.nextLine();
		System.out.println("Please enter your Nationality:");
		String nationality = scn.nextLine();
		
		System.out.println("Please enter your age:");
		//this check whether the inputed age is a number
		//while it is not a number show some error message
		while (!scn.hasNextInt()) {
            System.out.println("That's not a number!");
            scn.next(); // this is important! so user can still input something.
        }
        int age  = scn.nextInt();
        
		System.out.println("Please Enter the First Number:");
		int firstNum = scn.nextInt();
		System.out.println("Please Enter the Second Number:");
		int secondNum = scn.nextInt();
		int result = firstNum * secondNum;
		
		System.out.println("Full Name: " + fullName + "\nNationality: " + 
		nationality + "\nAge: " + age + "\nFIrst Number: " + firstNum + 
		"\nSecond Number: " + secondNum + "\nThe result for: "+ firstNum + "*" + secondNum + " is " + result);	
	}
	
	public static void main(String[] args){
		ScannerClass scanner = new ScannerClass();
	//	scanner.simpleScanner();
	//	scanner.regexScanner();
		scanner.userInput();
	}
}
