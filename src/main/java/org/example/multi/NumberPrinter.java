/**
 * 
 */
package org.example.multi;

/**
 * 
 */
public class NumberPrinter {
    public static void main(String[] args) {
        final Object lock = new Object();
        final int[] currentNumber = {1};  // Shared state between threads

        // Thread1: Prints numbers from 1 to 100
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                synchronized (lock) {
                    System.out.println("Thread1: " + i);
                    currentNumber[0] = i;
                    lock.notify();  // Notify thread2
                    try {
                        lock.wait();  // Wait for thread2 to print a number
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            synchronized (lock) {
                lock.notify();  // Ensure thread2 exits when done
            }
        });

        // Thread2: Prints a number less than the number printed by thread1
        Thread thread2 = new Thread(() -> {
            int lastPrinted = 0;
            while (true) {
                synchronized (lock) {
                    try {
                        lock.wait();  // Wait for thread1 to print a number
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    
                    int number = currentNumber[0];
                    if (number > 1) {
                        System.out.println("Thread2: " + (number - 1));
                    } else {
                        break;  // Exit when there are no more numbers to print
                    }
                    lock.notify();  // Notify thread1
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

