/**
 * 
 */
package org.example.CollectionsAndJava8;

import java.util.stream.Collectors;

public class AnagramChecker {

    public static void main(String[] args) {
        // Sample strings
        String str1 = "listen";
        String str2 = "silent";

        // Check if the two strings are anagrams
        boolean areAnagrams = areAnagrams(str1, str2);

        // Display the result
        System.out.println("Are the strings anagrams? " + areAnagrams);
    }

    public static boolean areAnagrams(String s1, String s2) {
        // Normalize the strings: remove non-alphabetic characters, convert to lowercase
       String normalizedS1 = s1.chars()
                                .filter(Character::isLetter)
                                .map(Character::toLowerCase)
                                .sorted()
                                .mapToObj(c -> String.valueOf((char) c))
                                .collect(Collectors.joining());

       String normalizedS2 = s2.chars()
                                .filter(Character::isLetter)
                                .map(Character::toLowerCase)
                                .sorted()
                                .mapToObj(c -> String.valueOf((char) c))
                                .collect(Collectors.joining());

        // Compare the sorted results
        return normalizedS1.equals(normalizedS2);
    }
}
