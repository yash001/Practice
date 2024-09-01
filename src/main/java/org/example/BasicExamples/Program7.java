/**
 * 
 */
package org.example.BasicExamples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 
 */
public class Program7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        String input = "abacddbec";
        Optional<Character> result = findFirstNonRepetitiveCharacter(input);
        result.ifPresentOrElse(
            ch -> System.out.println("First non-repetitive character: " + ch),
            () -> System.out.println("No non-repetitive character found")
        );
    }

    public static Optional<Character> findFirstNonRepetitiveCharacter(String str) {
        Map<Character, Long> characterCountMap = new LinkedHashMap<>();

        // Populate the map with character counts
        str.chars().mapToObj(c -> (char) c).forEach(c -> 
            characterCountMap.put(c, characterCountMap.getOrDefault(c, 0L) + 1)
        );

        // Find the first character with a count of 1
        return characterCountMap.entrySet().stream()
                                .filter(entry -> entry.getValue() == 1)
                                .map(Map.Entry::getKey)
                                .findFirst();
    }
}
