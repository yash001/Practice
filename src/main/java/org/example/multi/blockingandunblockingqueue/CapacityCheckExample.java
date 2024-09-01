/**
 * 
 */
package org.example.multi.blockingandunblockingqueue;

/**
 * 
 */
import java.util.concurrent.LinkedBlockingQueue;

public class CapacityCheckExample {

    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(3);

        queue.put(1);
        queue.put(2);

        System.out.println("Remaining capacity: " + queue.remainingCapacity()); // Output should be 1
    }
}
