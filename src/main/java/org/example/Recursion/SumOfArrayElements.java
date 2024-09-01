/**
 * 
 */
package org.example.Recursion;

/**
 * 
 * 
 * 9. Problem: Sum of Array Elements
   Problem Description:
   Given an array of integers, return the sum of its elements using recursion.
Solutions:
Time Complexity  : O(N)
Space Complexity : O(N)

Time Complexity:
The time complexity of the sumArray function is O(n), where n is the number of elements in the array.
The function processes each element exactly once, making the time complexity linear with respect to the number of elements.
Space Complexity:
The space complexity is O(n), where n is the number of elements in the array.
This is due to the space used by the recursion call stack. Each recursive call adds a frame to the call stack, and the maximum depth of the recursion stack is n, where n is the size of the array.
Summary:
Time Complexity:  O(n) — Linear time, where n is the number of elements in the array.
Space Complexity: O(n) — Linear space, due to the depth of the recursion stack.

 */
public class SumOfArrayElements {

	/*
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
		System.out.print("Sum of given Array eleements is : ");	
		
		System.out.print(" "+ sumOfArrayElements(arr,arr.length)+" ");
	}

	private static int sumOfArrayElements(int[] arr,int n) {
		// TODO Auto-generated method stub
		if(n <= 0 ) return 0;
		
		return arr[n-1] + sumOfArrayElements(arr,n-1);
	}

}
