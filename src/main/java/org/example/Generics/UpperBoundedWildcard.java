/**
 * 
 */
package org.example.Generics;

import java.util.Arrays;
import java.util.List;

/**
 * 2. Upper Bounded Wildcard (? extends Type)
The upper bounded wildcard ? extends Type is used when you want to accept any type that is a subclass (or the class itself) of a specified type.

In this example, addNumbers can accept a List of any type that extends Number, such as Integer, Double, Float, etc. It ensures that all elements in the list can be treated as Number.
 * 
 */
public class UpperBoundedWildcard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    List<Integer> intList = Arrays.asList(1, 2, 3);
	    List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);

	    Example example = new Example();
	    example.addNumbers(intList);   // prints: Sum: 6.0
	    example.addNumbers(doubleList); // prints: Sum: 7.5
	}

}
