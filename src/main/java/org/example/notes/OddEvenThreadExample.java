/**
 * 
 */
package org.example.notes;

/**
 * Print 1 to 10 from List using 2 threads
 */
import java.util.Arrays;
import java.util.List;

class NumberPrinter {
    private final List<Integer> numbers;
    private int index = 0;

    public NumberPrinter(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void printOdd() {
        synchronized (this) {
            while (index < numbers.size()) {
                if (numbers.get(index) % 2 == 0) {
                    try {
                        wait(); // Wait for even numbers to be printed
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                } else {
                    System.out.println("Odd: " + numbers.get(index));
                    index++;
                    notify(); // Notify the even thread to proceed
                }
            }
        }
    }

    public void printEven() {
         synchronized (this) {
            while (index < numbers.size()) {
                if (numbers.get(index) % 2 != 0) {
                    try {
                        wait(); // Wait for odd numbers to be printed
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                } else {
                    System.out.println("Even: " + numbers.get(index));
                    index++;
                    notify(); // Notify the odd thread to proceed
                }
            }
        }
    }
}

public class OddEvenThreadExample {
    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final NumberPrinter numberPrinter = new NumberPrinter(numbers);

        // Thread for printing odd numbers
        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                numberPrinter.printOdd();
            }
        });

        // Thread for printing even numbers
        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                numberPrinter.printEven();
            }
        });

        oddThread.start();
        evenThread.start();
    }
}