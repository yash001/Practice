package org.example.notes;

import java.util.Map;
import java.util.TreeMap;

/**
 * 
 */
/*
package org.example.notes;

import java.util.Map;
import java.util.TreeMap;

/**
 * 
 TreeMap is a class in Java that implements the NavigableMap interface, which in turn extends the SortedMap interface. It is a Red-Black tree-based implementation that guarantees that the keys in the map are always sorted in natural order (if the keys implement the Comparable interface) or according to a specified Comparator provided at map creation time. Because of this ordering, TreeMap offers efficient performance for operations that require sorted data or navigation in sorted order.

Key Characteristics of TreeMap:
Sorted Order:

The keys in a TreeMap are always sorted either according to their natural ordering or by a comparator provided at the time of map creation.
This makes TreeMap particularly useful when you need a map where keys are automatically kept in a sorted order.
Implementation:

TreeMap is implemented as a Red-Black tree, which is a self-balancing binary search tree. This ensures that the tree remains balanced, leading to good performance characteristics for insertions, deletions, and lookups.
Time Complexity:

Basic operations such as put, get, remove, containsKey, and containsValue have a time complexity of O(log n) because they involve traversing the tree.
This is less efficient than a HashMap, which provides average O(1) time complexity for these operations, but TreeMap offers the advantage of maintaining order.
No null Keys:

TreeMap does not allow null keys. Attempting to insert a null key will result in a NullPointerException. However, null values are allowed.
NavigableMap Interface:

TreeMap implements the NavigableMap interface, providing methods to navigate the map such as lowerKey, floorKey, ceilingKey, and higherKey, which allow you to find keys relative to a given key in the map.
It also provides methods like firstKey, lastKey, pollFirstEntry, and pollLastEntry, which make it easy to retrieve and manipulate entries at the endpoints of the map.
Submaps:

TreeMap supports operations to obtain views of a portion of the map. Methods such as subMap, headMap, and tailMap return submaps based on a range of keys, allowing you to work with a subset of the map’s entries.




*/

public class TreeMapExample {
	public static void main(String args[])  
	{    
	//object of TreeMap class  
		TreeMap<String,String> treemap=new TreeMap<String,String>();      
		//we can take anything in the key such as integer, string, etc.  
		//adding elements to the TreeMap  
		treemap.put("H","Ahmedabad ");      
		treemap.put("D","Jaipur");      
		treemap.put("B","Delhi");      
		treemap.put("F","Agra");   
		treemap.put("P","Patna");  
		//for-each loop for fetching the elements from the TreeMap  
			for(Map.Entry m:treemap.entrySet())  
			{      
				//prints the key and value pair of the elements   
				System.out.println(m.getKey()+" "+m.getValue());      
			}      
	}    
}

