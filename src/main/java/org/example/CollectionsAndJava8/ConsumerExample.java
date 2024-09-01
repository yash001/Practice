/**
 * 
 */
package org.example.CollectionsAndJava8;

import java.util.function.Consumer;

/**
 * 
 * 2. Consumer<T>
Purpose: A Consumer is used when you want to perform an operation on a given input. It represents a function that takes an argument of type T and returns no result (void). It is typically used for operations like printing, logging, or modifying an object.
Method: The functional method in Consumer is accept(T t).
Use Case: It is used when you need to perform an action or operation on an object passed as an argument, such as processing a list of items, logging information, or updating records.

In this example, the Consumer takes a string as input and performs an action (printing it) without returning anything.

Key Differences:
Supplier:

No input, provides an output (T).
Used to generate or supply values.
Consumer:

Takes an input (T), does not provide an output.
Used to perform operations on the given input.
These interfaces are a core part of Java's functional programming model introduced in Java 8 and are often used in conjunction with streams, lambdas, and other functional interfaces like Function and Predicate.

 */
	/**
	 * @param args
	 */
	public class ConsumerExample {
	    public static void main(String[] args) {
	        Consumer<String> stringConsumer = (str) -> System.out.println("Consumed: " + str);
	        stringConsumer.accept("Hello, World!");  // Outputs: Consumed: Hello, World!
	    }
}
