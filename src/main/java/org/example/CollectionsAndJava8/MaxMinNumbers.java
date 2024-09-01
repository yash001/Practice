/**
 * 
 */
package org.example.CollectionsAndJava8;

/**
 * 
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinNumbers {

    public static void main(String[] args) {
        // Sample list of integers
        List<Integer> numbers = Arrays.asList(10, 45, 23, 78, 56, 89, 33, 2, 99, 14);

        // Sort the list in ascending order
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        // Get the three minimum numbers
        List<Integer> threeMin = sortedNumbers.stream()
                .limit(3)
                .collect(Collectors.toList());

        // Get the three maximum numbers
        List<Integer> threeMax = sortedNumbers.stream()
                .skip(Math.max(0, sortedNumbers.size() - 3))
                .collect(Collectors.toList());

        // Displaying the results
        System.out.println("Three minimum numbers: " + threeMin);
        System.out.println("Three maximum numbers: " + threeMax);
    }
}
	