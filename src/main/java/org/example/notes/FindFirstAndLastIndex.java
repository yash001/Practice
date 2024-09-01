/**
 * 
 */
package org.example.notes;

/**
  In an array, find the 1st and last index of a given element
 */
public class FindFirstAndLastIndex {
    public static void main(String[] args) {
        int[] array = {5, 3, 7, 3, 8, 9, 3, 2, 4};
        int target = 3;

        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                if (firstIndex == -1) {
                    firstIndex = i; // Set the first occurrence
                }
                lastIndex = i; // Update the last occurrence
            }
        }

        if (firstIndex != -1) {
            System.out.println("First Index: " + firstIndex);
            System.out.println("Last Index: " + lastIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

