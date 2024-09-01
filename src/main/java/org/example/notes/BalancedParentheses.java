/**
 * 
 */
package org.example.notes;

/**
 * Parantheses balancing
 */
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String input = "{[()]}"; // You can change this string to test other cases

        if (isBalanced(input)) {
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("The parentheses are not balanced.");
        }
    }

    public static boolean isBalanced(String str) {
        // Create a Stack to store opening parentheses
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // If it's an opening parenthesis, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If it's a closing parenthesis
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If the stack is empty, it means there is no matching opening parenthesis
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the top element from the stack
                char top = stack.pop();

                // Check if the popped element matches the closing parenthesis
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        // After processing all characters, the stack should be empty if parentheses are balanced
        return stack.isEmpty();
    }
}

