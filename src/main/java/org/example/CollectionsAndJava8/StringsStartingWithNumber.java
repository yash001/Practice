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

public class StringsStartingWithNumber {

    public static void main(String[] args) {
        // Sample list of strings
        List<String> strings = Arrays.asList("123abc", "hello", "42isTheAnswer", "world", "7days", "example");

        // Find strings that start with a number
        List<String> stringsStartingWithNumber = findStringsStartingWithNumber(strings);

        // Display the result
        System.out.println("Strings starting with a number: " + stringsStartingWithNumber);
    }

    public static List<String> findStringsStartingWithNumber(List<String> strings) {
        return strings.stream()                          // Convert the list to a Stream<String>
                .filter(s -> !s.isEmpty() && Character.isDigit(s.charAt(0))) // Check if the first character is a digit
                .collect(Collectors.toList());          // Collect the results into a List
    }
}

