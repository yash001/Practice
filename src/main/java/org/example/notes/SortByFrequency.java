 /**
 * 
 */
package org.example.notes;

/**
 * 
 */
import java.util.*;

public class SortByFrequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 6, 5, 4, 3, 2, 4, 5, 2, 4);

        System.out.println("Original List: " + list);

        List<Integer> sortedList = sortByFrequency(list);

        System.out.println("Sorted List by frequency (descending): " + sortedList);
    }

    public static List<Integer> sortByFrequency(List<Integer> list) {
        // Step 1: Count the frequency of each element using a HashMap
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort the elements by frequency (descending) and by element value (ascending)
        List<Integer> sortedList = new ArrayList<>(list);
        sortedList.sort((a, b) -> {
            int frequencyCompare = frequencyMap.get(b).compareTo(frequencyMap.get(a));
            int valueCompare = a.compareTo(b);
            // If frequencies are equal, sort by element value (ascending)
            return frequencyCompare == 0 ? valueCompare : frequencyCompare;
        });

        return sortedList;
    }
}
