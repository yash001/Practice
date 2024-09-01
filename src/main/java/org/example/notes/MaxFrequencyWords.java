/**
 * 
 */
package org.example.notes;

/**
 * Find All Maximum frequency word from a sentence.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class MaxFrequencyWords {
    public static void main(String[] args) {
        String sentence = "this is a test this is a test this is a test example";

        // Call the method to find all words with maximum frequency
        List<String> maxFreqWords = findMaxFrequencyWords(sentence);

        // Print the result
        System.out.println("Words with maximum frequency: " + maxFreqWords);
    }

    public static List<String> findMaxFrequencyWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return new ArrayList<>(); // Return an empty list if the sentence is empty or null
        }

        // Create a HashMap to store word frequencies
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Split the sentence into words
        String[] words = sentence.split("\\s+"); // Split by spaces

        // Iterate through the words and update frequencies
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Find the maximum frequency
        int maxFrequency = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        // Collect all words with the maximum frequency
        List<String> maxFreqWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                maxFreqWords.add(entry.getKey());
            }
        }

        return maxFreqWords;
    }
}

