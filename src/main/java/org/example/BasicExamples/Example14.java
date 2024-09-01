/**
 * 
 */
package org.example.BasicExamples;

/**
 * 
 */

public class Example14 {


	public static void swap(Integer a, Integer i) {
		Integer temp = new Integer(a);
		a =  i;
		i = temp;
		
	}
	
	public static void main(String[] args) {
		Integer a = new Integer(10);
		Integer i = new Integer(20);
		swap(a,i);
		System.out.println("a :" + a +", "+  "i : "+ i);
		// TODO Auto-generated method stub
		//sout
	}
	
}

