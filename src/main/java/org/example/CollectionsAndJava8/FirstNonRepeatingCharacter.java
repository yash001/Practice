/**
 * 
 */
package org.example.CollectionsAndJava8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 
 */
public class FirstNonRepeatingCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		String input = "swiss";
		 char resultChar = 'A' ;
		 Map<Character,Integer> map = new HashMap<Character, Integer>();
		 // using java7 features
		 List<Character> charList = input.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
				 								 
		 
		 //Collections.sort(charList);
		 
		 for(char c : charList) {
			
			 map.put (c,  map.getOrDefault(c,0) + 1);
			
		 }
		 
		 for(char c : charList) {
				
			 if(map.get(c) == 1) {
				 resultChar = c;
				 break;
			 }
		 }
		 
		 
		 
	    System.out.println(resultChar);
	    */
		/*
		 * Character firstNonRepeatingChar = input.chars() // Stream of int representing characters
            .mapToObj(c -> (char) c) // Convert int stream to Character stream
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Collect into a LinkedHashMap with character counts
            .entrySet().stream() // Convert the entrySet to a Stream
            .filter(entry -> entry.getValue() == 1) // Filter for entries with a count of 1
            .map(Map.Entry::getKey) // Get the character (key) from the entry
            .findFirst() // Find the first element in the stream
            .orElse(null); // Return null if no such element exists
		 */
		// Using Java8 features
		
		String input = "swiss";
		Character resultChar = input.chars().mapToObj(c -> (char) c)
				            .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				            .entrySet().stream()
				            .filter(entry -> entry.getValue () == 1)
				            .map(Map.Entry::getKey)
				            .findFirst()
				            .orElse(null);
		 System.out.println("First Non Repeatating Character = "+resultChar);
		
	}

}
