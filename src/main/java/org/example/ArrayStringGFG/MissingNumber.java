/**
 * 
 */
package org.example.ArrayStringGFG;

/**
 * Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.

Note: There are no duplicates in the list.

Examples: 

Input: arr[] = {1, 2, 4, 6, 3, 7, 8} , N = 8
Output: 5
Explanation: Here the size of the array is 8, so the range will be [1, 8]. The missing number between 1 to 8 is 5

Input: arr[] = {1, 2, 3, 5}, N = 5
Output: 4
Explanation: Here the size of the array is 4, so the range will be [1, 5]. The missing number between 1 to 5 is 4

 */
public class MissingNumber {
    public static int missingNumber(int n, int[] arr)
    {
        // Create hash array of size n+1
        //int[] hash = new int[n + 1];
    	int[] hash = new int[n+1];
    	
        // Store frequencies of elements
        for (int i = 0; i < n - 1; i++) {
            hash[arr[i]]++;
        }

        // Find the missing number
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        // Edge case handling (though problem guarantees a
        // solution)
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 5 };
        int n = 5;
        System.out.println(missingNumber(n, arr));
    }
}
