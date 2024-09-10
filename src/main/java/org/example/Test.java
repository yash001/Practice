/**
 * 
 */
package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 */
public class Test {

	/**
	 * @param args
	 * 
	 * Given an integer array nums, return all the triplets
	 *  [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

sum = 0 


	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		int[] arr = {-1,0,1,2,-1,-4};
		Set<List<Integer>> resList = threeSum(arr);
		System.out.println("result :"+ resList);
	}
	
	public static Set<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> resList = new HashSet<List<Integer>>();
		int target = 0;
		/*
		 * outer loop
		 *  iner loop 
		 *   inside check condition
		 *   
		 */
	    int n = nums.length;
	   
//		for(int i = 0 ; i < n-2 ; i++) {
//			
//			for(int j = i+1 ; j < n-1 ; j++) {
//				
//				for(int k = j+1 ; k < n ; k++) {
//					
//				}
//			}
//			
//		}
	    
	    //int[] arr = {-1,0,1,2,-1,-4};
	   // {-1,-4,0,-1,1,2};
	    //{-1,-4,,0,0,0,1,1,1,2};
	    
	    Arrays.sort(nums); // quick sort - n log n +  O(n) 
	    
	   // n + n-1 + n-2 ..n.. 0 = n * n -1 / 2 = O(N2)
	    		
	    		
	    		
	    
	    for(int i = 0 ; i < n-2 ; i++) {
	    	if(i != 0 && nums[i] == nums[i-1]) {
	    		continue;
	    }  
			int l = i + 1;
			int r = n - 1 ;
			
			while (l < r) {
				//if( )
					
			}
			
		}
		
		return resList;
	} 

}
