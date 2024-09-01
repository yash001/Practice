/**
 * 
 */
package org.example.notes;

/**
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctValuesExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);
        
        // Getting distinct values using Java 8 Stream API
        List<Integer> distinctNumbers = numbers.stream()
                                               .distinct()
                                               .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("Distinct Values: " + distinctNumbers);
    }
}
