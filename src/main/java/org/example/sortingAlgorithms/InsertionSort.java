/**
 * 
 */
package org.example.sortingAlgorithms;

/**
 * 
 * Insertion Sort
Insertion Sort is a simple and intuitive comparison-based sorting algorithm. It builds the final sorted array (or list) one item at a time. It is much like sorting playing cards in your hands. The list is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed in the correct position in the sorted part.
How Insertion Sort Works
Start with the Second Element: Assume the first element is already sorted. Pick the next element and compare it with the elements in the sorted portion.
Shift Elements: If the element is smaller than the compared elements, shift the larger elements to the right.
Insert: Place the picked element at its correct position in the sorted portion.
Repeat: Repeat the process for all elements in the unsorted portion.
Time Complexity
Best Case: O(n) when the array is already sorted.
Average Case: O(n2).
Worst Case: O(n2) when the array is sorted in reverse order.
Space Complexity: O(1) as it is an in-place sorting algorithm.
Implementation of Insertion Sort in Java
Here's how you can implement insertion sort in Java:



 */
public class InsertionSort {

    public static void insertionSort(int[] array) {
        int n = array.length;

        // Traverse from 1 to n-1 (considering the first element is already sorted)
        for (int i = 1; i < n; i++) {
            int key = array[i];  // The element to be placed in the sorted portion
            int j = i - 1;

            // Move elements of the sorted portion that are greater than key to one position ahead
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;  // Insert the key element at the correct position
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        insertionSort(array);

        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
