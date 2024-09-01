/**
 * 
 */
package org.example.CollectionsAndJava8;

/**
 * 
 */
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeCheck {

    public static void main(String[] args) {
        // Sample string
        String input = "A man a plan a canal Panama";

        // Check if the string is a palindrome
        boolean isPalindrome = isPalindrome(input);

        // Display the result
        System.out.println("\"" + input + "\" is " + (isPalindrome ? "a palindrome." : "not a palindrome."));
    }

    public static boolean isPalindrome(String str) {
        // Clean the string: remove non-alphanumeric characters and convert to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned string is equal to its reversed version
        return cleanedStr.equals(
            IntStream.range(0, cleanedStr.length()) // Stream of indices
                .mapToObj(i -> cleanedStr.charAt(cleanedStr.length() - 1 - i)) // Reverse the characters
                .map(String::valueOf) // Convert characters to String
                .collect(Collectors.joining()) // Join characters into a reversed string
        );
    }
}
