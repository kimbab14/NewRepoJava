package com.api.contents;

import java.io.Console;

/**
 * Java Console class is used outside IDE
 * this needs to be run in the console 
 * not with the use of IDE - 
 * 
 */
public class ConsoleClass {

	public static void main(String[] args) {
		Console console = System.console();  
		System.out.println("Please enter a number");
		String input = console.readLine();
		System.out.println(input);
	}
}
