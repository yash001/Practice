/**
 * 
 */
package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 
 */
public class Program8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  Integer[] nums = {1,1,2}; 
			  Integer[] resArr = {null,null,null}; 
			  //output = [1,2,null]
			  
			  Set<Integer> set = new HashSet<Integer>();
			  
			  
			  for(Integer i : nums) { 

			       set.add(i); 
			  }
			  
			 
			  	int k = 0;
			   Iterator i = set.iterator();
			   while (i.hasNext()) { 
				  resArr[k++] = (Integer) i.next();
			 
			   }
			   System.out.println("size = "+set.size());
			   for(int j = 0 ; j < resArr.length; j++) { 

			       //set.add(i); 
				   
				   System.out.print(" "+ resArr[j]);
			  }
			  
			  
			   
			  
			  
			 

		
	}
	
	

}
