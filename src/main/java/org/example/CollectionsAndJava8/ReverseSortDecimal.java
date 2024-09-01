/**
 * 
 */
package org.example.CollectionsAndJava8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */
public class ReverseSortDecimal {

	/**
	 * @param args
	 */

		// TODO Auto-generated method stub
		 public static void main(String[] args) {
		        // Sample list of decimal numbers
		        List<Double> decimalNumbers = Arrays.asList(3.5, 2.1, 4.7, 1.9, 6.3, 5.8);

		        // Sorting the list in reverse order using Streams
//		        List<Double> sortedNumbers = decimalNumbers.stream()
//		                .sorted((a, b) -> b.compareTo(a))  // Reverse order sorting
//		                .collect(Collectors.toList());
		        List<Double> sortedNumbers = decimalNumbers.stream()
		                .sorted(Collections.reverseOrder())  // Reverse order sorting
		                .collect(Collectors.toList());

		        // Displaying the sorted list
		        System.out.println("Sorted list in reverse order: " + sortedNumbers);
		    }
}
