package com.flowcontrol;

/**
 * Examples of Java API Exceptions and Errors.
 * - ArrayIndexOutOfBoundsException
 * - ClassCastException
 * - IllegalArgumentException
 * - IllegalStateException
 * - NullPointerException
 * - NumberFormatException
 * - AssertionError
 * - ExceptionInInitializerError
 * - StackOverflowError
 * - NoClassDefFoundError
 * 
 */
public class JavaExceptionsExample {

	private int [] number =  {1, 2, 3, 4,5}; //declare an arrays
	
	/*
	 * This exception is thrown by the JVM when your code
	 * uses an illegal index to access an array.
	 */
	public void arrayIndexOutOfBound(){
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(number[i]);
			}
		//this will catch the exception
		}catch (ArrayIndexOutOfBoundsException e) {
	         e.printStackTrace();
	    } 
	}
	
	
	/*
	 * This exception is thrown by the JVM when an object is cast to a data type
	 * that the object is not an instance of. Cannot cast an object to a incompatible 
	 * data type.
	 */
	public void classCastException(){
		
	}
	
	/*
	 * This exception is thrown programmatically to indicate that a
	 * method has been passed an illegal or inappropriate argument
	 */
	public void illegalArgumentExpressin(){
	
	}
	
	/*
	 * This exception is thrown programmatically when a method has
	 * been invoked while the program is in an inappropriate state.
	 * An IllegalStateException is thrown programmatically when a method is invoked and the
	 * program is not in an appropriate state for that method to perform its task. 
	 * This typically happens when a method is invoked out of sequence, or perhaps
	 * a method is only allowed to be invoked once and an attempt is made to invoke it again.
	 */
	@SuppressWarnings("unused")
	public void illegelStateExemption(){
		 String x = null,y = "10";
			int result = 0;
			try{
				if (x == null || y == null  ){
					throw new IllegalStateException("Enter number first");
				}
				else{
					result = Integer.parseInt(x) + Integer.parseInt(y);
					System.out.println(result);
				}
			}catch (IllegalStateException e){
				e.printStackTrace();
			}
	}
	
	/*
	 * This exception is thrown by the JVM when an attempt is made to
	 * use a null reference where an object is required.
	 */
	public void nullPointerException(String x){		
		System.out.println(x.length()); // here is the error.
	}
	
	/*
	 * This exception is thrown programmatically when an attempt
	 * is made to convert a string to a numeric type, but the string
	 * does not have the appropriate format. 
	 */
	public void numberFormatException(String x){
		int y = Integer.parseInt(x);
		System.out.println(y);
	}
	
	/*
	 * This exception is thrown by the JVM when an assert statement fails.
	 */
	public void assertionError(){
		//see assert example for this one.
	}
	
	/*
	 * This exception is thrown by the JVM when an unexpected
	 * exception occurs in a static initialiser.
	 */
	public void excpetionInInitializerError(){
		
	}
	
	/*
	 * This exception is thrown by the JVM when the method call stackoverflows.
	 * due to method recursion that does not end, keep looping a method and it will give
	 * you a stackoverflowerror.
	 */
	public void stackOverflowError(){
		int x = 0;
		
		while (x < 1 ){
			System.out.println(x++);
			stackOverflowError();
		}
	}
	
	/*
	 * This exception is thrown by the JVM or ClassLoader when a
	 * class needs to be loaded but no definition of the class can be found.
	 * if for example Noclass class is not in the classpath and you try to run 
	 * that class, it will throw an error NoClassDefFoundError.
	 */
	public void noClassDefFoundError(){
		
	}
	
	
	public static void main(String[] args) {
		JavaExceptionsExample exp = new JavaExceptionsExample();
		//exp.arrayIndexOutOfBound();
		//exp.nullPointerException(null);
		//exp.numberFormatException("Note");
		//exp.stackOverflowError();
		exp.illegelStateExemption();
	}
}
