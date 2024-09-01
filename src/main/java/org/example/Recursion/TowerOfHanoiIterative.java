/**
 * 
 */
package org.example.Recursion;

/**
 * 
 */
import java.util.Stack;

public class TowerOfHanoiIterative {
    
    public static void main(String[] args) {
        int n = 3; // Number of disks
        solveHanoi(n, 'A', 'C', 'B');
    }

    // Method to solve Tower of Hanoi problem iteratively
    public static void solveHanoi(int n, char sourceRod, char targetRod, char auxiliaryRod) {
        Stack<Move> stack = new Stack<>();
        
        // Calculate total number of moves
        //int totalMoves = (int) Math.pow(2, n) - 1;
        
        // Initialize the stack with the first state
        stack.push(new Move(n, sourceRod, targetRod, auxiliaryRod, true));

        while (!stack.isEmpty()) {
            Move move = stack.pop();

            if (move.n == 1) {
                System.out.println("Disk 1 moved from " + move.sourceRod + " to " + move.targetRod);
            } else {
                // Push operations to the stack in reverse order
                if (move.isFirst) {
                    stack.push(new Move(move.n - 1, move.auxiliaryRod, move.targetRod, move.sourceRod, true));
                    stack.push(new Move(1, move.sourceRod, move.targetRod, move.auxiliaryRod, false));
                    stack.push(new Move(move.n - 1, move.sourceRod, move.auxiliaryRod, move.targetRod, true));
                } else {
                    System.out.println("Disk " + move.n + " moved from " + move.sourceRod + " to " + move.targetRod);
                }
            }
        }
    }

    // Class to represent a move in the Tower of Hanoi problem
    private static class Move {
        int n;
        char sourceRod;
        char targetRod;
        char auxiliaryRod;
        boolean isFirst;

        Move(int n, char sourceRod, char targetRod, char auxiliaryRod, boolean isFirst) {
            this.n = n;
            this.sourceRod = sourceRod;
            this.targetRod = targetRod;
            this.auxiliaryRod = auxiliaryRod;
            this.isFirst = isFirst;
        }
    }
}

