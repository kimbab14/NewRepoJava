package com.api.contents;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ” InputStream ” or “ OutputStream ” , together with a set of classes that end in 
 * “ Reader ” and “ Writer ” .
 * The stream classes are used for inputting and outputting all types of binary data.
 * 
 * The reader and writer classes are used exclusively for inputting and outputting
 * character and string data.
 * 
 * low - level stream and a high - level stream:
 * Low - level input and output streams connect to the source of the data.
 * High - level input and output streams are chained to an existing stream. 
 * Most high - level streams filter the data and convert it into Java data types.
 * 
 * High- level stream cannot exist on its own. It is a high - level stream so it must be attached to an existing
 * stream.
 */

public class InputAndOutput {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader ("C:\\Users\\jelica60589\\Desktop\\Example.txt");
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		}
		int c = 0;
		try {
			while((c = fr.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
