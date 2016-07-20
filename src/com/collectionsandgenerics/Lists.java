package com.collectionsandgenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/**
 * A list is an ordered collection that can contain duplicate entries. Items in a list can be
 * retrieved and inserted at a specific position in the list based on an integer index, 
 * much like an array. You can search a list, iterate through its elements, and perform 
 * operations on a range of values in the list. Lists are commonly used because there are 
 * many situations in programming where you need to keep track of a list of objects.
 * 
 * The basic operations of List include the ability to add a single element at a specified
 * index, add a collection of elements, replace or remove a specific element, and retrieve an
 * element at a specified index.
 * 
 * @author jelica60589
 *
 */
public class Lists {

	public static void main(String[] args) {
		
		Lists collection = new Lists();
		//collection.arrayListExample();
		//collection.LinkedListExample();
		//collection.VectorListExample();
		collection.StackListExample();
	}
	
	/**
	 * A resizable list implemented as an array. When elements are added and
	 * removed, the ArrayList grows and shrinks accordingly. You can control
	 * the internal size of the array to improve performance.
	 */
	public void arrayListExample(){
		//ArrayList
		//this is an example of generic list, this is to limit the types of object 
		//we want to insert in the list.
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Element 1");
		arrayList.add("Element 2");
		arrayList.add("Element 3");
		//this will add the element 0 in the beginning of the list.
		arrayList.add(0, "Element 0");
		//System.out.println(arrayList);
				
		//to access the Arraylist
		String element0 =  arrayList.get(0);
		String element1 = arrayList.get(1);
		
		//System.out.println(arrayList.get(0) + ", " + arrayList.get(1)
		//+ ", " + arrayList.get(2) + ", " + arrayList.get(3)); 
		
				
		//removing list
		//arrayList.remove(0);
		//clearing all the list
		//arrayList.clear();
		//get the size of the list
		int size = arrayList.size();
		//System.out.println("the size of the list is " + size);
		//access via for-loop
		//other way to iterate list is using for loop
		for (String object: arrayList){
			String element = object;
		//	System.out.println(element);
		}
		
		//iterate a list
		Iterator<String> iterate = arrayList.iterator();
		while(iterate.hasNext()){
			String next = iterate.next();
			//System.out.println(next);
		}
		
		//another way is to use the standard for loop
		for (int i = 0 ; i < arrayList.size(); i++){
			String obj = arrayList.get(i);
			System.out.println(obj);
		}
			
	}
	
	/**
	 * list that implements a linked list data structure. Items can be added and
	 * removed from the beginning or end of the linked list.
	 */
	public void LinkedListExample(){
		//String type linkedlist
		LinkedList<String> linked = new LinkedList<String>();
		//add element on the linkedlist
		linked.add("A");
		linked.add("B");
		linked.add("C");
		//you can use addfirst and addlast to add element on the first and last of the linkedlist
		linked.addFirst("I");
		linked.addLast("Z");
		System.out.println(linked);
		
		//remove element
		linked.remove("A");
		System.out.println(linked);
		
		//remove first and last element of the linkedlist
		linked.removeLast();
		linked.removeFirst();
		System.out.println(linked);
		
		//get the value of the element
		String value = linked.get(0);
		//change the value of the element
		linked.set(0, "Jelica");
		System.out.println(linked);
	}

	/**
	 * Vector implements List Interface. Like ArrayList it also maintains insertion 
	 * order but it is rarely used in non-thread environment as it is synchronised 
	 * and due to which it gives poor performance in searching, adding, delete and 
	 * update of its elements.
	 */
	public void VectorListExample(){
		Vector<String> vec = new Vector<String>(2);
		//to create a vector with initial capacity of 4
		//Vector vec1 = new Vector(4);
		vec.addElement("Element0");
		vec.addElement("Element2");
		vec.addElement("Element3");
		//check size
		System.out.println(vec.size());
		//capacity
		System.out.println(vec.capacity());
	
		vec.addElement("Element4");
		
		vec.removeAllElements();
		System.out.println(vec);
	}

	/**
	 * A list that implements a stack data. Items are pushed onto the top and popped off
	 * the top of the stack, a last - in, first - out (LIFO) behaviour.
	 */
	public void StackListExample(){
		Stack<String> stack = new Stack<String>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		System.out.println("before pop: " + stack);
		//System.out.println(stack.peek());
		
		stack.pop();
		stack.pop();
		System.out.println("After pop: " + stack);
		
		int index = stack.search("1");
		System.out.println(index);
	}
}
