/**
 * 
 */
package org.example.BasicExamples;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
//
// write a program to check given string can be palindrome or not by rearranging alphabets out of it and return true if it is palindrome or return false if it is not palindrome


public class Program8 {


		public static void main(String[] args) {
	        String str1 = "abccba";
	        String str2 = "aabbc";
	        String str3 = "abc";

	        System.out.println(str1 + " can be rearranged into a palindrome: " + canRearrangeToPalindrome(str1));
	        System.out.println(str2 + " can be rearranged into a palindrome: " + canRearrangeToPalindrome(str2));
	        System.out.println(str2 + " can be rearranged into a palindrome: " + canRearrangeToPalindrome(str3));
	    }

	    public static boolean canRearrangeToPalindrome(String str) {
	        // Count frequencies of each character
	        Map<Character, Integer> charCount = new HashMap<>();
	        
	        for (char c : str.toCharArray()) {
	            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	        }
	        
	        // Count how many characters have odd frequencies
	        int oddCount = 0;
	        
	        for (int count : charCount.values()) {
	            if (count % 2 != 0) {
	                oddCount++;
	            }
	        }
	        
	        // For the string to be rearranged into a palindrome:
	        // If length is even, all characters must have even frequencies
	        // If length is odd, at most one character can have an odd frequency
	        if (str.length() % 2 == 0 && oddCount == 0) {
	            return true;
	        } else if (str.length() % 2 == 1 && oddCount == 1) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	

}


/*
string
abb

bab

abc -> false

*/