/**
 * 
 */
package org.example;

import java.util.Arrays;

/**
 * //Write a  program to move all negative num to one side of array


int[] arr = {-1,-4,5,6,7,8,9,-10,11}
output = {-10,-4,-15,5,6,7,}
 */
public class Program1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
	
		int[] arr = {-1,-4,5,6,7,8,9,-10,11};
		
		//Arrays.sort(arr);	
		// iterate
		// find min index
		// swpa with i+1 
		
		
		//int low = j-1 ;
		  for (int i = 1; i < arr.length; i++) {
	            int key = arr[i];  // The element to be placed in the sorted portion
	            int j = i - 1;

	            // Move elements of the sorted portion that are greater than key to one position ahead
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;  // Insert the key element at the correct position
	        }
		
		
		for(int i =0 ; i < arr.length; i++) {
			System.out.print(" "+ arr[i]);
		}
		
		
	}

//	private static int  swap(int arr,int i, int j) {
//		// TODO Auto-generated method stub
//		
//		return 
//	}
}
