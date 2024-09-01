/**
 * 
 */
package org.example.ArrayStringGFG;

/**
 * Find the Factorial of a large number
 *  n = 100
 */
import java.math.BigInteger;

public class FactorialDynamicProgramming {

    // Method to compute factorial of a large number using dynamic programming
    public static BigInteger factorial(int n) {
        // Create an array to store the factorials of numbers from 0 to n
        BigInteger[] dp = new BigInteger[n + 1];
        dp[0] = BigInteger.ONE; // Factorial of 0 is 1

        // Compute factorial for each number from 1 to n
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1].multiply(BigInteger.valueOf(i));
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int number = 100; // Example large number
        BigInteger fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}

