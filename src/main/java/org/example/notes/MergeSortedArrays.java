/**
 * 
 */
package org.example.notes;

/**
 * Given 2 sorted arrays, merge them to give a sorted array without using a 3rd array i.e. saving the extra space
 */
import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 0, 0, 0, 0}; // Size m + n
        int m = 4; // Number of valid elements in arr1
        int[] arr2 = {2, 4, 6, 8};
        int n = 4; // Number of elements in arr2
        
        merge(arr1, m, arr2, n);
        
        System.out.println("Merged array: " + Arrays.toString(arr1));
    }

    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1; // Last index of arr1's valid elements
        int j = n - 1; // Last index of arr2
        int k = m + n - 1; // Last index of merged array in arr1

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }

        // If there are remaining elements in arr2, copy them to arr1
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }

        // No need to copy remaining elements of arr1, as they are already in place
    }
}
