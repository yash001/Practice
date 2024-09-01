/**
 * 
 */
package org.example.CollectionsAndJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 19. How to find only duplicate elements with its count from the String ArrayList in Java8?
 */
public class Test1 {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		 
		 Map<String, Long> resMap = names.stream()
				 						.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				 						.entrySet()
				 						.stream()
				 						.filter(entry -> entry.getValue() > 1)
				 						.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		 
		System.out.print("Duplicate Value with its count := "+ resMap); 						
	}

}
