/**
 * 
 */
package org.example.CollectionsAndJava8;

/**
 * 
 */
import java.util.stream.Stream;

public class OddNumbers {

    public static void main(String[] args) {
        int count = 10; // Number of odd numbers to generate

        // Generate and print the first 10 odd numbers
        generateOddNumbers(count).forEach(System.out::println);
    }

    public static Stream<Integer> generateOddNumbers(int count) {
        return Stream.iterate(
                1,                  // Initial seed (the first odd number)
                n -> n + 2           // Function to get the next odd number
        ).limit(count);          // Limit the stream to the desired number of odd numbers
    }
}

