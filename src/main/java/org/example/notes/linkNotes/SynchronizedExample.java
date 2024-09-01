/**
 * 
 */
package org.example.notes.linkNotes;

/**
 * 
 */
public class SynchronizedExample {
    private int count = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        count++;
    }

    // Synchronized method to get the current count
    public synchronized int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedExample example = new SynchronizedExample();

        // Create multiple threads that increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Print the final count (should be 2000)
        System.out.println("Final count: " + example.getCount());
    }
}

