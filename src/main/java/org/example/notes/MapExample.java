/**
 * 
 */
package org.example.notes;

/**
 * 
 * map and flatMap are both methods used in the Java Stream API for transforming data, but they serve different purposes and operate in different ways. Here's a detailed explanation of each and how they differ:

map Method
The map method is used to transform each element of a stream into another form. It takes a Function as a parameter that applies to each element in the stream, producing a new stream of the transformed elements.

Characteristics:
One-to-One Mapping: Each element of the original stream is mapped to exactly one element in the resulting stream.
Transformation: The map method applies a transformation function to each element, resulting in a stream of the transformed elements.
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");
        List<Integer> wordLengths = words.stream()
                                         .map(String::length) // Map each word to its length
                                         .collect(Collectors.toList());

        System.out.println(wordLengths); // Output: [5, 5, 4]
    }
}
