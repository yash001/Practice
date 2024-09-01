/**
 * 
 */
package org.example.CollectionsAndJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */
public class SortNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//
		List<Integer> list = Arrays.asList(10,11,12,13,14,15,9,8,7,6,5);
		
		/*
		 Ascending Order
		List<Integer> returnList = list.stream()
								  .sorted((o1, o2) -> o1.compareTo(o2))
								  .collect(Collectors.toList());
		*/
		//Descending Order
		List<Integer> returnList = list.stream()
				  .sorted((a,b) -> b.compareTo(a))
				  .collect(Collectors.toList());
		System.out.print(returnList);
		
		
	}

}
