package com.api.contents;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 
 * The purpose of a PrintWriter object is to print data types and objects to a character
 * stream. The PrintWriter class contains the same print and println methods as
 * PrintStream (the data type of System.out and System.err ), except that PrintWriter
 * outputs data as characters instead of bytes.
 */
public class PrinterWriterClass {
	
	public static void main(String[] args) throws IOException{
		
		int i = 19;
		String s = "Hi";
		
		FileInputStream readFile = new FileInputStream("C:\\Users\\jelica60589\\Desktop\\Example.txt");
		BufferedReader bf = new BufferedReader(new InputStreamReader(readFile));
		
		FileWriter fileWriter = new FileWriter ("C:\\Users\\jelica60589\\Desktop\\Example11.txt");
		//create a printwriter object
		PrintWriter print = new PrintWriter(fileWriter);
		String a;
		while ((a = bf.readLine()) != null){
			System.out.println(a);
			print.println(a); //this will write the text from readFile to the FileWriter
			//print.print(s);		
		}
		print.println(i);
		print.close();
		fileWriter.close();
	}
}
