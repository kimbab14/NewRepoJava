package com.api.contents;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 
 * The java.text.DateFormat class is an abstract class that formats and parses dates and
 * times for a specific locale.
 *
 */
public class FormatAndParseDate {
	
	 public static void main(String[] args) throws ParseException {
	    
		 /*  
	      * DateFormat.parse Method
	      * The DateFormat class contains the following parse method for parsing strings into dates:
	      * public Date parse(String source) throws ParseException .
	      * 
	      */

		 String date_s = "2016-06-30 09:00:00.0";
	     
		 SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	     Date date = dt.parse(date_s); //parse string to date.
	        
	     //this format the string without the time
	     SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
	     System.out.println(dt.format(date));
	     
	     /*
	      * you can also use locale to get the format of the date
	      */
	     DateFormat de = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.GERMAN);
	     DateFormat uk = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.UK);
	     DateFormat jp = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.JAPAN);
	     System.out.println("Japan Date Format: " + jp.format(date));
	     System.out.println("UK Date Format: " + uk.format(date));
	     System.out.println(de.format(date));
	 }
}
