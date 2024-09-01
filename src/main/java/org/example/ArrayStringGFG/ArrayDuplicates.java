/**
 * 
 */
package org.example.ArrayStringGFG;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class ArrayDuplicates {

	/**
	 * @param args
	 */
	 // Driver Code
    public static void main(String[] args)
    {
    	ArrayDuplicates arrayDuplicates = new ArrayDuplicates();
        int[] nums = { 4, 3, 2, 7, 7, 2, 3, 1 };
        List<Integer> duplicates
            = arrayDuplicates.findDuplicates(nums);
        System.out.print("Duplicate elements are: ");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: Duplicate elements
                              // are: 2 3
    }

    public List<Integer> findDuplicates(int[] nums)
    {
        int n = nums.length; // Get the length of the input
                             // array
      
        int[] arr = new int[n]; // Create an auxiliary
                                // array of size n+1
        List<Integer> list
            = new ArrayList<>(); // List to store duplicates

        // Iterate through each number in the input array
        for (int i : nums) {
            if (++arr[i] > 1) // Increment the count for 
                // this number and check if it is now a duplicate
              
                list.add(i); // If it is a duplicate, add it
                             // to the list
        }

        return list; // Return the list of duplicates
    }

}
