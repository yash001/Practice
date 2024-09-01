/**
 * 
 */
package org.example.CollectionsAndJava8;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {

    public static void main(String[] args) {
        // Sample string
        String input = "swiss";

        // Find the first repeated character
        
        // Display the result
        /*
         * Optional<Character> firstRepeatedChar = findFirstRepeatedCharacter(input);

        if (firstRepeatedChar.isPresent()) {
            System.out.println("First repeated character: " + firstRepeatedChar.get());
        } else {
            System.out.println("No repeated characters found.");
        }
        */
        
       Character firstRepeatedChar = findFirstRepeatedCharacter(input);

        if (firstRepeatedChar != null) {
            System.out.println("First repeated character: " + firstRepeatedChar);
        } else {
            System.out.println("No repeated characters found.");
        }
    }

    /*
    public static Optional<Character> findFirstRepeatedCharacter(String str) {
        Map<Character, Boolean> characterMap = new LinkedHashMap<>();

        return str.chars()                          // Convert string to IntStream of character codes
                .mapToObj(c -> (char) c)            // Convert IntStream to Stream<Character>
                .filter(c -> {
                    // Check if the character is already in the map
                    boolean isRepeated = characterMap.containsKey(c);
                    // If not, add it to the map with a value of true
                    characterMap.putIfAbsent(c, true);
                    return isRepeated;
                })
                .findFirst();                      // Return the first repeated character
    }
    */
    
    
    //2nd Approach
    /*
    public static Character findFirstRepeatedCharacter(String str) {
       
       Character resChar = str.chars()          // Convert string to IntStream of character codes
					               .mapToObj(c -> (char) c)
					               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
					               .entrySet()
					               .stream()
					               .filter(entry -> entry.getValue() > 1)
					               .map(Map.Entry::getKey)
					               .findFirst()
					               .orElse(null);
        
		return resChar;
               
    }
    */
    public static Character findFirstRepeatedCharacter(String str) {
    	Set<Character> set = new HashSet<Character>();
    	Character repeatatedChar = str.chars()
    								.mapToObj(c -> (char) c)
    								.filter(c -> !set.add(c))
    								.findFirst()
    								.orElse(null);
    								
    			return repeatatedChar;
    }
}

