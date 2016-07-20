package com.collectionsandgenerics;

/**
 * The Comparable interface in the java.util package creates an ordering for a collection of
 * objects by providing a method to compare two objects. The Comparable interface contains
 * only one method:
 * 
 * public int compareTo(T o)
 * 
 * Zero The two objects are equal.
 * Negative This object is less than the specified object o .
 * Positive This object is greater than the specified object o .
 * 
 * @author jelica60589
 * 
 */
public class ComparableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hi";
		String b = "hello how are you";
		int c = a.compareTo(b);
		//System.out.println(a.compareTo(b));
		
		ComparableInterface ci = new ComparableInterface();
		ci.difference();
	}
	
	/**
	 * The difference between == and equals
	 * 
	 * The == operator compares if two references point to the same
	 * object, and the equals method uses your own business logic to
	 * determine if two objects are equal.
	 */
	
	public void difference(){
		 String s1 = new String( "Test" );
	     String s2 = new String( "Test" );
	     
	     System.out.println( s1 == s2 ); // false
	     System.out.println( s1.equals( s2 )); // true
	}
	
}
