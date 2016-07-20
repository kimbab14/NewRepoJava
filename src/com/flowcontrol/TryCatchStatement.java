package com.flowcontrol;

/**
 * 
 * This is an example of the Try and Catch statement
 * a numerator and divisor will be inputed as a parameter 
 * then will try to catch if the numerator is divisible by the divisor
 * if its not catch the error and throw an exception 
 * if the numerator is divisible then print the result.
 * 
 */
public class TryCatchStatement {
	
	public static void divisibleByZero(int numerator, int divisor){
	
		try{
			int result = numerator / divisor;
			System.out.println(result);
		}catch (ArithmeticException e){
			//System.out.println("Something went wrong : Cannot " + e.getMessage());
			e.printStackTrace();
		}
		//multiple catch statement
		catch (NullPointerException e){
			e.printStackTrace();
		}
		//this will execute whatever the result of the try and catch would be, whether an  
		//exception in the try and catch occur. 
		finally{
			System.out.println("Im out finally...");
		}
	}

	public static void main(String[] args) {
		divisibleByZero(10, 0);
	}

}
