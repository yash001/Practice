/**
 * 
 */
package org.example.ArrayStringGFG;

/**
 * Given a 1-based indexing array arr[] of integers and an integer sum. You mainly need to return the left and right indexes(1-based indexing) of that subarray. In case of multiple subarrays, return the subarray indexes which come first on moving from left to right. If no such subarray exists return an array consisting of element -1.

Examples: 

Input: arr[] = { 15, 2, 4, 8, 9, 5, 10, 23}, sum = 23
Output: 2 5
Explanation: Sum of elements between indices 2 and 5 is 2 + 4 + 8 + 9 = 23

Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
Output: 2 5
Explanation: Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7

Input: arr[] = {1, 4}, sum = 0
Output: -1
Explanation: There is no subarray with 0 sum
 * 
 * 
 */
import java.util.*;

public class SubarrayWithGivenSum {

    public static int[] findSubarrayWithSum(int[] arr, int sum) {
        int currentSum = 0;
        int start = 0;
        
        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];
            
            while (currentSum > sum && start <= end) {
                currentSum -= arr[start];
                start++;
            }
            
            if (currentSum == sum) {
                // Return 1-based index
                return new int[]{start + 1, end + 1};
            }
        }
        
        // If no subarray is found
        return new int[]{-1};
    }
    
    public static void main(String[] args) {
        int[] arr1 = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum1 = 23;
        System.out.println(Arrays.toString(findSubarrayWithSum(arr1, sum1))); // Output: [2, 5]

        int[] arr2 = {1, 4, 0, 0, 3, 10, 5};
        int sum2 = 7;
        System.out.println(Arrays.toString(findSubarrayWithSum(arr2, sum2))); // Output: [2, 5]

        int[] arr3 = {1, 4};
        int sum3 = 0;
        System.out.println(Arrays.toString(findSubarrayWithSum(arr3, sum3))); // Output: [-1]
    }
}

