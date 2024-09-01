/**
 * 
 */
package org.example.CollectionsAndJava8;

/**
 * 
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class SecondLargestNumber {

    public static void main(String[] args) {
        // Sample array of integers
        int[] numbers = {10, 45, 23, 78, 56, 89, 33, 2, 99, 14};

        // Find the second largest number
        Optional<Integer> secondLargest = findSecondLargest(numbers);

        // Display the result
        if (secondLargest.isPresent()) {
            System.out.println("Second largest number: " + secondLargest);
        } else {
            System.out.println("The array does not contain enough distinct elements.");
        }
    }

    public static Optional<Integer> findSecondLargest(int[] numbers) {
        return Arrays.stream(numbers)              // Convert array to IntStream
                .distinct()                       // Remove duplicates
                .boxed()                          // Convert IntStream to Stream<Integer>
                //.sorted((a, b) -> b.compareTo(a)) // Sort in descending order
                .sorted(Collections.reverseOrder())
                .skip(1)                          // Skip the largest element
                .findFirst();                     // Get the second element wrapped in Optional
    }
}

