/**
 * 
 */
package org.example.BasicExamples;

/**
 * 
 * 
 * Consecutive Ascending Numbers

Write a function that will return true if a given string (divided and grouped into a size) will contain a set of consecutive ascending numbers, otherwise, return false.

 

Examples

 

ascending("123124125") ➞ true

// Contains a set of consecutive ascending numbers

// if grouped into 3's : 123, 124, 125

 

ascending("101112131415") ➞ true

// Contains a set of consecutive ascending numbers

// if grouped into 2's : 10, 11, 12, 13, 14, 15

 

ascending("32332432536") ➞ false

// Regardless of the grouping size, the numbers can't be consecutive.

 

ascending("326325324323") ➞ false

// Though the numbers (if grouped into 3's) are consecutive but descending.

 

ascending("666667") ➞ true

// Consecutive numbers: 666 and 667.

 

Notes:

A number can consist of any number of digits, so long as the numbers are adjacent to each other, and the string has at least two of them.
 * 
 * 
 * 
 * ascending("123124125") ➞ true
 * pf = 3
 * iterate a no.
 * upcoming no is greter or equal to current no. then 
 * counter =  3
 *  counter --
 *  
 * 
 * 
 * 
 */
public class Program4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer[] input = new Integer[]{1,2,3,1,2,4,1,2,5};
		//Integer[] input = new Integer[]{3,2,3,3,2,4,3,2,5,3,6};
		//Integer[] input = new Integer[]{6,6,6,6,6,7};
		//Integer[] input = new Integer[]{6,5,1,6,5,2};
		//String[] input = new String[] {"6","5","1","6","5","2"};
		
		//Integer pf = 3;
		//Boolean result =  checkConsecutiveAscendingNumbers(input,pf);
		
		//System.out.println("result = "+result);
		//System.out.println(ascending("123124125")); // ➞ true
        //System.out.println(ascending("101112131415")); // ➞ true
        //System.out.println(ascending("32332432536")); // ➞ false
        //System.out.println(ascending("326325324323")); // ➞ false
        System.out.println(ascending("666667")); // ➞ true
		
	}
	
	public static boolean ascending(String s) {
        int n = s.length();

        // Iterate over all possible group sizes
        for (int size = 1; size <= n / 2; size++) {
            boolean valid = true;
            int previousNumber = Integer.parseInt(s.substring(0, size));

            // Iterate through the string in chunks of the current size
            for (int i = size; i < n; i += size) {
                if (i + size > n) {  // Ensure we don't go out of the string's bounds
                    valid = false;
                    break;
                }

                int currentNumber = Integer.parseInt(s.substring(i, i + size));

                // Check if the current number is exactly 1 greater than the previous number
                if (currentNumber != previousNumber + 1) {
                    valid = false;
                    break;
                }

                previousNumber = currentNumber;
            }

            // If a valid sequence is found, return true
            if (valid) {
                return true;
            }
        }

        // If no valid sequence is found, return false
        return false;
    }

	private static Boolean checkConsecutiveAscendingNumbers(String[] input, Integer pf) {
		// TODO Auto-generated method stub
		/*
		for(Integer i = 0 ; i < input.length ; i = i+3) {
			int counter = pf;
			for(Integer j = i + 1 ;  j < input.length - 3 ; j++) {
				if(input[j] >= input[j-1] && counter != 1) {
					counter --;
					continue;
				}else if(counter == 1) {
					break;
					
				}else {
					return false;
					}
					
			}
				
			
		}
		return true;
		*/
		
		for(Integer i = 0 ; i < input.length ; i = i+3) {
			
			//append in string
			// form new no.till partionfactor
			//iterate further and append in string
			// form new 2 new no.
			// compare 
			// store no2 in no1 
			// do this till end of all 
			
			//String Word = input.split(input)
			
			String word = "";
			for(Integer j = i ;  j < pf ; j++) {
				word = j+"";
			 	
			}
			
		
			
		}
		return true;
	}

}
