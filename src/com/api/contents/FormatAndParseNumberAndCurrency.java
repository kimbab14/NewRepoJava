package com.api.contents;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * 
 * The java.text.NumberFormat class is the abstract parent class of the number formatting
 * classes. The class contains static methods for getting appropriate formatter instances based
 * on the type of number you are formatting. For example, if you want to format currency,
 * use the static getCurrencyInstance method. Because formatting currency varies depending
 * on the language and culture of the users of your program, you can also specify the locale of
 * your specific users. Use a java.util.Locale object to represent your desired locale.
 *
 */
public class FormatAndParseNumberAndCurrency {

	public static void main(String[] args) {
		//creating a number format
		NumberFormat numberformat = NumberFormat.getInstance(Locale.GERMAN);
		NumberFormat numberformat1 = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
		double a = 100.99;
		
		
		//Decimal format
		double k = 12335325345435535345.3532532532532;
		DecimalFormat decimal = new DecimalFormat("###,###,###.00000000");
		System.out.println(decimal.format(k));
		
		
		System.out.println(numberformat.format(a));
		System.out.println(numberformat1.format(a));
		
		//parse method
		//parse method is used to parse a string into number.
		/*
		 * The parse method only parses the beginning of a string. After it reaches a character that
		 * cannot be parsed, the parsing stops and the value is returned.
		 */
		
		String x = "1123,67";
		String y = "fasfjas99898,t7we7897";
		String z = "2323x,2323";
		try {
			System.out.println(numberformat.parse(x));
			System.out.println(numberformat.parse(z));
			System.out.println(numberformat.parse(y)); //because the beginning of the string cannot be parsed. 
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
