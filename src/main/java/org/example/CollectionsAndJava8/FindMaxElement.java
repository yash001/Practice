/**
 * 
 */
package org.example.CollectionsAndJava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 6. Given a list of integers, find the maximum value element present in it using Stream functions?
 */
public class FindMaxElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Integer maxNoFromList = list.stream()
								.max(Integer::compare)
								.get();
		
		System.out.print(maxNoFromList);
								
	}

}
