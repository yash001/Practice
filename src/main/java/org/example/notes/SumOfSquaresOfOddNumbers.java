package org.example.notes;

import java.util.Arrays;
import java.util.List;

/*
 	Given a list of integers, find sum of squares of only odd numbers in the list.
 */
public class SumOfSquaresOfOddNumbers {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Calculate the sum of squares of odd numbers
      
        int sumOfSquares = numbers.stream()
                                  .filter(n -> n % 2 != 0) // Filter odd numbers
                                  .map(n -> n * n)          // Square each odd number
                                  .reduce(0, Integer::sum); // Sum up the squares
        
        
        /*
        Integer sumOfSquares = numbers.stream()
                .filter(n -> n % 2 != 0) // Filter odd numbers
                .map(n -> n * n)         // Square each odd number
                .sum(); 
         */
        System.out.println("Sum of squares of odd numbers: " + sumOfSquares);
    }
}
