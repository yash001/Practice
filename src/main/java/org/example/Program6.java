/**
 * 
 */
package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 
 */
public class Program6 {

	/**
	 * @param args
	 * Write a program using Java 8 Streams to find duplicate elements in a list of strings?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> input = Arrays.asList("skoda", "tata", "benz", "tata", "kia", "bmw", "kia");
				//(};
		//output = "tata", "kia"
		
		Set<String> set = new HashSet<String>();
		
		List<String> resList = input.stream()
								.filter(e -> !set.add(e))
								.collect(Collectors.toList());
		
		System.out.println(resList);
	}

}
