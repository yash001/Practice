/**
 * 
 */
package org.example.multi;

/**
 * 
 */
import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) {
        final int numberOfThreads = 3;
        CountDownLatch latch = new CountDownLatch(numberOfThreads);

        // Thread 1
        new Thread(() -> {
            System.out.println("Thread 1 is performing its task...");
            try {
                Thread.sleep(1000); // Simulating work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 completed.");
            latch.countDown(); // Decrement the count of the latch
        }).start();

        // Thread 2
        new Thread(() -> {
            System.out.println("Thread 2 is performing its task...");
            try {
                Thread.sleep(2000); // Simulating work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 completed.");
            latch.countDown(); // Decrement the count of the latch
        }).start();

        // Thread 3
        new Thread(() -> {
            System.out.println("Thread 3 is performing its task...");
            try {
                Thread.sleep(3000); // Simulating work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 3 completed.");
            latch.countDown(); // Decrement the count of the latch
        }).start();

        // Main thread waits for the other threads
        try {
            System.out.println("Main thread waiting for other threads to complete...");
            latch.await(); // Wait until the count reaches zero
            System.out.println("All threads have completed. Main thread proceeds.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

