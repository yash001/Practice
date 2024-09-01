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

public class JoinStringsWithPrefixSuffix {

    public static void main(String[] args) {
        // Sample list of strings
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        // Joining the list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter
        String result = strings.stream()
                .collect(Collectors.joining(",", "[", "]"));

        // Displaying the result
        System.out.println("Joined String: " + result);
    }
}
