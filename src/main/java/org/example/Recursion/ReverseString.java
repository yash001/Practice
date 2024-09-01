/**
 * 
 */
package org.example.Recursion;

/**
 * 4. Problem: Reverse a String
Problem Description:
Given a string s, reverse it using recursion.

Time Complexity:
The time complexity of the reverseString function is O(n), where n is the length of the string s.
The function makes one recursive call for each character in the string, resulting in n recursive calls in total.
Space Complexity:
The space complexity is also O(n).
The function uses additional space on the call stack for each recursive call, which is proportional to the length of the string s.
Additionally, string concatenation (reverseString(s.substring(1)) + s.charAt(0)) creates new strings, but the overall space complexity remains O(n) due to the depth of the recursion stack.
Summary:
Time Complexity: O(n) — Linear time, where n is the length of the input string s.
Space Complexity: O(n) — Linear space, due to the depth of the recursion stack and the space used for creating new strings during concatenation.

 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		System.out.print("Reverse of given String.: ");	
		
			System.out.print(" "+ reverseString(str)+" ");	
	}

	private static String reverseString(String str) {
		// TODO Auto-generated method stub
		
		if (str.isEmpty()) {
	        return str;
	    }
	    return reverseString(str.substring(1)) + str.charAt(0);
	}

}
