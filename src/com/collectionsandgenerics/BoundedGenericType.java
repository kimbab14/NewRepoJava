package com.collectionsandgenerics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * This will now restrict the <T> into a list where we could use
 * ArrayList
 * LinkedList
 * Vector
 * Stack
 * A generic type parameter opens the door for any data type to be used as the generic type.
 * There might be situations where you want to use generics but also restrict the type used.
 * A bounded parameter type is a generic type that specifies a bound for the generic.
 * 
 * @author jelica60589
 *
 * @param <T>
 */

public class BoundedGenericType<T extends List> {
	
	public static void main(String[] args) {
		BoundedGenericType<ArrayList> b = new BoundedGenericType<ArrayList>();
		BoundedGenericType<LinkedList> c = new BoundedGenericType<LinkedList>();
		//if you try adding a different generic one like HashMap it will give you an error:
		//Bound mismatch: The type HashMap is not a valid substitute for the bounded 
		//parameter <T extends List> of the type BoundedGenericType<T>
		//BoundedGenericType<HashMap> d = new BoundedGenericType<HashMap>; //so this is an error.
	}
}
