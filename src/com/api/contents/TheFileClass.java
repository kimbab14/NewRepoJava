package com.api.contents;

import java.io.File;


/**
 * 
 * The File class represents the pathname of a file or directory, and the class contains
 * useful methods for determining information about the file or directory. Some uses of the
 * File class include the following:
 * - Determining if a file exists using the exists method, which returns a boolean
 * - Determining if a file can be read from, written to, or executed using the 
 *   respective canRead , canWrite , or canExecute methods
 * - Creating a new file using the createNewFile method
 * - Making a new directory using the mkdir method
 * - Deleting a file or directory using the delete method
 * - Listing the contents of a directory using the list and listFiles methods
 *
 * Java File class represents the files and directory pathnames in an abstract manner.
 * This class is used for creation of files and directories, file searching, file deletion etc.
 * 
 */
public class TheFileClass {
	
	public static void main (String[] args){
		//check if the file exist
		//File file = new File ("C:\\Users\\jelica60589\\Desktop\\Example2.txt");
		//boolean bool = file.exists();
		
		//if (bool == true){
		//	System.out.println("File found");
		//	long length = file.length();
		//	System.out.println(length);//can read the length
		//} else{
		//	System.out.println("File nto Found");
		//}
		
		//create a new directory if the file doesn't exist
		//File newFile = new File("C:\\Users\\jelica60589\\Desktop\\NewDir");
		//boolean bool1 = newFile.exists();
		
		//if (bool1 == true){
		//	System.out.println("Directory found");
		//}else{
		//	boolean dirCreated = newFile.mkdir();
		//	System.out.println("Directory not found");
		//	System.out.println("Created a new directory");
		//}

		//rename file - doesnt work for now
		//File renameFile = new File("C:\\Users\\jelica60589\\Desktop\\test1.txt");
		//boolean bool2 = renameFile.exists();
		//System.out.println(bool2);
		
		//if(bool2 == true){
		//	boolean success = renameFile.renameTo(new File("C:\\Users\\jelica60589\\Desktop\\test2.txt"));
		//System.out.println( success);
		//		if (success == true){
		//			System.out.println("Success on renaming the file");
		//		}else{
		//			System.out.println("Failed on renaming the file");
		//		}
		//}else {
		//	System.out.println("The file doesnt exists...");
		//}
		
		//delete file - working
		//File Delfile = new File("C:\\Users\\jelica60589\\Desktop\\test1.txt");
		//boolean success1 = Delfile.delete();
		//System.out.println(success1);
		
		//read list of files in directory
		//
		File readFile = new File("C:\\Users\\jelica60589\\Desktop");
		String[] fileNames = readFile.list();
		File [] files = readFile.listFiles();		
	}
}
