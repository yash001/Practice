/**
 * 
 */
package org.example.CollectionsAndJava8;

/**
 * 
 */
import java.util.Arrays;
import java.util.Optional;

public class LastElementInArray {

    public static void main(String[] args) {
        // Sample array
        Integer[] array = {1, 2, 3, 4, 5};

        // Get and print the last element of the array
        Optional<Integer> lastElement = getLastElement(array);
        lastElement.ifPresentOrElse(
            System.out::println, 
            () -> System.out.println("Array is empty")
        );
    }

    public static <T> Optional<T> getLastElement(T[] array) {
        return Arrays.stream(array)   // Convert array to Stream
                     .reduce((first, second) -> second); // Reduce to get the last element
    }
}

