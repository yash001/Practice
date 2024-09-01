/**
 * 
 */
package org.example.ArrayStringGFG;

import java.util.HashMap;
import java.util.Map;

/**
 * Count pairs with given sum
 * Given an array arr[] of n integers and a target value, the task is to find the number of pairs of integers in the array whose sum is equal to target.

Examples:  

Input: arr[] = {1, 5, 7, -1, 5}, target = 6
Output:  3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).         

Input: arr[] = {1, 1, 1, 1}, target = 2
Output:  6
Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1).

Input: arr[] = {10, 12, 10, 15, -1}, target = 125
Output:  0
 */
public class CountSumPair {

	    // Function to count pairs with given sum
	    static int countPairs(int[] arr, int target)
	    {
	        Map<Integer, Integer> map = new HashMap<>();
	        int count = 0;

	        // Iterate through each element in the array
	        for (int num : arr) {
	            int complement = target - num;

	            // Check if the complement exists in the map
	            if (map.containsKey(complement)) {
	                count += map.get(complement);
	            }

	            // Update the count of the current element in
	            // the map
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }

	        return count; 
	    }

	    public static void main(String[] args)
	    {
	        int[] arr = { 1, 5, 7, -1, 5 };
	        int target = 6;

	        System.out.println(
	            countPairs(arr, target)); 
	    }
	}
