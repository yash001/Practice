/**
 * 
 */
package org.example.CollectionsAndJava8;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
/**
 * 
 */
import java.util.stream.Stream;

public class FibonacciSeries {

    public static void main(String[] args) {
        int count = 10; // Number of Fibonacci numbers to generate

        // Generate and print the Fibonacci series
        generateFibonacci(count).forEach(System.out::println);;
    }

    public static List<Integer> generateFibonacci(int count) {
    	Stream.iterate(new int[]{0,1},t->new int[]{ t[1], t[0]+ t[1] })
        .limit(count)
        .map(t->t[0])
        .forEach(System.out::print);

    	Function<int[], List<Integer>> intArraytoListOFInt = array -> Arrays.stream(array).boxed()
        .collect(toList());
    	List<Integer> collect = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
        .limit(10)
        .map(intArraytoListOFInt)
        .flatMap(List::stream)
        .distinct()
        .collect(toList());
//	System.out.println(collect);
		return collect;
    }
}

