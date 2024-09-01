/**
 * 
 */
package org.example.notes.linkNotes;

/**
 * Can you please explain along with a Java class as an example when to use volatile and when to use synchronization in multithreading in java ?
 
 https://stackoverflow.com/questions/8698285/when-to-use-volatile-vs-synchronization-in-multithreading-in-java?rq=3
Volatile only ensures the read operation always gives the latest state from memory across threads. However, it does not ensure any write safety / ordering of operations, i.e. two threads can update the volatile variable in any random order. Also it does not ensure that multiple operations on the variable are atomic.
However a synchronized block ensures the latest state and write safety. Also the access and update to variable is atomic inside a synchronized block. The above, however is true, only if all the access / updates to the variable in question are using the same lock object so that at no time multiple threads gets access to the variable

 For any thread using volatile or synchronized, the thread runs as follows


Explanation:
The running variable is declared as volatile, ensuring that any thread reading it will see the most recent value written by another thread.
When stopThread() is called, the running flag is set to false, and the change is immediately visible to the thread running in startThread(), causing the thread to stop.
Use volatile here because: The flag is simply being read and written, and there’s no need for atomicity or complex operations. The volatile keyword ensures visibility across threads.

 */
public class VolatileExample {
    // The flag is marked as volatile
    private volatile boolean running = true;

    public void startThread() {
        Thread t = new Thread(() -> {
            while (running) {
                // Perform some work
                System.out.println("Thread is running...");
            }
            System.out.println("Thread stopped.");
        });
        t.start();
    }

    public void stopThread() {
        running = false; // Change the flag to stop the thread
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample example = new VolatileExample();
        example.startThread();

        // Let the thread run for a while
        Thread.sleep(1000);

        // Now stop the thread
        example.stopThread();
    }
}

