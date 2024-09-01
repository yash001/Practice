/**
 * 
 */
package org.example.BasicExamples;

/**
 * 
 */
public class E1O1 {
    private static final int LIMIT = 10;
    private final Object lock = new Object();
    private int number = 1;

    public static void main(String[] args) {
        E1O1 printer = new E1O1();
        Thread evenThread = new Thread(printer.new EvenPrinter());
        Thread oddThread = new Thread(printer.new OddPrinter());

        evenThread.start();
        oddThread.start();
    }

    class EvenPrinter implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                while (number < LIMIT) {
                    while (number % 2 != 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println("Even: " + number);
                    number++;
                    lock.notify();
                }
            }
        }
    }

    class OddPrinter implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                while (number < LIMIT) {
                    while (number % 2 == 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println("Odd: " + number);
                    number++;
                    lock.notify();
                }
            }
        }
    }
}

