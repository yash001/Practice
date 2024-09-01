/**
 * 
 */
package org.example.notes;

/**
 * 
 The flatMap method is used to flatten a stream of collections (or other nested structures) into a single stream. It takes a Function that returns a stream for each element, and then flattens the resulting streams into a single stream.

Characteristics:
One-to-Many Mapping: Each element of the original stream can be mapped to zero or more elements in the resulting stream.
Flattening: The flatMap method flattens the nested streams into a single stream.


In this example, flatMap is used to flatten a list of lists into a single list of strings.

Key Differences
Output Structure:

map: Transforms each element to one element (one-to-one transformation).
flatMap: Transforms each element to a stream and flattens the streams into a single stream (one-to-many transformation).
Use Cases:

Use map when you want to perform a transformation that produces a single result for each input element.
Use flatMap when you have nested structures or want to perform a transformation that can produce multiple results for each input element.
Summary
map is used for transforming elements while maintaining a one-to-one relationship between elements.
flatMap is used for transforming elements into a stream of results and then flattening those streams into a single stream, handling one-to-many relationships.


 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("a", "b", "c"),
            Arrays.asList("d", "e"),
            Arrays.asList("f", "g", "h")
        );

        List<String> flattenedList = listOfLists.stream()
                                                .flatMap(List::stream) // Flatten the nested lists into a single stream
                                                .collect(Collectors.toList());

        System.out.println(flattenedList); // Output: [a, b, c, d, e, f, g, h]
    }
}
