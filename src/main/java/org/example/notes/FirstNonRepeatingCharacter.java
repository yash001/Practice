/**
 * 
 */
package org.example.notes;

/**
 * Given a string, find the 1st non-repeating character
 * 
 */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    /*
	public static char findFirstNonRepeating(String str) {
        LinkedHashMap<Character, Integer> countMap = new LinkedHashMap<>();

        // Traverse the string and update counts in the LinkedHashMap
        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }
    */
	
	public static char findFirstNonRepeating(String str) {
        //LinkedHashMap<Character, Integer> countMap = new LinkedHashMap<>();

		Character firstNonRepeatingCharacter = str.chars().mapToObj(c -> (char) c)
	            .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
	            .entrySet().stream()
	            .filter(entry -> entry.getValue () == 1)
	            .map(Map.Entry::getKey)
	            .findFirst()
	            .orElse(null);
				System.out.println("First Non Repeatating Character = "+firstNonRepeatingCharacter);

        return firstNonRepeatingCharacter ; // Return null character if no non-repeating character is found
    }

    public static void main(String[] args) {
        String str = "swiss";
        char result = findFirstNonRepeating(str);
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
