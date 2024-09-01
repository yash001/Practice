/**
 * 
 */
package org.example.CollectionsAndJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
 */
public class NumberStartingWith1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		
		List<String> returnList = list.stream()
				                   .map(s -> s+"")
				                   .filter(s -> s.startsWith("1"))
				                   .collect(Collectors.toList());
		
		System.out.print(returnList);
	}

}
