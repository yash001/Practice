/**
 * 
 */
package org.example.notes;

/**
 * Find maximum repeated character from a string
 * 
 */
import java.util.HashMap;
import java.util.Map;

public class MaxRepeatedCharacter {
    public static void main(String[] args) {
        String input = "hello world";

        // Call the method to find the maximum repeated character
        char maxChar = findMaxRepeatedChar(input);

        if (maxChar != 0) {
            System.out.println("Maximum repeated character: '" + maxChar + "'");
        } else {
            System.out.println("String is empty.");
        }
    }

    public static char findMaxRepeatedChar(String str) {
        if (str == null || str.isEmpty()) {
            return 0; // Return 0 to indicate an empty or null string
        }

        // Create a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through the string and update frequencies
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the maximum repeated character
        char maxChar = str.charAt(0);
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxChar = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        return maxChar;
    }
}

