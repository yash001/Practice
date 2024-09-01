/**
 * 
 */
package org.example.multi;

/**
 * 
 */
import java.util.Arrays;
import java.util.List;

import java.util.Arrays;
import java.util.List;

public class SynchronousPrintNumbers {

	 public static void main(String[] args) {
	        // List of numbers from 1 to 10
	        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Shared lock object for synchronization
	        final Object lock = new Object();

	        // Thread 1: Prints numbers at odd indices (1, 3, 5,...)
	        Thread t1 = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                for (int i = 0; i < numbers.size(); i += 2) {
	                    synchronized (lock) {
	                        System.out.println("Thread 1: " + numbers.get(i));
	                        lock.notify(); // Notify the other thread to proceed
	                        try {
	                            if (i + 1 < numbers.size()) {
	                                lock.wait(); // Wait for the other thread to print
	                            }
	                        } catch (InterruptedException e) {
	                            e.printStackTrace();
	                        }
	                    }
	                }
	            }
	        });

	        // Thread 2: Prints numbers at even indices (2, 4, 6,...)
	        Thread t2 = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                for (int i = 1; i < numbers.size(); i += 2) {
	                    synchronized (lock) {
	                        System.out.println("Thread 2: " + numbers.get(i));
	                        lock.notify(); // Notify the other thread to proceed
	                        try {
	                            if (i + 1 < numbers.size()) {
	                                lock.wait(); // Wait for the other thread to print
	                            }
	                        } catch (InterruptedException e) {
	                            e.printStackTrace();
	                        }
	                    }
	                }
	            }
	        });

	        // Start both threads
	        t1.start();
	        t2.start();

	        // Wait for both threads to finish
	        try {
	            t1.join();
	            t2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Finished printing numbers 1 to 10.");
	    }
}
