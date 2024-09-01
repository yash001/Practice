/**
 * 
 */
package org.example.Recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Write a program to find sum of elements which matches target and add all possible combinations to resultant list and display result list 

input = {1,2,3,4,5,6}
target = 6
output list = { 6, [1,5],[5,1],[2,4] ,[4,2] ,[1,2,3],[ 3,2,1] }

 */
public class CountAllPossibleSumCombinations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input =  {1,2,3,4,5,6};
		List<Object> result = new ArrayList<>();
		int target = 6;
        // Start the recursive process
        findCombinations(input, target, 0, new ArrayList<>(), result);

        // Add the target value itself if it is present in the input
        for (int num : input) {
            if (num == target) {
                result.add(target);
                break;
            }
        }

        // Print the result list
        System.out.println("Output list: " + result);
	}

	private static void findCombinations(int[] input, int target, int start, ArrayList current, List<Object> result) {
		 if (target == 0 && !current.isEmpty()) {
	            // If the sum of the current combination is equal to the target, add it to the result list
	            result.add(new ArrayList<>(current));
	            return;
	        }

	        for (int i = start; i < input.length; i++) {
	            if (input[i] <= target) {
	                current.add(input[i]);
	                findCombinations(input, target - input[i], i + 1, current, result); // move to next index
	                current.remove(current.size() - 1); // backtrack
	            }
	        }
	    }
	
	
}
