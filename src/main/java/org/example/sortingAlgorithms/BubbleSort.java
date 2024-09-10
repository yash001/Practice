/**
 * 
 */
package org.example.sortingAlgorithms;

/**
 * 
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        
        bubbleSort(arr);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap using XOR
                    arr[j] = arr[j] ^ arr[j + 1]; // a = a ^ b
                    arr[j + 1] = arr[j] ^ arr[j + 1]; // b = a ^ b
                    arr[j] = arr[j] ^ arr[j + 1]; // a = a ^ b
                }
            }
        }
    }

}
