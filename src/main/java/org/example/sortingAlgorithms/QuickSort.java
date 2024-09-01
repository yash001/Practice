/**
 * 
 */
package org.example.sortingAlgorithms;

/**
 * 
 * Quick Sort is a divide-and-conquer sorting algorithm that is highly efficient for large datasets. It works by selecting a "pivot" element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then recursively sorted.
How Quick Sort Works
Choose a Pivot: Select an element from the array as the pivot. Common choices include the first element, the last element, or the middle element.
Partitioning: Rearrange the array such that all elements less than the pivot are on the left side, and all elements greater than the pivot are on the right side.
Recursive Sorting: Recursively apply the same process to the left and right sub-arrays.
Base Case: The recursion stops when the sub-arrays have only one element, as they are already sorted.
Time Complexity
Best Case: O(nlog⁡n) - Occurs when the pivot divides the array into two nearly equal halves.
Average Case: O(nlog⁡n) - Expected time complexity for random arrays.
Worst Case: O(n2) - Occurs when the pivot is the smallest or largest element, leading to unbalanced partitions (e.g., sorted or reverse-sorted arrays).
Space Complexity
Space Complexity: O(log⁡n) due to the recursive stack space.
Implementation of Quick Sort in Java
Here is a Java implementation of Quick Sort:


 */
public class QuickSort {

    // Method to partition the array and return the pivot index
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];  // Choose the last element as the pivot
        int i = low - 1;  // Index of the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element with the element at index i+1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;  // Return the pivot index
    }

    // Method to perform Quick Sort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(array, low, high);

            // Recursively sort elements before and after the pivot
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

