/**
 * 
 */
package org.example.Recursion;

/**
 * 
 */
public class PowerOfN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 5.00;
		int n  = 4;
		System.out.print("Sum of Digits of given No.: ");	
		
			System.out.print(" "+ calPower(x,n)+" ");
	}

	private static double calPower(double x, int n) {
		// TODO Auto-generated method stub
		if(n == 0) return (double) 1;
		return x * calPower(x,n-1);
	}

}
