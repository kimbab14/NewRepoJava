package com.flowcontrol;

/*
 * This is a example of the continue statement 
 * if i is not equal to 3 then continue the outer loop 
 * else print the statement.
 */
public class ContinueStatement {
	
	public void myMethod(){
		
		for (int i = 0; i <= 3; i++){
			if (i != 3){
				continue;	
			}
			System.out.println(i + " is equal to 3");
		}
	}
	
	public static void main(String[] args) {
		ContinueStatement cont = new ContinueStatement();
		cont.myMethod(); 
	}
}
