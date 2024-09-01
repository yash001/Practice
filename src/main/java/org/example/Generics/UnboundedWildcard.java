/**
 * 
 */
package org.example.Generics;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * 1. Unbounded Wildcard (?)
 * 
 * The unbounded wildcard ? represents an unknown type. It is used when you don't care about the specific type of a generic parameter.
 * 
 * In this example, printList can accept a List of any type, whether it's a List<String>, List<Integer>, etc.
 */
public class UnboundedWildcard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    List<String> stringList = Arrays.asList("A", "B", "C");
	    List<Integer> intList = Arrays.asList(1, 2, 3);

	    Example example = new Example();
	    example.printList(stringList); // prints: A, B, C
	    example.printList(intList);    // prints: 1, 2, 3
	}

}
