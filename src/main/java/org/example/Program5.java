/**
 * 
 */
package org.example;

/**
 * 
 */

@FunctionalInterface
interface Area {

  int cal(int r);

//int cal(Object object);
}


public class Program5 {

	/**
	 * @param args
	 */
	//Write a program using Java 8 Streams to find duplicate elements in a list of strings?
	
	public static void main(String[] args) {
		
		 //Area a ;
		 int r = 5 ;
		 Area a = ((ra) -> ra  * ra ) ;
		 
		int res = a.cal(r);
		 System.out.println(res);
		}
	

}
