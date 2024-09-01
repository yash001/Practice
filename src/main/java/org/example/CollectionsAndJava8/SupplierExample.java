/**
 * 
 */
package org.example.CollectionsAndJava8;

/**
 * 
 * 1. Supplier<T>
Purpose: A Supplier is used when you want to supply values or objects without requiring any input. It represents a function that takes no arguments and returns a result of type T.
Method: The functional method in Supplier is get().
Use Case: It is typically used for lazy generation of values, such as supplying a default value, generating random values, or creating new instances of an object.

Key Differences:
Supplier:

No input, provides an output (T).
Used to generate or supply values.
Consumer:

Takes an input (T), does not provide an output.
Used to perform operations on the given input.
These interfaces are a core part of Java's functional programming model introduced in Java 8 and are often used in conjunction with streams, lambdas, and other functional interfaces like Function and Predicate.

 */
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "Hello, World!";
        System.out.println(stringSupplier.get());  // Outputs: Hello, World!
    }
}

