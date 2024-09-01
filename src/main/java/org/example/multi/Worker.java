/**
 * 
 */
package org.example.multi;

import java.util.concurrent.CountDownLatch;

/**
 * 
 */
public class Worker implements Runnable {
    private CountDownLatch latch;

    public Worker(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            // Simulate work
            System.out.println(Thread.currentThread().getName() + " is working");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " has finished working");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown();  // Decrement the count of the latch
        }
    }
}

