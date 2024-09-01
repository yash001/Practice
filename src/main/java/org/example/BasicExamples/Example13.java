/**
 * 
 */
package org.example.BasicExamples;

/**
 * 
 * Can you please write java program
you have got a array of integers consisting of +ve and -ve numbers.
Rearrange +ve and -ve numbers. Rearrange the positive elements at start and -ve elements at end.
 */

import java.util.Arrays;

	public class Example13 {

	    public static void rearrange(int[] arr) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left <= right) {
	            // If left is positive, move to the next
	            if (arr[left] > 0) {
	                left++;
	            } 
	            // If right is negative, move to the next
	            else if (arr[right] < 0) {
	                right--;
	            } 
	            // If left is negative and right is positive, swap them
	            else {
	                int temp = arr[left];
	                arr[left] = arr[right];
	                arr[right] = temp;
	                left++;
	                right--;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {12, -7, 5, -3, -1, 10, -2, 8, -4, 7};
	        System.out.println("Original Array: " + Arrays.toString(arr));
	        
	        rearrange(arr);
	        
	        System.out.println("Rearranged Array: " + Arrays.toString(arr));
	    }
	}


