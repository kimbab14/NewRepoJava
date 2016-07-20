package com.collectionsandgenerics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * A set is a collection of elements that does not allow duplicates
 * and models the mathematical concept of abstract sets.
 * 
 * A set when you need a collection where duplicates are not allowed.
 *
 * The basic operations of Set include the ability to add or remove a single 
 * element or collection of elements, and to perform unions and intersections.
 * @author jelica60589
 *
 */
public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sets sets = new Sets();
		//sets.hashSet();
		//sets.linkedHashSet();
		sets.treeSet();
	}
	
	
	/**
	 * A set that stores its elements in a hash table. There is no ordering to the items,
	 * and HashSet uses the hashCode method of its elements to determine their placing in the set.
	 * doesn’t maintain any kind of order of its elements.
	 * 
	 */
	public void hashSet(){
		Set<String> set = new HashSet<String>();
		set.add("Element1");
		set.add("Element2");
		set.add("Element3");
		
		//access via iterator
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String element = iterator.next();
			System.out.println(element);
		}
	
		//access via for-loop
		for (String obj: set){
			System.out.println(obj);
		}
		
		//to remove element you can use the remove() same as the example before.
	}
	
	/**
	 * A set that stores its elements in a linked list hash table. The items are
	 * hashed based on their hashCode and also ordered in a doubly linked list.
	 * 
	 * Maintains the insertion order. Elements gets sorted in the same sequence 
	 * in which they have been added to the Set.
	 */
	public void linkedHashSet(){
		//LinkedHashSet of String type
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		//add element
		lhset.add("Element1");
		lhset.add("Element2");
		System.out.println(lhset);
		
		//LinkedHashSet of integer type
		LinkedHashSet<Integer> lhset1 = new LinkedHashSet<Integer>();
		lhset1.add(1);
		lhset1.add(2);
		lhset1.add(3);
		System.out.println(lhset1);
	}

	/**
	 * A set that stores its elements in a tree data structure that is also sorted and navigable.
	 * The add , remove , and contains methods are guaranteed to work in log( n ) time,
	 * where n is the number of elements in the tree. Ignores the duplicate element value
	 * 
	 * the elements in ascending order.
	 */
	public void treeSet(){
		//TreeSet String type
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("B");
		treeSet.add("C");
		treeSet.add("A");
		treeSet.add("1");
		
		System.out.println(treeSet);
	}
}
