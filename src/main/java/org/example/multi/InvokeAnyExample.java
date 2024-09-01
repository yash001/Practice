/**
 * 
 */
package org.example.multi;

/**
 * 
 */
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class InvokeAnyExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = Arrays.asList(
            () -> {
                TimeUnit.SECONDS.sleep(2);
                return "Task 1 result";
            },
            () -> {
                TimeUnit.SECONDS.sleep(1);
                return "Task 2 result";
            },
            () -> "Task 3 result"
        );

        String result = executor.invokeAny(tasks); // Returns the result of the first completed task
        System.out.println("First completed task result: " + result);

        executor.shutdown();
    }
}
