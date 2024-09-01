/**
 * 
 */
package org.example.Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Lower Bounded Wildcard (? super Type)
The lower bounded wildcard ? super Type is used when you want to accept any type that is a superclass of a specified type
In this example, addIntegers can accept a List of any type that is a superclass of Integer, such as Number or Object. This allows you to add Integer elements to the list safely.
 */
public class LowerBoundedWildCard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    List<Number> numberList = new ArrayList<>();
	    List<Object> objectList = new ArrayList<>();

	    Example example = new Example();
	    example.addIntegers(numberList); // Works fine
	    example.addIntegers(objectList); // Works fine

	    System.out.println(numberList); // prints: [10, 20]
	    System.out.println(objectList); // prints: [10, 20]
	}

}
