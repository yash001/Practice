/**
 * 
 */
package org.example.CollectionsAndJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * //Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
 */
public class EvenNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//1st Approach
		/*
		List<Integer> returnList = list.stream()
				                   .filter(e -> e % 2 == 0)
				                   .collect(Collectors.toList());
		
		System.out.print(returnList);
		*/
		
		 Map<Boolean, List<Integer>> resultlist = list.stream()
				    .collect(Collectors.partitioningBy(num -> num % 2 == 0));
				    System.out.println(resultlist);
		
		
	}

}
