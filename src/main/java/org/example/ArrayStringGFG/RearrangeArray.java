/**
 * 
 */
package org.example.ArrayStringGFG;

/**
 // NOT PROPER LOGIC
 * Rearrange array in alternating positive & negative items with O(1) extra space | Set 1
Last Updated : 21 May, 2024
Given an array having positive and negative numbers, our task is to arrange them in an alternate fashion such that every positive number is followed by a negative number and vice-versa maintaining the order of appearance. The number of positive and negative numbers need not to be equal. If there are more positive numbers then they have to appear at the end of the array , same condition for negative numbers also .

Examples: 

Input:  arr[] = {1, 2, 3, -4, -1, 4}
Output: arr[] = {-4, 1, -1, 2, 3, 4}

Input:  arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
Output: arr[] = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0}

 */
public class RearrangeArray {

    // Function to rearrange the array in alternating positive and negative items
    public static void rearrange(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n]; // Temporary array to store rearranged elements
        
        int posIndex = 0; // Index for positive numbers in the temp array
        int negIndex = 1; // Index for negative numbers in the temp array
        //temp[n-1] = arr[n-1];
        // Place positive numbers at even indices and negative numbers at odd indices in the temporary array
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                if (posIndex < n) {
                    temp[posIndex] = arr[i];
                    posIndex += 2;
                }
            } else {
                if (negIndex < n) {
                    temp[negIndex] = arr[i];
                    negIndex += 2;
                }
            }
        }

        // Copy the rearranged array back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, -4, -1, 4};
        rearrange(arr1);
        System.out.println("Rearranged Array: " + java.util.Arrays.toString(arr1)); // Output: [-4, 1, -1, 2, 3, 4]

        int[] arr2 = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearrange(arr2);
        System.out.println("Rearranged Array: " + java.util.Arrays.toString(arr2)); // Output: [-5, 5, -2, 2, -8, 4, 7, 1, 8, 0]
    }
}

