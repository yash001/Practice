/**
 * 
 */
package org.example.CollectionsAndJava8;

/**
 * 
 */
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElement {

    public static void main(String[] args) {
        // Sample array of integers
        int[] numbers = {1, 3, 2, 3, 4, 3, 5, 6, 5, 5, 5};

        // Find the most repeated element
        Optional<Integer> mostRepeated = findMostRepeated(numbers);

        // Display the result
        if (mostRepeated.isPresent()) {
            System.out.println("Most repeated element: " + mostRepeated.get());
        } else {
            System.out.println("The array is empty.");
        }
    }

    public static Optional<Integer> findMostRepeated(int[] numbers) {
        return Arrays.stream(numbers)                      // Convert array to IntStream
                .boxed()                                 // Box IntStream to Stream<Integer>
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Group by element and count occurrences
                .entrySet()                             // Get entries from the map
                .stream()                               // Convert to Stream<Map.Entry<Integer, Long>>
                .max((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue())) // Find the entry with the highest count
                .map(Map.Entry::getKey);                // Extract the key of the entry
    }
}
