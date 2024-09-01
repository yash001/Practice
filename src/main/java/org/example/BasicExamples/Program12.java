/**
 * 
 */
package org.example.BasicExamples;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
public class Program12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ebbbbcdaaa";
		System.out.println(countTriplets(str));
	}
	
	
	public static int countTriplets(String str) {
		 
		  int count = 0;
		  Map<Character, Integer> map = new HashMap<Character,Integer>();
		  /*
		  char[] charArray = str.toCharArray();
		  for(int i= 0; i < charArray.length; i++ ) {
			if(map.containsKey(charArray[i]))  {
			   int value =  map.get(charArray[i]);
			    value++;
				map.put(charArray[i], value);
				if(map.get(charArray[i]) == 3) {
				   count += 1 ;
				  value -- ;
				  map.put(charArray[i], value);
				}
			}
			else{
				map.put(charArray[i], 1);
			}
		  }
		  */
		  for (int i = 0; i < str.length() - 2; i++) {
	            // Check if current character and next two characters are the same
	            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
	                count++;
	            }
	        }
		  
			return count;
		 
		 }

}
