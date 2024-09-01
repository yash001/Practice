/**
 * 
 */
package org.example.Recursion;

/**
 * 2. Problem: Factorial
Problem Description:
Given a non-negative integer n, calculate the factorial of n, denoted by n!.


Solutions :
Time Complexity   :  O(N)
Space Complexity  :  O(N)

Time Complexity:
The time complexity of the recursive factorial function is O(n).
This is because each call to factorial(n) results in exactly one recursive call: factorial(n-1).
There are n calls in total, from factorial(n) down to factorial(1).
Space Complexity:
The space complexity is also O(n).
This is because the function needs to maintain a call stack for each recursive call until the base case is reached.
The maximum depth of the recursion stack will be n, corresponding to the input n.

Summary:
Time Complexity: O(n) — Linear time, since the function makes one recursive call for each decrement from n to 1.
Space Complexity: O(n) — Linear space, due to the depth of the recursion tree.
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println("Factorial of given No. from 1 to 10 ");	
		for( int i = 0; i <= n; i ++) {
			System.out.print(" "+ calFactorialOfGivenNo(i)+" ");	
		}
	}

	private static Long calFactorialOfGivenNo(int n) {
		// TODO Auto-generated method stub
		//formula 
		//fact(n) = n * fact(n-1)
	    //termination condtion
		//fact(1) = 1
		// fact(0) = 1
		if(n == 0 || n == 1) return 1L;
		
		return n * calFactorialOfGivenNo(n-1);
	}

}
