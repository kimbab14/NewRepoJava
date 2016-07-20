package com.flowcontrol;

/*
 * This is an example of switch statement
 * Note: without using the break;
 * it will show all the print output
 * break statement - breaks the logic flow of the statement.
 */
public class SwitchGradingSystem {
	
	public void getGrade(String userGrade){
		switch(userGrade){
			case "A": 
				System.out.println("Excelent!");
				break;
			case "B":
				System.out.println("Very Good");
				break;
			case "C":
				System.out.println("Average");
				break;
			case "D":
				System.out.println("Below Average");
				break;
			case "F":
				System.out.println("Failed");
			}
	}
	
	public static void main(String[] args) {
		SwitchGradingSystem gradingSystem = new SwitchGradingSystem();
		gradingSystem.getGrade("F");
	}
}
