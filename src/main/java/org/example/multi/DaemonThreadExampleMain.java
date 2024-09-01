/**
 * 
 */
package org.example.multi;

/**
 * 
 */
class DaemonThreadExample implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Daemon thread is running in the background...");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}

public class DaemonThreadExampleMain {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(new DaemonThreadExample());
        daemonThread.setDaemon(true);  // Mark this thread as a daemon thread
        daemonThread.start();

        // Main thread sleeps for 2 seconds before ending
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main thread ending, JVM will now exit...");
    }
}

