/**
 * 
 */
package org.example.CollectionsAndJava8;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 */
public class SortingOfMapByValues {

	/**
	 * @param args
	 // Write a java program to sort Map By its Values 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("A", 10);
		map.put("B", 9);
		map.put("C", 8);
		map.put("D", 7);
		map.put("E", 6);
		
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		map1.put("E", 6);
		map1.put("D", 7);
		map1.put("C", 8);
		map1.put("B", 9);
		map1.put("A", 10);
		
		/*
		// Sorting using java7 features
		
		//1 Convert Map to to entrySet list
		List<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(map.entrySet());
		//2 Sort and compare values
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		//3. Create new LinkedHashMap and return that map
		
		Map<String,Integer> returnMap = new LinkedHashMap<String,Integer>();
		for(Entry<String, Integer> entry : list) {
			returnMap.put(entry.getKey(), entry.getValue());
			
		}
		System.out.println(" Sorted Map : "+ returnMap);
		*/
		
		/*
		// Sorting using java8 features
		// Comparing By Key
		Map<String,Integer> returnMap = map1.entrySet()
										.stream()
										.sorted(Map.Entry.comparingByKey())
										.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		//System.out.println(" Sorted Map : "+ returnMap);
		*/
		// Sorting using java8 features
		// Comparing By value in descending order
		
		Map<String,Integer> returnMap = map1.entrySet()
										.stream()
										.sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
										.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		System.out.println(" Sorted Map : "+ returnMap);
		
		//
		
	
	}

}
