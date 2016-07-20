package com.flowcontrol;

import java.util.ArrayList;

/**
 * This is an example of Enhanced for statement
 * where I used Arraylist to show the student information
 */
public class EnhancedForStatement {
	
	public static void main(String[] args) {
		ArrayList<String> lsStudentInfo = new ArrayList<String>();
		lsStudentInfo.add("Student1");
		lsStudentInfo.add("Student2");
		lsStudentInfo.add("Student3");
		
		for (String students : lsStudentInfo){
			System.out.println(students);
		}
	}
}
