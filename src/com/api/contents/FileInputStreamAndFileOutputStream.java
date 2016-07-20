package com.api.contents;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/**
 * 
 * The FileInputStream and FileOutputStream classes represent low - level streams that read and
 * write byte streams from files.
 * 
 * ##########################################
 * Note: you can use
 * ByteArrayOutputStream - Java ByteArrayOutputStream class is used to write data into multiple 
 * files. In this stream, the data is written into a byte array that can be written to multiple 
 * stream.The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.
 * The buffer of ByteArrayOutputStream automatically grows according to data. 
 * ###########################################
 */
public class FileInputStreamAndFileOutputStream {
	
	public static void main(String[] args) {
		try{
			//this will read the file
			FileInputStream readFile = new FileInputStream("C:\\Users\\jelica60589\\Desktop\\Example2.txt");
			//read text from the input stream which is the readFile
			BufferedReader bf = new BufferedReader(new InputStreamReader(readFile));
			
			int s;
			//this will output the data and create a new file in the following location
			FileOutputStream out = new FileOutputStream ("C:\\Users\\jelica60589\\Desktop\\Output.txt");
			
			while ((s = bf.read()) != -1){	
				//byte[] b = s.getBytes();
				//ByteArrayOutputStream bout=new ByteArrayOutputStream();
				//bout.write(b);
				//bout.writeTo(out);
				out.write(s);
				//System.out.println(s);
			}
			bf.close();
			out.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
}
