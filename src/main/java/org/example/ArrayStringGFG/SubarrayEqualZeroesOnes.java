/**
 * 
 */
package org.example.ArrayStringGFG;

/**
 * 
 */
import java.util.HashMap;

/*
 * Given an array arr[] of size n containing 0 and 1 only. The problem is to count the subarrays having an equal number of 0’s and 1’s.

Examples:  

Input: arr[] = {1, 0, 0, 1, 0, 1, 1}
Output: 8
Explanation: The index range for the 8 sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), (4, 5)(2, 5), (0, 5), (1, 6)

Input: arr = { 1, 0, 0, 1, 1, 0, 0, 1}
Output: 12
 */
public class SubarrayEqualZeroesOnes {

    public static int countSubarrays(int[] arr) {
        // Initialize a HashMap to store the prefix sums and their frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        // Convert all 0's in the array to -1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }

        // Variable to store the count of subarrays with equal 0's and 1's
        int count = 0;
        // Variable to store the current prefix sum
        int sum = 0;

        // Add a base case in the map (prefix sum 0 has been seen once)
        map.put(0, 1);

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Update the prefix sum
            sum += arr[i];

            // If the prefix sum has been seen before, add its frequency to the count
            if (map.containsKey(sum)) {
                count += map.get(sum);
            }

            // Update the frequency of the current prefix sum in the map
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 0, 1, 0, 1, 1};
        System.out.println("Number of subarrays with equal 0's and 1's: " + countSubarrays(arr1)); // Output: 8

        int[] arr2 = {1, 0, 0, 1, 1, 0, 0, 1};
        System.out.println("Number of subarrays with equal 0's and 1's: " + countSubarrays(arr2)); // Output: 12
    }
}

