/**
 * 
 */
package org.example.notes;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums. 

 Input: nums = [1,1,2] 

Output: 2, nums = [1,2,null] 

 */
public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static Integer removeDuplicates(Integer[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 1; // Start from the second element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        // Replace remaining elements with null-equivalent (Integer.MAX_VALUE here)
        // This is just to mimic the 'null' in non-primitive arrays
        /*
        for (int i = uniqueIndex; i < nums.length; i++) {
            nums[i] = Integer.MAX_VALUE; // Using Integer.MAX_VALUE as a placeholder
        }
        */
        for (int i = uniqueIndex; i < nums.length; i++) {
            nums[i] = (Integer) null ; // Using Integer.MAX_VALUE as a placeholder
        }
        

        return uniqueIndex;
    }

    public static void main(String[] args) {
      //  int[] nums = {1, 1, 2};
      //  int uniqueCount = removeDuplicates(nums);
    	Integer[] nums = {1, 1, 2};
        Integer uniqueCount = removeDuplicates(nums);
        
        // Print the number of unique elements
        System.out.println("Number of unique elements: " + uniqueCount);

        // Print the modified array
        System.out.println("Modified array: " + Arrays.toString(nums));
    }

}
