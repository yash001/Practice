package org.example.BasicExamples;

/*
 	
 */
public class Program9 {

    public static void main(String[] args) {
        int number = 324;
        int minNumber = findMinimumNumber(number);
        System.out.println("Minimum possible number: " + minNumber);
    }

    public static int findMinimumNumber(int number) {
        int[] digitCount = new int[10]; // Array to count occurrences of each digit
        
        // Count occurrences of each digit in the number
        while (number > 0) {
            int digit = number % 10;
            digitCount[digit]++;
            number /= 10;
        }
        
        // Construct the minimum number
        int minNumber = 0;
        boolean leadingZero = true; // Flag to skip leading zeros
        
        for (int i = 1; i < digitCount.length; i++) { // Start from digit 1 to avoid leading zero
            while (digitCount[i] > 0) {
                if (leadingZero && i > 0) {
                    leadingZero = false;
                }
                minNumber = minNumber * 10 + i;
                digitCount[i]--;
            }
        }
        
        return minNumber;
    }
}

