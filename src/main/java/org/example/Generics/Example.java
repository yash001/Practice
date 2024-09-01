/**
 * 
 */
package org.example.Generics;

import java.util.List;

/**
 * Summary
Unbounded Wildcard (?): Represents an unknown type. Use when the specific type doesn't matter.
Upper Bounded Wildcard (? extends Type): Restricts the unknown type to be a specific type or its subclasses. Use when you want to read data.
Lower Bounded Wildcard (? super Type): Restricts the unknown type to be a specific type or its superclasses. Use when you want to write data.
Wildcards make your generic methods more flexible, allowing them to work with a broader range of types while maintaining type safety.
 */
public class Example {
	
	public void printList(List<?> list) {
	    for (Object elem : list) {
	        System.out.println(elem);
	    }
	}
	
	public void addNumbers(List<? extends Number> list) {
	    double sum = 0.0;
	    for (Number number : list) {
	        sum += number.doubleValue();
	    }
	    System.out.println("Sum: " + sum);
	}

	public void addIntegers(List<? super Integer> list) {
	    list.add(10);
	    list.add(20);
	}

}
