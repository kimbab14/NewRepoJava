package com.collectionsandgenerics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * a generic wildcard generic type is an unknown generic represented with
 * a question mark, ?.
 * You can use generic wildcards in three ways:
 * - ? , an unbounded wildcard
 * - ? extends type, a wildcard with an upper bound
 * - ? super type, a wildcard with a lower bound
 * @author jelica60589
 *
 * */

public class GenericWildcard {

	public static void main(String[] args) {
		ArrayList<Number> b = new ArrayList<Number>();
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		getList(b);
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("hello");
		getList(str);
		
		ArrayList<Integer> str1 = new ArrayList<Integer>();
		str1.add(1);
		getList(str1);
		System.out.println("Str1 value:" + str1);
		
		
		Set<String> tm = new HashSet<String>();
		tm.add("i am a set");
		tm.add("hi, i am the second set");
		tm.addAll(tm);
		getSet(tm);
				
		/**
		 * Upper-Bound Wildcardds
		 * If you want a reference that can refer to an ArrayList whose generic is any 
		 * Number (including subclasses of Number), you need to use upper-bound wildcards.
		 * 
		 */
		ArrayList<? extends Number> l = new ArrayList<Integer>();
	}
	
	/**
	 * Unbounded wildcards
	 * The unbounded wildcard represents any data type, similar to the < T > syntax. Use the ?
	 * in situations where you do not need a formal parameter type like < T > .
	 * 
	 */
	
	public static void getList(List<?> list){
		for (Object lists: list){
			System.out.println(lists);
		}
	}
	
	public static void getSet(Set<?> set){
		for (Object sets : set){
			System.out.println(sets);
		}
	}
	
	public static void getQueue(Queue<?> que){
		
	}

}
