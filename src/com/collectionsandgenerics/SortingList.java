package com.collectionsandgenerics;
/**
 * two sort methods of Collections :
 * 
 * "public static < T extends Comparable < ? super T > > void sort(List < T > list)"
 * sorts the given List according to its natural ordering, which is the ordering based on
 * the implementation of the compareTo method in the Comparable interface. The elements
 * in list must implement Comparable and must be mutually comparable , meaning each
 * element can be compared to each other element without a ClassCastException being
 * thrown.
 * 
 * "public static < T > void sort(List < T > list, Comparator < ? super T > c) sorts the"
 * given List according to the ordering of the given Comparator . All elements in list
 * must be mutually comparable.
 * 
 * @author jelica60589
 *
 */
public class SortingList {
	
	

}
