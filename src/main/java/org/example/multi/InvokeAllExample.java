/**
 * 
 */
package org.example.multi;

/**
 * 
 * 4. Executing Multiple Tasks and Waiting for Completion
This example demonstrates how to wait for all tasks to complete using invokeAll().

 */
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class InvokeAllExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = Arrays.asList(
            () -> "Task 1 result",
            () -> "Task 2 result",
            () -> "Task 3 result"
        );

        executor.invokeAll(tasks)
                .forEach(future -> {
                    try {
                        System.out.println(future.get());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
    }
}

