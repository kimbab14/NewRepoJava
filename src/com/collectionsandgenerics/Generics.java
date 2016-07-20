package com.collectionsandgenerics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/**
 * Naming conventions for Generic
 * E for Element
 * K for a map key
 * V for map Value
 * N for Numbers
 * T for Generic data type
 * 
 * Use S,U,V, and so on for multiple types in the same class
 * 
 * @author jelica60589
 *
 */
public class Generics {

	public static void main(String[] args) {
		//String generic type
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("java");
		ar.add("html");
		ar.add("xml");
		ar.add("vb");
		ar.add("c#");
		ar.add("c++");
		ar.add("c");
		//ar.add(new java.util.Date()); //limitation is that the arrayList should only have a 
		//string generic type
		//System.out.println(ar);
		
		/**
		 * LIST EXAMPLE 
		 * 
		 * Instantiating a list using generic requires
		 * specifying the data type that the list contains. The use of generic 
		 * is seen in the class declaration of the list classes
		 * 
		 * Note:
		 * Use lists when you work with ordered collections where duplicates are allowed and you
		 * need control over where the items appear in the collection. If duplicates are not 
		 * allowed, a set might be more appropriate for your needs, as discussed in the next section.
		 */
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add(0, "B");
		list.set(1, "C");
		//System.out.println(list);
		
		if(list.contains("B")){
			//System.out.println("Index of B in the list is: " + list.indexOf("B"));
		}//
		
		//System.out.println(list.size());
		
		
		/**
		 * SETS EXAMPLE
		 * 
		 * The Collections Framework has several implementations of the Set 
		 * interface, including HashSet , LinkedHashSet , and TreeSet. 
		 * Use a Set object when duplicates are not allowed in your collection. 
		 * The equals method is used to determine if elements are duplicated. 
		 * All the Set classes use generics.
		 */
		
		Set<String> set = new HashSet<String>();
		set.add("HP");
		set.add("Dell");
		set.add("Lenovo");
		set.add("Mac");
		set.add("Accer");
		set.add("Asus");
		set.add("Dell");
		for (String sets : set){
			//System.out.println(sets);
		}	
		
		/**
		 * MAPS EXAMPLE
		 * 
		 * The Map interface is the parent interface of the various maps in the Collections Framework.
		 * Maps are unique in that they do not implement the Collection interface like all the other
		 * collections classes. The elements in a map are pairs of data: a value and a key that maps to
		 * that value.
		 * Maps do not allow duplicate keys, but there is no restriction on duplicate values.
		 * 
		 * Note:
		 * Use a HashMap if ordering does not matter, 
		 * a LinkedHashMap if insertion order is sufficient, 
		 * and a TreeMap if you need to control the specific ordering of elements.
		 * 
		 * */
		
		TreeMap<String, Integer> info = new TreeMap<String, Integer>();
		info.put("Jelica", 98353);
		info.put("Joan", 35325);
		info.put("Mond", 58398);
		
		Set<String> keys = info.keySet();
		
		for(String key: keys){
			System.out.println(info.get(key));
		}
		
	}
	
}
