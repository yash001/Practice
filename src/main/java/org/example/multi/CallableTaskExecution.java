/**
 * 
 */
package org.example.multi;

/**
 * 2. Using Callable with ExecutorService
This example shows how to use Callable to return results from tasks.
 */
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTaskExecution {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Future<Integer> futureResult1 = executor.submit(new SumTask1(10));
        Future<Integer> futureResult2 = executor.submit(new SumTask1(20));

        System.out.println("Sum from task 1: " + futureResult1.get());
        System.out.println("Sum from task 2: " + futureResult2.get());

        executor.shutdown();
    }
}

class SumTask1 implements Callable<Integer> {
    private final int number;

    public SumTask1(int number) {
        this.number = number;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
