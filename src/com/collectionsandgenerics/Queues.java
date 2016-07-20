package com.collectionsandgenerics;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;


/**
 * A queue is a collection whose elements are added and removed in a specific order. Queues
 * are typically used for storing elements prior to processing them.
 * 
 * The basic operations of Queue include adding a single element, polling the queue to
 * retrieve the next element, or peeking at the queue to see if there is an element available
 * in the queue. The Deque operations are similar except elements can be added, polled, or
 * peeked at both the beginning and end of the deque.
 * 
 * @author jelica60589
 *
 */
public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queues q = new Queues();
		//q.priorityQueue();
		q.arrayDeque();

	}
	
	/**
	 * A queue where the elements are ordered based on an ordering you specify
	 * (as opposed to ordering based on FIFO).
	 */
	public void priorityQueue(){
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Jelica");
		queue.add("Grace");
		queue.add("Evangel");
		queue.add("Robin");
		queue.add("Raymond");
		
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		  
		System.out.println("iterating the queue elements:");  
		Iterator<String> iterator = queue.iterator();
		while(iterator.hasNext()){
			String element = iterator.next();
			System.out.println(element);
		}
	}
	
	/**
	 * A queue and deque implemented as a resizable array with no capacity
	 * restrictions.
	 */
	public void arrayDeque(){
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Elem1");
		deque.add("Elem2");
		deque.add("Elem3");
		deque.add("Elem4");
		deque.add("Elem5");
		deque.add("Elem6");
		deque.add("Elem7");
		deque.add("Elem8");
		deque.add("Elem9");
		
		for (String elem : deque){
			 System.out.println(elem);
		}
	}
}
