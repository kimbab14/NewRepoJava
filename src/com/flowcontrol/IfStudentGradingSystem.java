package com.flowcontrol;

/*
 * This is an If Statement flow control example
 * it will take a grade percentage as input and will 
 * show if the student got A, B, C , D or Fail.
 * 
 * */

public class IfStudentGradingSystem {
	
	/*
	 * Get user grade and print out if the student
	 * got A, B, C , D or Fail.
	 * 
	 */
	public void getGrade(int userGrade){
		if(userGrade >= 70 ){
			System.out.println("Your grade is A, Excelent!");
		}
		else if (userGrade >=60 && userGrade <= 69){
			System.out.println("Your grade is B, Very Good");
		}
		else if (userGrade >= 50 && userGrade <= 59){
			System.out.println("Your grade is C, Average");
		}
		else if (userGrade >= 40 && userGrade <= 49){
			System.out.println("Your grade is D, Below Average");
		}
		else
			System.out.println("Your grade is F, Failed");
	}
	
	public static void main(String[] args) {
		IfStudentGradingSystem objGradingSystem = new IfStudentGradingSystem();
		objGradingSystem.getGrade(39);
	}

}
