/**
 * 
 */
package org.example.ArrayStringGFG;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 */
public class TripletSumFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = { 1,2,3,4,5};
	        int target = 9;
	        int arr_size = arr.length;
	        List<Integer> resList  = new ArrayList<>();
			
			// Call the find3Numbers function to find and print
	        // the triplet, if it exists
	        /*
	        List<Integer> resList = find3Numbers(arr, arr_size, target);
	        if(! resList.isEmpty()) {
	        	System.out.print(resList);
	        }else {
	        	System.out.print("No Tripplet found");
	        }
			*/
	        boolean found3Numbers = find3Numbers(arr, arr_size, target,resList);
	        if(! found3Numbers ) {
	        	System.out.print("No Tripplet found");
	        }else {
	        	System.out.print(resList);
	        	
	        }
	}

	private static boolean find3Numbers(int[] arr, int arr_size, int target,List resList) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < arr_size -2 ; i++ ) {
			Set<Integer> set = new HashSet<>();
			int curr_sum = target - arr[i];
			
			for(int j = i + 1 ; j < arr_size ; j++ ) {
				int req_sum =  curr_sum - arr[j];
				if(set.contains(j)) {
					resList.add(arr[i]);
					resList.add(arr[j]);
					resList.add(req_sum);
					return true;
				}
				set.add(arr[j]);
				
				
			}
		}
		
		return false;
	}

}
