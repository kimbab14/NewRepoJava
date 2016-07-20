package com.api.contents;

/**
 * This is an example of Wrapper class.
 * The wrapper classes are defined in the java.lang package and are used in
 * situations where an object is required but the data is a primitive type. 
 * The primitive type is "wrapped" into an object and can be "unwrapped" 
 * whenever the primitive value is needed. There is a wrapper class in the java.lang 
 * package for each of the eight primitive types:
 * 
 * Byte This type wraps a byte.
 * Short This type wraps a short.
 * Integer This type wraps an int.
 * Long This type wraps a long.
 * Float This type wraps a float.
 * Double This type wraps a double.
 * Character This type wraps a char.
 * Boolean This type wraps a boolean.
 * Wrapper classes have the following properties
 * 
 * The wrapper classes convert primitive into object and object into primitive.
 * primitive data types are not an object in java.
 * 
 * autoboxing refers to the compiler automatically converting a primitive type into its corresponding
 * wrapper class.
 * 
 * unboxing refers to the compiler automatically unwrapping a primitive type from its wrapper object.
 *
 */
public class PrimativeWrapperClasses {
	
	public static void main(String[] args) {
		/*
		 * the int data type x is converted to Integer object and can be used now 
		 * wherever the x is required object.
		 */
		int x = 10;
		//this will convert the primitive type to object Integer.
		Integer y = new Integer(x); //autoboxing
		
		//System.out.println(y*y);
	
		//to get back the the int from Integer object
		int z = y.intValue(); // unboxing
			System.out.println(z*z);
		
		//String
		String a = "6";
		//parse the string argument as a Integer and then convert the 
		//Integer object into int perimitive. 
		int b = Integer.parseInt(a);
	
		try{
			if (b == (int)b){
				System.out.println(b + " == " + b );
			}
		}catch (NumberFormatException e){
			e.printStackTrace();
		}
	}	
}
