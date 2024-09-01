/**
 * 
 */
package org.example.notes;

/**
 * One coding question print the frequency of a char in a given string.
 *
 */
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "hello world";

        // Call the method to print character frequencies
        printCharFrequencies(input);
    }

    public static void printCharFrequencies(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through the string and update frequencies
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Print the character frequencies
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Character: '" + entry.getKey() + "' Frequency: " + entry.getValue());
        }
    }
}

