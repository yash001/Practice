/**
 * 
 */
package org.example.CollectionsAndJava8;

/**
 * 
 */
import java.util.Arrays;
import java.util.stream.Stream;

public class MergeAndSortArrays {

    public static void main(String[] args) {
        // Sample unsorted arrays
        int[] array1 = {5, 2, 9, 1, 6};
        int[] array2 = {8, 3, 7, 4, 10};

        // Convert int arrays to Integer streams
        Stream<Integer> stream1 = Arrays.stream(array1).boxed();
        Stream<Integer> stream2 = Arrays.stream(array2).boxed();

        // Merging and sorting the arrays using Streams
        int[] sortedArray = Stream.concat(stream1, stream2)
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();

        // Displaying the sorted array
        System.out.println("Merged and sorted array: " + Arrays.toString(sortedArray));
    }
}
