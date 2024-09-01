/**
 * 
 */
package org.example.Recursion;

/**
 1. Problem: Fibonacci Number
Problem Description:
The Fibonacci numbers are defined as follows:

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.

Given n, calculate F(n).

Solutions :
Time Complexity   :  O(2^N)
Space Complexity  :  O(N)

Time Complexity:
The time complexity of the recursive Fibonacci function is O(2^n).
This is because each call to fibonacci(n) results in two recursive calls: fibonacci(n-1) and fibonacci(n-2).
This results in a binary tree of height n, where each level has an exponential number of calls.
Specifically, the number of calls grows exponentially as the depth of the tree increases, leading to a time complexity of O(2^n).
Space Complexity:
The space complexity is determined by the maximum depth of the recursion tree, which is O(n).
This is because the function needs to maintain a call stack, and the maximum depth of the recursion stack will be n, corresponding to the input n.
Summary:
Time Complexity: O(2^n) — Exponential time, due to the overlapping subproblems and recomputation.
Space Complexity: O(n) — Linear space, due to the depth of the recursion tree.

*/
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println("Fibonnaci of given No. from 1 to 10 ");	
		for( int i = 0; i <= n; i ++) {
			System.out.print(" "+ calFibonacciOfGivenNo(i)+" ");	
		}
		
	}

	private static int calFibonacciOfGivenNo(int n) {
		// TODO Auto-generated method stub
		
		
		//formula fib(n) = fib(n-1) + fib(n-2);
		//termination condition
		//fib(0) = 0;
		//fib(1) = 1;
		if(n == 0 ) return 0;
		if(n == 1) return  1;
		
		return calFibonacciOfGivenNo(n-1) + calFibonacciOfGivenNo(n-2);
	}

}
