/**
 * 
 */
package org.example.Recursion;

/**
 * 
 * We have three rods (A, B, and C) and N disks. Initially, all the disks are stacked in decreasing value of diameter (from bottom to top) i.e., the smallest disk is placed on the top and they are on rod A. 
The objective of the puzzle is to move the entire stack to another rod (here considered C), obeying the following simple rules: 

Only one disk can be moved at a time.
Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
No disk may be placed on top of a smaller disk.

Examples:

Input: 2
Output: Disk 1 moved from A to B - disk 1 = 10 cm, disk 2 = 20cm
Disk 2 moved from A to C    
Disk 1 moved from B to C

Input: 3
Output: Disk 1 moved from A to C
Disk 2 moved from A to B
Disk 1 moved from C to B
Disk 3 moved from A to C
Disk 1 moved from B to A
Disk 2 moved from B to C
Disk 1 moved from A to C

Solutions
Time Complexity :  O(N)
Space Complexity : O(N)

*/
public class TowerOfHanoi {

    public static void main(String[] args) {
        int n = 3; // Number of disks
        solveHanoi(n, 'A', 'C', 'B');
    }

    // Recursive function to solve the Tower of Hanoi puzzle
    public static void solveHanoi(int n, char sourceRod, char targetRod, char auxiliaryRod) {
        if (n == 1) {
            System.out.println("Disk 1 moved from " + sourceRod + " to " + targetRod);
            return;
        }

        // Move n-1 disks from sourceRod to auxiliaryRod using targetRod as auxiliary
        solveHanoi(n - 1, sourceRod, auxiliaryRod, targetRod);

        // Move the nth disk from sourceRod to targetRod
        System.out.println("Disk " + n + " moved from " + sourceRod + " to " + targetRod);

        // Move the n-1 disks from auxiliaryRod to targetRod using sourceRod as auxiliary
        solveHanoi(n - 1, auxiliaryRod, targetRod, sourceRod);
    }
}
