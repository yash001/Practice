/**
 * 
 */
package org.example.sortingAlgorithms;

/**
 * 
 * 
 */
public class SelectionSort {

    public static void selectionSort(int[] array) {
        int n = array.length;
        
        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted portion
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first element of the unsorted portion
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        
        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        selectionSort(array);
        
        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
