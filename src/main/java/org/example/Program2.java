/**
 * 
 */
package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * List<Integer> list = Array.asList(1,2,5,2,5,2,0, 4,7,8,9,3);
 * occurences of element
 *  
 * 0 -> 4 
 */
public class Program2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> list = Array.asList(0,10,7,0,89,130,0,4,2,3,4,0);
		//[0,10,7,0,89,130,0,4,2,3,4,0]
		List<Integer> list = Arrays.asList(0,10,7,0,89,130,0,4,2,3,4,0);
		Integer element = 0;
		
		Map<Integer, Long> resMap  = list.stream()
									  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
		for(Map.Entry entry : resMap.entrySet()) {
			if(entry.getKey() == element) {
				System.out.print(" Occurences of element "+element+ " : " +entry.getValue());
				break;
			}
		}
	}

}
