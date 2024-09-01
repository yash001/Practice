/**
 * 
 */
package org.example.CollectionsAndJava8;

/**
 * 
 */
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacters {

    public static void main(String[] args) {
        // Sample string
        String input = "programming";

        // Print duplicate characters
        printDuplicateCharacters(input);
    }

    
    public static void printDuplicateCharacters(String str) {
        Map<Character, Long> charCountMap = str.chars()                    // Convert string to IntStream of character codes
                .mapToObj(c -> (char) c)                                // Convert IntStream to Stream<Character>
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())); // Group by character and count occurrences

        charCountMap.entrySet().stream()                                  // Convert map entries to stream
                .filter(entry -> entry.getValue() > 1)                   // Filter entries where count > 1
                .forEach(entry -> System.out.println("Character '" + entry.getKey() + "' appears " + entry.getValue() + " times"));
    }
}
