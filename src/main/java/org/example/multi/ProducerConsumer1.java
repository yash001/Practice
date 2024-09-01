package org.example.multi;


class SharedResource {
    private int value;
    private boolean produced = false;

    synchronized void produce(int value) throws InterruptedException {
        while (produced) {
            wait();
        }
        this.value = value;
        System.out.println("Produced: " + value);
        produced = true;
        notify();
    }

    synchronized int consume() throws InterruptedException {
        while (!produced) {
            wait();
        }
        System.out.println("Consumed: " + value);
        produced = false;
        notify();
        return value;
    }
}

class Producer implements Runnable {
    private final SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                resource.produce(i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private final SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                resource.consume();
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProducerConsumer1 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producer = new Thread(new Producer(resource));
        Thread consumer = new Thread(new Consumer(resource));

        producer.start();
        consumer.start();
    }
}
