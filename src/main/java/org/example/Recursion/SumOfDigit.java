/**
 * 
 */
package org.example.Recursion;

/**
 * 3. Problem: Sum of Digits
Problem Description:
Given a non-negative integer, find the sum of its digits.


Solutions :
Time Complexity   :  O(d)
Space Complexity  :  O(d)

Time Complexity:
The time complexity of the sumOfDigits function is O(d), where d is the number of digits in the integer n.
The function processes each digit exactly once. Since the number of digits in n is d = log₁₀(n) + 1, we can say that the time complexity is proportional to the number of digits, which simplifies to O(d).
Space Complexity:
The space complexity is also O(d).
This is because each recursive call adds a new frame to the call stack. The maximum depth of the recursion stack will be equal to the number of digits in n, which is d.
Summary:
Time Complexity: O(d) — Linear time, where d is the number of digits in the input number n.
Space Complexity: O(d) — Linear space, due to the depth of the recursion stack, which is proportional to the number of digits in n.

 */
public class SumOfDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 54321;
		System.out.print("Sum of Digits of given No.: ");	
		
			System.out.print(" "+ calSumOfDigitOfGivenNo(n)+" ");	
		
	}

	private static int calSumOfDigitOfGivenNo(int n) {
		// TODO Auto-generated method stub
		//n = 54321
	    //formula = d +d +d ...
		// termination
		//if no ==  0 then return 
		//else no = no /10 
		// d += no
		if(n == 0) return 0;
	    
		return n % 10 + calSumOfDigitOfGivenNo(n/10);
	}

}
