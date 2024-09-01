/**
 * 
 */
package org.example;

/**
 * 
 */
public class Program4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hey");
		
		
		//2 inpute
		dec(2);
		
	}

	private static void dec(int i) {
		// TODO Auto-generated method stub
		if(i >= 0) {
			dec(i-1);
		}
		System.out.println("num:"+i);
	}

}
