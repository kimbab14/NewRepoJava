package com.api.contents;

import java.io.PrintWriter;

/**
 * This is the example of Format and Printf Methods
 * The format method of a PrintWriter object writes a formatted string to the stream using
 * a specified format string and arguments.
 * 
 * The Format Specifiers
 * - %b Specifies a boolean
 * - %c Specifies a character
 * - %d Specifies an integer number
 * - %f Specifies a decimal number
 * - %s Specifies a string
 * 
 * The java.io.PrintWriter.printf() method is a convenience method to write a formatted 
 * string to this writer using the specified format string and arguments. 
 * If automatic flushing is enabled, calls to this method will flush the output buffer.
 * 
 * printf and format are the same on function.
 */
public class FormatAndPrintf {

	public static void main(String[] args) {
		/**
		 * Example of format and printf.
		 */
		 String s = "Format me";
	      try {

	         // create a new writer
	         PrintWriter pw = new PrintWriter("C:\\Users\\jelica60589\\Desktop\\Example13.txt");
	         
	         // %s indicates a string will be placed there, which is s
	         //pw.format("%s", s);
	         pw.printf("%s", s);

	         // change line
	         pw.println();
	         
	         // %d indicates a integer will be placed there, which is 100
	         //pw.format("%s with %s", s, "hello!");
	         pw.printf("%s with %s", s, "hello!");

	         // flush the writer
	         pw.flush();

	      } catch (Exception ex) {
	         ex.printStackTrace();
	      } 
	   //end of the Format example
	      
	   
	}

}
