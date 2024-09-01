/**
 * 
 */
package org.example.notes;

/**
 * Given an array, find one pair from the array whose difference is equal to target(given target = 5) 
OR Given an array and a number find the pairs of number from the array whose difference is equal to the given number 
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllPairsWithDifference {
    public static void findAllPairs(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<String> pairs = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int complement1 = arr[i] + target;
            int complement2 = arr[i] - target;

            if (map.containsKey(complement1)) {
                pairs.add("(" + arr[i] + ", " + complement1 + ")");
            }
            if (map.containsKey(complement2)) {
                pairs.add("(" + arr[i] + ", " + complement2 + ")");
            }

            map.put(arr[i], i);
        }

        if (pairs.isEmpty()) {
            System.out.println("No such pairs found.");
        } else {
            System.out.println("Pairs found: " + pairs);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 30, 40, 100, 35, 3, 5};
        int target = 5;
        findAllPairs(arr, target);
    }
}
