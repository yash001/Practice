/**
 * 
 */
package org.example.multi;

/**
 *1. Simple Task Execution
This example demonstrates how to execute multiple tasks concurrently using ExecutorService.
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleTaskExecution {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // Create a pool of 3 threads

        for (int i = 1; i <= 5; i++) {
            Runnable task = new Task(i);
            executor.execute(task); // Submit each task to the executor
        }

        executor.shutdown(); // Initiates an orderly shutdown of the executor
    }
}

class Task implements Runnable {
    private final int taskId;

    public Task(int id) {
        this.taskId = id;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
    }
}
