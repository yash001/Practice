package org.example.BasicExamples;
// HeapFromStack
/*
import java.util.Stack;

	class Program10 {
   
		private Stack<Integer> stack;

    public Program10() {
        this.stack = new Stack<>();
    }

    // Insert element into the heap
    public void insert(int value) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty() && stack.peek() < value) {
            tempStack.push(stack.pop());
        }
        stack.push(value);
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    // Extract the maximum element from the heap
    public int extractMax() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        Stack<Integer> tempStack = new Stack<>();
        int max = stack.pop();
        while (!stack.isEmpty()) {
            int value = stack.pop();
            if (value > max) {
                tempStack.push(max);
                max = value;
            } else {
                tempStack.push(value);
            }
        }
        while (!tempStack.isEmpty()) {
            insert(tempStack.pop());
        }
        return max;
    }

    // Print the heap (stack)
    public void printHeap() {
        System.out.println("Heap: " + stack);
    }

    public static void main(String[] args) {
    	Program10 heap = new Program10();
        heap.insert(10);
        heap.insert(4);
        heap.insert(15);
        heap.insert(20);
        heap.insert(8);

        System.out.println("Initial heap:");
        heap.printHeap();

        System.out.println("Extracted max: " + heap.extractMax());
        System.out.println("Heap after extraction:");
        heap.printHeap();

        System.out.println("Extracted max: " + heap.extractMax());
        System.out.println("Heap after extraction:");
        heap.printHeap();
    }
}
*/

