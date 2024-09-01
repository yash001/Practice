/**
 * 
 */
package org.example.CollectionsAndJava8;

import java.util.Arrays;
import java.util.List;

/**
 * Find the 2nd minimum element from that list
 */
public class Fiind2ndMiniMumNoInList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(32,34,56,1,2,3,4,5,21,23);
		// output : 2
		Integer secondMinimumNumber = list.stream()
									  .sorted()
									  .skip(1)
									  .findFirst()
									  .orElse(null);
		
		if(secondMinimumNumber != null) {
			System.out.print("Second Minimum No. found in given list : " + secondMinimumNumber);
		} else {
			System.out.print("Second Minimum No. Not Found: in given list. ");	
		}
		
	}

}
