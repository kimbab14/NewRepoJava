package com.api.contents;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The FileReader and FileWriter classes are used for reading 
 * and writing character data from files.
 */
public class FileReaderAndFileWriter {
	
	public void myMethod(){
		/*
		 * This section is for the fileWriter
		 */
		//create and write data into a file using FileWriter
		File file = new File ("C:\\Users\\jelica60589\\Desktop\\Example.txt");
		try {
			file.createNewFile();//use the createNewFile() method.
			//create a new FileWriter Object
			FileWriter writer = new FileWriter(file);
			//write some content in the file 
			writer.write("Please write me this new task \n");
			writer.write("And this on the new line");
			writer.flush();
		    writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		/*
		 * this section is for the filereader
		 */
		try {
			/*
			 * Create a FileReader object and read the file which is in the directory
			 * if its not in the directory it will thorw a File Not Found Exception error
			 */
			FileReader fr = new FileReader("C:\\Users\\jelica60589\\Desktop\\Example.txt");
			//read the file 
			BufferedReader br = new BufferedReader(fr);
			String txt = br.readLine();
			while(txt != null){
				String a = txt;
				txt = br.readLine();
				System.out.println(a);
			}
			br.close();
		}catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		FileReaderAndFileWriter fw = new FileReaderAndFileWriter();
		fw.myMethod();
	}
}
