/**
 * 
 */
package org.example.notes;

/**
 * 
 * Reverse the words in a sentence
 */
public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Hello world, this is a test.";

        String reversedSentence = reverseWords(sentence);
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }

    private static String reverseWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Create a StringBuilder to build the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();

        // Loop through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);

            // Append a space if it's not the last word
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }
}
