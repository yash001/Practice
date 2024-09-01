/**
 * 
 */
package org.example.BasicExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * //Write a program to 

First non-repetative character in a string using java 8:
   example: input -> abacddbec
			output -> e
	
			// 
			 -> character
			 -> 
///

--
abacddbec


 */
public class Program6 {

	/**
	 * Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8} 
		Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
		
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[] = {1, 3, 4, 5};
		int a2[] = {2, 4, 6, 8};
		int res[] = merge2Arrays(a1,a2);
		for(int i = 0 ; i <res.length;i++)		
		System.out.println(" "+res[i]+" ");		

	}

	private static int[] merge2Arrays(int[] a1, int[] a2) {
		// TODO Auto-generated method stub
		int[] res = new int[a1.length + a2.length] ;
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < a1.length && j < a2.length) {
			if(a1[i] < a2[j]) {
				res[k++] = a1[i++];
				
			}else {
				res[k++] = a2[j++];
				
			}
		
		}
		while(i < a1.length) {
			res[k++] = a1[i++];
		}
		while(j < a2.length) {
			res[k++] = a2[j++];
		}
		
		return res;
	}

}
