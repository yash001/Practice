/**
 * 
 */
package org.example.multi.blockingandunblockingqueue;

/**
 * 
 */
import java.util.concurrent.LinkedBlockingQueue;

public class MultipleConsumersExample {

    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Runnable producer = () -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Runnable consumer = () -> {
            try {
                while (true) {
                    Integer item = queue.take();
                    System.out.println(Thread.currentThread().getName() + " consumed: " + item);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        new Thread(producer).start();
        new Thread(consumer, "Consumer-1").start();
        new Thread(consumer, "Consumer-2").start();
    }
}

