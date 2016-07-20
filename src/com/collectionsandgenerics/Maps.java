package com.collectionsandgenerics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * A map is a collection that maps keys to values. Each key maps to one value, and duplicate
 * keys are not allowed in a map. A map is similar to a function in mathematics. Use a map
 * when the data you are storing has a key value that is more meaningful than a simple integer
 * index (like arrays and lists use).
 * @author jelica60589
 *
 */
public class Maps {
	
	public static void main(String[] args) {
		Maps m = new Maps();
		m.hashMap();
	}
	
	/**
	 * A map that stores its elements in a hash table. There is no ordering to the
	 * elements, and they are placed in the hash table based on their hashCode .
	 */
	public void hashMap(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "Element1");
		map.put("key2", "Elem2");
		map.put("key3", "Elem3");
		
		// key iterator
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()){
		  Object key   = iterator.next();
		  Object value = map.get(key);
		  System.out.println(key);
		  System.out.println(value);
		}
		
		//access via new for-loop
		for(String key : map.keySet()) {
		    String value = map.get(key);
		   // System.out.println(value);
		}	
	}
}
