/**
 * 
 */
package org.example.CollectionsAndJava8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 3. How to find duplicate elements in a given integers list in java using Stream functions?
 */
public class DuplicateElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,1,2,3,4,5,5,6,7,8,9,10);
		
		Set<Integer> set = new HashSet<>();
		List<Integer> resList = list.stream()
								.filter(e -> ! set.add(e))
								.collect(Collectors.toList());
		System.out.print(resList);
	}

}
