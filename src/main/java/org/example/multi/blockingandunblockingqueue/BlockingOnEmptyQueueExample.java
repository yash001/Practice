/**
 * 
 */
package org.example.multi.blockingandunblockingqueue;

/**
 * 
 */
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingOnEmptyQueueExample {

    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();

        Runnable consumer = () -> {
            try {
                System.out.println("Waiting to consume...");
                String item = queue.take();
                System.out.println("Consumed: " + item);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        new Thread(consumer).start();

        Thread.sleep(2000); // Simulate delay before producing
        queue.put("Hello, World!");
    }
}
