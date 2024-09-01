/**
 * 
 */
package org.example.multi;

import java.util.concurrent.ForkJoinPool;
/**
 * 
 */
import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 10; // Threshold for splitting tasks
    private final int[] arr;
    private final int start, end;

    public SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int length = end - start;

        if (length <= THRESHOLD) {
            // If the task is small enough, compute directly
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
            return sum;
        } else {
            // Split the task into two smaller tasks
            int mid = start + (length / 2);

            SumTask leftTask = new SumTask(arr, start, mid);
            SumTask rightTask = new SumTask(arr, mid, end);

            // Fork the left task (execute it in parallel)
            leftTask.fork();

            // Compute the right task directly (could also fork and join later)
            int rightResult = rightTask.compute();

            // Join the left task (wait for it to finish and get the result)
            int leftResult = leftTask.join();

            // Combine the results of the two tasks
            return leftResult + rightResult;
        }
    }
}

public class ForkJoinExample {
    public static void main(String[] args) {
        // Create a large array of integers
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // Create a ForkJoinPool
        ForkJoinPool pool = new ForkJoinPool();

        // Create the main task to calculate the sum
        SumTask task = new SumTask(arr, 0, arr.length);

        // Invoke the task using the ForkJoinPool
        int sum = pool.invoke(task);

        System.out.println("Sum: " + sum); // Output should be 500500 (sum of 1 to 1000)
    }
}

