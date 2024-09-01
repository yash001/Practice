/**
 * 
 */
package org.example.ArrayStringGFG;

/**
 * Given two sorted arrays, find their union and intersection.
Example:

Input: arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6} 
Output: Union : {1, 2, 3, 4, 5, 6, 7} 
         Intersection : {3, 5}

Input: arr1[] = {2, 5, 6}
        arr2[] = {4, 6, 8, 10} 
Output: Union : {2, 4, 5, 6, 8, 10} 
         Intersection : {6}
         
 */
import java.util.*;

public class UnionIntersectionSortedArrays {

    public static List<Integer> findUnion(int[] arr1, int[] arr2) {
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                union.add(arr1[i]);
                i++;
            } else if (arr2[j] < arr1[i]) {
                union.add(arr2[j]);
                j++;
            } else {
                union.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements of arr1
        while (i < arr1.length) {
            union.add(arr1[i]);
            i++;
        }

        // Add remaining elements of arr2
        while (j < arr2.length) {
            union.add(arr2[j]);
            j++;
        }

        return union;
    }

    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        List<Integer> intersection = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }

        return intersection;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};
        
        List<Integer> union = findUnion(arr1, arr2);
        List<Integer> intersection = findIntersection(arr1, arr2);
        
        System.out.println("Union: " + union);               // Output: [1, 2, 3, 4, 5, 6, 7]
        System.out.println("Intersection: " + intersection); // Output: [3, 5]

        int[] arr3 = {2, 5, 6};
        int[] arr4 = {4, 6, 8, 10};
        
        union = findUnion(arr3, arr4);
        intersection = findIntersection(arr3, arr4);
        
        System.out.println("Union: " + union);               // Output: [2, 4, 5, 6, 8, 10]
        System.out.println("Intersection: " + intersection); // Output: [6]
    }
}
