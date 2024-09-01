/**
 * 
 */
package org.example.CollectionsAndJava8;

/**
 * - List comprehension
- Write code which returns even element in list using list comprehension 
Java does not have native support for list comprehensions as seen in languages like Python, but you can achieve similar functionality using Java Streams, which provide a powerful and expressive way to handle collections.
List Comprehension in Python
In Python, a list comprehension provides a concise way to create lists. For example:
squares = [x * x for x in range(10) if x % 2 == 0]

Equivalent in Java
In Java, you can achieve similar results using the Stream API, which was introduced in Java 8. Streams provide a way to process sequences of elements (like collections) in a functional style.
Here’s how you can achieve similar functionality to Python list comprehensions in Java:
Example: List Comprehension in Java using Streams
Suppose you want to create a list of squares of even numbers from 0 to 9. In Java, you can do this using the Stream API:

 * 
 */
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListComprehensionExample {
    public static void main(String[] args) {
        List<Integer> squares = IntStream.range(0, 10)       // Create a stream of integers from 0 to 9
                .filter(x -> x % 2 == 0)                    // Filter even numbers
                .map(x -> x * x)                            // Square each number
                .boxed()                                   // Convert IntStream to Stream<Integer>
                .collect(Collectors.toList());             // Collect results into a List

        System.out.println(squares); // Output: [0, 4, 16, 36, 64]
    }
}

