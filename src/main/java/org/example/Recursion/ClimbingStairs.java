/**
 * 
 */
package org.example.Recursion;

/**
 * 10. Problem: Climbing Stairs
Problem Description:
You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Solutions:
Time Complexity  : O(2^N)
Space Complexity : O(N)	

Time Complexity:
The time complexity of the recursive climbStairs function is O(2^n).
This is because the function makes two recursive calls for each non-base case, leading to an exponential number of calls as n increases. Each call generates two more calls, resulting in a binary tree of calls.
Space Complexity:
The space complexity is O(n).
This is due to the recursion call stack, which has a maximum depth of n. Each call adds a frame to the stack, so the space used by the call stack is proportional to the height of the recursion tree.

 */
public class ClimbingStairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println("Different ways for climbing stairs for N ");	
		
			System.out.print(" "+ climbingStairs(n)+" ");	
		
		
	}

	private static int climbingStairs(int n) {
		// TODO Auto-generated method stub
		
		
		//formula fib(n) = fib(n-1) + fib(n-2);
		//termination condition
		//fib(0) = 0;
		//fib(1) = 1;
		//fib(2) = 1;
		//if(n <=2) return n;
		if(n  == 1) return n;
		if(n  == 2) return n;
		
		return climbingStairs(n-1) + climbingStairs(n-2);
	}

}
