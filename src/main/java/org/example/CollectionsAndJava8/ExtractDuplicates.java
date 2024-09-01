/**
 * 
 */
package org.example.CollectionsAndJava8;

/**
 * 
 */
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExtractDuplicates {

    public static void main(String[] args) {
        // Sample array of integers
        int[] numbers = {1, 2, 3, 4, 5, 3, 2, 7, 8, 9, 1};

        // Extract duplicate elements
        List<Integer> duplicates = findDuplicates(numbers);

        // Display the result
        System.out.println("Duplicate elements: " + duplicates);
    }

    public static List<Integer> findDuplicates(int[] numbers) {
        /*
    	return Arrays.stream(numbers)              // Convert array to IntStream
                .boxed()                         // Box IntStream to Stream<Integer>
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Group by element and count occurrences
                .entrySet()                      // Get entries from the map
                .stream()                        // Convert to Stream<Map.Entry<Integer, Long>>
                .filter(entry -> entry.getValue() > 1) // Filter entries with count > 1
                .map(Map.Entry::getKey)          // Extract the key (element)
                .collect(Collectors.toList());   // Collect the result into a List
        */
    	
    	List<Integer> resultList = Arrays.stream(numbers)
					    			.boxed()                         // Box IntStream to Stream<Integer>
					                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Group by element and count occurrences
					                .entrySet()                      // Get entries from the map
					                .stream()                        // Convert to Stream<Map.Entry<Integer, Long>>
					                .filter(entry -> entry.getValue() > 1) // Filter entries with count > 1
					                .map(Map.Entry::getKey)          // Extract the key (element)
					    			.collect(Collectors.toList());
    	return resultList;
    }
}

