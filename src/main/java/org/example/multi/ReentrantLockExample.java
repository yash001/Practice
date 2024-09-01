/**
 * 
 */
package org.example.multi;

/**
 * What is a Reentrant Lock?
A Reentrant Lock is a type of lock provided in Java's java.util.concurrent.locks package that allows a thread to acquire the same lock multiple times without causing a deadlock. It is an alternative to the synchronized keyword for managing thread synchronization, offering more flexibility and additional features.

The term "reentrant" refers to the ability of the thread that holds the lock to re-acquire it without getting blocked. This is particularly useful in recursive methods, where the same lock may need to be acquired multiple times by the same thread.

Key Features of ReentrantLock
Explicit Locking and Unlocking:

Unlike the synchronized keyword, which automatically releases the lock when a block of code finishes execution, ReentrantLock requires explicit locking and unlocking using the lock() and unlock() methods.
Fairness Policy:

ReentrantLock can be configured to use a fairness policy. A fair lock ensures that threads acquire the lock in the order they requested it, reducing the chance of thread starvation.
By default, ReentrantLock is non-fair, meaning that there is no guarantee about the order in which threads will acquire the lock.
Interruptibility:

A thread waiting to acquire a ReentrantLock can be interrupted, allowing for more responsive and flexible multithreading. This is not possible with the synchronized keyword.
Try-Lock Mechanism:

ReentrantLock provides a tryLock() method, which attempts to acquire the lock without blocking. It returns immediately, either with the lock or without it, depending on whether it was available.
This is useful when you want to avoid indefinite blocking or when you need to perform other tasks if the lock is not available.
Condition Variables:

ReentrantLock supports multiple Condition objects, allowing threads to wait for specific conditions to be met before continuing execution. This is more powerful than the wait/notify mechanism provided by synchronized.
Implementing ReentrantLock in Java
Here’s how ReentrantLock can be implemented and used:

1. Basic Locking and Unlocking
 * 
 */
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void performTask() {
        lock.lock(); // Acquire the lock
        try {
            // Critical section of code
            System.out.println(Thread.currentThread().getName() + " is performing task");
        } finally {
            lock.unlock(); // Always release the lock in a finally block
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample example = new ReentrantLockExample();

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                example.performTask();
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();
    }
}

