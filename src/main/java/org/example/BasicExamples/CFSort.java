/**
 * 
 */
package org.example.BasicExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/*
points
Questions :

Write a program or method that will sort the characters of the given text according to characters frequency/recurrences in ascending order. Without using Java stream API.
		Example 1:

		 Given text: "aaaaaaammdddddkkkkx"
		 Sorted result: "xmmkkkkdddddaaaaaaa"



		 Explanation: x has only one occurrence, m has two recurrences, k has four recurrences, d has five recurrences, a has seven recurrences.

		 Example 2:
		 Given test: zzzzzrrrrgwwwwwnn
		 Sorted result: gnnrrrrzzzzzwwwww



 */

public class CFSort {

    public static void main(String[] args) {
        String inputText = "aaaaaaammdddddkkkkx";

        Map<Character, Integer> frequencyMap = getCharacterFrequency(inputText);
        Set<Character> sortedCharacters = sortCharactersByFrequency(frequencyMap);

        System.out.println("Sorted characters by frequency: " + sortedCharacters);
    }

    private static Map<Character, Integer> getCharacterFrequency(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : text.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        return frequencyMap;
    }

    private static Set<Character> sortCharactersByFrequency(Map<Character, Integer> frequencyMap) {
        Set<Character> sortedCharacters = new TreeSet<>((ch1, ch2) -> {
            int frequency1 = frequencyMap.get(ch1);
            int frequency2 = frequencyMap.get(ch2);

            if (frequency1 == frequency2) {
                return Character.compare(ch1, ch2);
            }

            return Integer.compare(frequency1, frequency2);
        });

        sortedCharacters.addAll(frequencyMap.keySet());
        return sortedCharacters;
    }
}